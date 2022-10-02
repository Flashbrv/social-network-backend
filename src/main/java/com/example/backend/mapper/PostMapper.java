package com.example.backend.mapper;

import com.example.backend.dto.PostDto;
import com.example.backend.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class PostMapper {

    @Mappings({
            @Mapping(source = "text", target = "message")
    })
    public abstract PostDto toModel(Post post);

    @Mappings({
            @Mapping(source = "message", target = "text")
    })
    public abstract Post toEntity(PostDto postDto);
}
