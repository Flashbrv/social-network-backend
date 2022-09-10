package com.example.backend.mapper;


import com.example.backend.entity.UserEntity;
import com.example.backend.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class UserMapper {
    @Mappings({
            @Mapping(source = "photoSmall", target = "avaPath")
    })
    public abstract User toModel(UserEntity entity);

    @Mappings({
            @Mapping(source = "avaPath", target = "photoSmall")
    })
    public abstract UserEntity toEntity(User user);
}
