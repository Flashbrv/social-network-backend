package com.example.backend.mapper;

import com.example.backend.dto.UserProfileDto;
import com.example.backend.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class UserProfileMapper {
    @Mappings({
            @Mapping(source = "github", target = "contacts.github"),
            @Mapping(source = "facebook", target = "contacts.facebook"),
            @Mapping(source = "instagram", target = "contacts.instagram"),
            @Mapping(source = "twitter", target = "contacts.twitter"),
            @Mapping(source = "website", target = "contacts.website"),
            @Mapping(source = "youtube", target = "contacts.youtube"),
            @Mapping(source = "linkedIn", target = "contacts.linkedIn"),
            @Mapping(source = "photoSmall", target = "photos.small"),
            @Mapping(source = "photoLarge", target = "photos.large")
    })
    public abstract UserProfileDto toModel(User entity);

}
