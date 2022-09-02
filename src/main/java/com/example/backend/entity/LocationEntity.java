package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="sn_locations")
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne()
    private UserEntity user;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationEntity that = (LocationEntity) o;
        return id == that.id && user.equals(that.user) && city.equals(that.city) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, city, country);
    }

    @Override
    public String toString() {
        return "LocationEntity{" +
                "id=" + id +
                ", user=" + user +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
