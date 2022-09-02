package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="sn_users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;

    @Column(name = "about_text", length = 150, nullable = false)
    private String aboutText;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private LocationEntity location;

    public UserEntity() {
    }

    public UserEntity(String fullName, String aboutText) {
        this.fullName = fullName;
        this.aboutText = aboutText;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAboutText() {
        return aboutText;
    }

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && fullName.equals(that.fullName) && aboutText.equals(that.aboutText) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, aboutText, location);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", aboutText='" + aboutText + '\'' +
                ", location=" + location +
                '}';
    }
}
