package com.example.backend.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="sn_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;

    @Column(name = "about_text", length = 255, nullable = true)
    private String aboutText;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Location location;

    @Column(name = "looking_for_job")
    private boolean lookingForAJob;
    @Column(name = "looking_for_job_desc", length = 255, nullable = true)
    private String lookingForAJobDescription;
    @Column(name = "github", length = 2048, nullable = true)
    private String github;
    @Column(name = "facebook", length = 2048, nullable = true)
    private String facebook;
    @Column(name = "instagram", length = 2048, nullable = true)
    private String instagram;
    @Column(name = "twitter", length = 2048, nullable = true)
    private String twitter;
    @Column(name = "website", length = 2048, nullable = true)
    private String website;
    @Column(name = "youtube", length = 2048, nullable = true)
    private String youtube;
    @Column(name = "linkedin", length = 2048, nullable = true)
    private String linkedIn;
    @Column(name = "photo_small", length = 2048, nullable = true)
    private String photoSmall;
    @Column(name = "photo_large", length = 2048, nullable = true)
    private String photoLarge;
}
