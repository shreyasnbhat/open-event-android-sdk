package openevent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "email",
        "mobile",
        "photo",
        "organisation",
        "position",
        "country",
        "short_biography",
        "long_biography",
        "speaking_experience",
        "website",
        "twitter",
        "facebook",
        "github",
        "linkedin",
        "featured",
        "sessions"
})
public class Speaker {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("photo")
    private String imageUrl;
    @JsonProperty("organisation")
    private String organisation;
    @JsonProperty("position")
    private String position;
    @JsonProperty("country")
    private String country;
    @JsonProperty("short_biography")
    private String shortBiography;
    @JsonProperty("long_biography")
    private String longBiography;
    @JsonProperty("speaking_experience")
    private String speakingExperience;
    @JsonProperty("website")
    private String websiteUrl;
    @JsonProperty("twitter")
    private String twitterUrl;
    @JsonProperty("facebook")
    private String fbUrl;
    @JsonProperty("github")
    private String githubUrl;
    @JsonProperty("linkedin")
    private String linkedinUrl;
    @JsonProperty("featured")
    private boolean isFeatured;
    @JsonProperty("sessions")
    private List<Session> sessions;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("photo")
    public String getPhoto() {
        return imageUrl;
    }

    @JsonProperty("photo")
    public void setPhoto(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("organisation")
    public String getOrganisation() {
        return organisation;
    }

    @JsonProperty("organisation")
    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("short_biography")
    public String getShortBiography() {
        return shortBiography;
    }

    @JsonProperty("short_biography")
    public void setShortBiography(String shortBiography) {
        this.shortBiography = shortBiography;
    }

    @JsonProperty("long_biography")
    public String getLongBiography() {
        return longBiography;
    }

    @JsonProperty("long_biography")
    public void setLongBiography(String longBiography) {
        this.longBiography = longBiography;
    }

    @JsonProperty("speaking_experience")
    public String getSpeakingExperience() {
        return speakingExperience;
    }

    @JsonProperty("speaking_experience")
    public void setSpeakingExperience(String speakingExperience) {
        this.speakingExperience = speakingExperience;
    }

    @JsonProperty("website")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("website")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @JsonProperty("twitter")
    public String getTwitterUrl() {
        return twitterUrl;
    }

    @JsonProperty("twitter")
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @JsonProperty("facebook")
    public String getFbUrl() {
        return fbUrl;
    }

    @JsonProperty("facebook")
    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

    @JsonProperty("github")
    public String getGithubUrl() {
        return githubUrl;
    }

    @JsonProperty("github")
    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    @JsonProperty("linkedin")
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    @JsonProperty("linkedin")
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    @JsonProperty("featured")
    public boolean getFeatured() {
        return isFeatured;
    }

    @JsonProperty("featured")
    public void setFeatured(boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", organisation='" + organisation + '\'' +
                ", position='" + position + '\'' +
                ", country='" + country + '\'' +
                ", shortBiography='" + shortBiography + '\'' +
                ", longBiography='" + longBiography + '\'' +
                ", speakingExperience='" + speakingExperience + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                ", fbUrl='" + fbUrl + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                ", linkedinUrl='" + linkedinUrl + '\'' +
                ", isFeatured=" + isFeatured +
                ", sessions=" + sessions +
                '}';
    }
}
