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

    public boolean isLookingForAJob() {
        return lookingForAJob;
    }

    public void setLookingForAJob(boolean lookingForAJob) {
        this.lookingForAJob = lookingForAJob;
    }

    public String getLookingForAJobDescription() {
        return lookingForAJobDescription;
    }

    public void setLookingForAJobDescription(String lookingForAJobDescription) {
        this.lookingForAJobDescription = lookingForAJobDescription;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getPhotoSmall() {
        return photoSmall;
    }

    public void setPhotoSmall(String photoSmall) {
        this.photoSmall = photoSmall;
    }

    public String getPhotoLarge() {
        return photoLarge;
    }

    public void setPhotoLarge(String photoLarge) {
        this.photoLarge = photoLarge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                lookingForAJob == that.lookingForAJob &&
                fullName.equals(that.fullName) &&
                aboutText.equals(that.aboutText) &&
                location.equals(that.location) &&
                Objects.equals(lookingForAJobDescription, that.lookingForAJobDescription) &&
                Objects.equals(github, that.github) &&
                Objects.equals(facebook, that.facebook) &&
                Objects.equals(instagram, that.instagram) &&
                Objects.equals(twitter, that.twitter) &&
                Objects.equals(website, that.website) &&
                Objects.equals(youtube, that.youtube) &&
                Objects.equals(linkedIn, that.linkedIn) &&
                Objects.equals(photoSmall, that.photoSmall) &&
                Objects.equals(photoLarge, that.photoLarge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                fullName,
                aboutText,
                location,
                lookingForAJob,
                lookingForAJobDescription,
                github,
                facebook,
                instagram,
                twitter,
                website,
                youtube,
                linkedIn,
                photoSmall,
                photoLarge);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", aboutText='" + aboutText + '\'' +
                ", location=" + location +
                ", lookingForAJob=" + lookingForAJob +
                ", lookingForAJobDescription='" + lookingForAJobDescription + '\'' +
                ", github='" + github + '\'' +
                ", facebook='" + facebook + '\'' +
                ", instagram='" + instagram + '\'' +
                ", twitter='" + twitter + '\'' +
                ", website='" + website + '\'' +
                ", youtube='" + youtube + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", photoSmall='" + photoSmall + '\'' +
                ", photoLarge='" + photoLarge + '\'' +
                '}';
    }
}
