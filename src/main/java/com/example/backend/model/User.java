package com.example.backend.model;

public class User {
    private long id;
    private String fullName;
    private String aboutText;

    private String avaPath;

    private Location location;
    private boolean followed;

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public String getAvaPath() {
        return avaPath;
    }

    public void setAvaPath(String avaPath) {
        this.avaPath = avaPath;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
}
