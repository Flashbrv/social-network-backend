package com.example.backend.repository.mapper;

import com.example.backend.dto.LocationDto;
import com.example.backend.dto.UserDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<UserDto> {
    @Override
    public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserDto user = new UserDto();
        user.id = rs.getLong("id");
        user.fullName = rs.getString("full_name");
        user.aboutText = rs.getString("about_text");
        user.avaPath = rs.getString("photo_small");
        user.followed = rs.getBoolean("followed");

        LocationDto location = new LocationDto();
        location.city = rs.getString("city");
        location.country = rs.getString("country");
        user.location = location;

        return user;
    }
}
