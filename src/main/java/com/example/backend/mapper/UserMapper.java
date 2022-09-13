package com.example.backend.mapper;


import com.example.backend.dto.UserDto;
import com.example.backend.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class UserMapper {
    @Mappings({
            @Mapping(source = "photoSmall", target = "avaPath")
    })
    public abstract UserDto toModel(User entity);

    @Mappings({
            @Mapping(source = "avaPath", target = "photoSmall")
    })
    public abstract User toEntity(UserDto userDto);
}
