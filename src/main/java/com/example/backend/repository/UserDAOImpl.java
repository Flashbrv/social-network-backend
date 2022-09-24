package com.example.backend.repository;

import com.example.backend.dto.UserDto;
import com.example.backend.repository.mapper.UserRowMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    private final JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_ALL_USER_FOR_CURRENT_USER =
            "select * from " +
            "    (select " +
            "        sn_users.id," +
            "        full_name," +
            "        about_text," +
            "        photo_small," +
            "        city," +
            "        country," +
            "        if(followed_user_id is null, false, true) followed" +
            "    from sn_followers " +
            "    right join sn_users" +
            "    on sn_users.id=sn_followers.followed_user_id and sn_followers.user_id=?" +
            "    left join sn_locations" +
            "    on sn_users.id=sn_locations.user_id) as follow " +
            "where follow.id!=? " +
            "ORDER BY full_name ASC " +
            "LIMIT ? OFFSET ?";

    private final String SQL_FOLLOW_USER = "INSERT INTO sn_followers (user_id, followed_user_id) VALUES (?, ?)";
    private final String SQL_UNFOLLOW_USER = "DELETE FROM sn_followers WHERE user_id=? AND followed_user_id=?";
    private final String SQL_IS_USER_FOLLOWED = "SELECT followed_user_id FROM sn_followers WHERE user_id=?";

    public UserDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private int count() {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM sn_users", Integer.class)-1;
    }

    @Override
    public Page<UserDto> getAllForUser(Long userId, Pageable page) {
        List<UserDto> users = jdbcTemplate.query(SQL_FIND_ALL_USER_FOR_CURRENT_USER,
                new UserRowMapper(),
                new Object[] { userId, userId, page.getPageSize(), page.getOffset() });
        return new PageImpl<UserDto>(users, page, count());
    }

    @Override
    public boolean isFollowed(Long currentUserId, Long followedUserId) {
        List<Long> followedUsersIds = jdbcTemplate.query(SQL_IS_USER_FOLLOWED,
                (rs, rowNum) -> rs.getLong("followed_user_id"),
                new Object[] { currentUserId });
        return followedUsersIds
                .stream()
                .anyMatch(id -> id.compareTo(followedUserId) == 0);
    }

    @Override
    public int follow(Long currentUserId, Long followedUserId) {
        return jdbcTemplate.update(SQL_FOLLOW_USER, currentUserId, followedUserId);
    }

    @Override
    public int unfollow(Long currentUserId, Long followedUserId) {
        return jdbcTemplate.update(SQL_UNFOLLOW_USER, currentUserId, followedUserId);
    }
}
