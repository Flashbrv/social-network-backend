package com.example.backend.dto;

import lombok.ToString;

@ToString
public class PostDto {
    public long id;
    public String message;
    public int likes;
}
