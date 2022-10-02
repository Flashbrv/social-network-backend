package com.example.backend.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="sn_posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "text")
    private String text;

    @Column(name = "likes")
    private int likes;

    @Column(name = "user_id")
    private Long userId;
}
