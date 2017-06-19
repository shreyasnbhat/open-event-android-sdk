package openevent.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "identifier",
        "name",
        "latitude",
        "longitude",
        "location-name",
        "starts-at",
        "ends-at",
        "timezone",
        "description",
        "logo-url",
        "organizer-name",
        "organizer-description",
        "social-links",
        "ticket-url",
        "privacy",
        "type",
        "topic",
        "sub-topic",
        "code-of-conduct",
        "copyright",
        "call-for-papers",
        "email",
        "has-session-speakers",
        "schedule-published-on",
        "searchable-location-name",
        "state"
})
public class Event {

    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("name")
    private String name;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("location-name")
    private String locationName;
    @JsonProperty("starts-at")
    private String startsAt;
    @JsonProperty("ends-at")
    private String endsAt;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("description")
    private String description;
    @JsonProperty("logo-url")
    private String logoUrl;
    @JsonProperty("organizer-name")
    private String organizerName;
    @JsonProperty("organizer-description")
    private String organizerDescription;
    @JsonProperty("social-links")
    private List<SocialLink> socialLinks = null;
    @JsonProperty("ticket-url")
    private String ticketUrl;
    @JsonProperty("privacy")
    private String privacy;
    @JsonProperty("type")
    private String type;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("sub-topic")
    private Object subTopic;
    @JsonProperty("code-of-conduct")
    private Object codeOfConduct;
    @JsonProperty("copyright")
    private Copyright copyright;
    @JsonProperty("call-for-papers")
    private CallForPapers callForPapers;
    @JsonProperty("email")
    private String email;
    @JsonProperty("has-session-speakers")
    private boolean hasSessionSpeakers;
    @JsonProperty("schedule-published-on")
    private String schedulePublishedOn;
    @JsonProperty("searchable-location-name")
    private Object searchableLocationName;
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("location-name")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("location-name")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @JsonProperty("starts-at")
    public String getStartsAt() {
        return startsAt;
    }

    @JsonProperty("starts-at")
    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    @JsonProperty("ends-at")
    public String getEndsAt() {
        return endsAt;
    }

    @JsonProperty("ends-at")
    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("logo-url")
    public String getLogoUrl() {
        return logoUrl;
    }

    @JsonProperty("logo-url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @JsonProperty("organizer-name")
    public String getOrganizerName() {
        return organizerName;
    }

    @JsonProperty("organizer-name")
    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    @JsonProperty("organizer-description")
    public String getOrganizerDescription() {
        return organizerDescription;
    }

    @JsonProperty("organizer-description")
    public void setOrganizerDescription(String organizerDescription) {
        this.organizerDescription = organizerDescription;
    }

    @JsonProperty("social-links")
    public List<SocialLink> getSocialLinks() {
        return socialLinks;
    }

    @JsonProperty("social-links")
    public void setSocialLinks(List<SocialLink> socialLinks) {
        this.socialLinks = socialLinks;
    }

    @JsonProperty("ticket-url")
    public String getTicketUrl() {
        return ticketUrl;
    }

    @JsonProperty("ticket-url")
    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    @JsonProperty("privacy")
    public String getPrivacy() {
        return privacy;
    }

    @JsonProperty("privacy")
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @JsonProperty("sub-topic")
    public Object getSubTopic() {
        return subTopic;
    }

    @JsonProperty("sub-topic")
    public void setSubTopic(Object subTopic) {
        this.subTopic = subTopic;
    }

    @JsonProperty("code-of-conduct")
    public Object getCodeOfConduct() {
        return codeOfConduct;
    }

    @JsonProperty("code-of-conduct")
    public void setCodeOfConduct(Object codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    @JsonProperty("copyright")
    public Copyright getCopyright() {
        return copyright;
    }

    @JsonProperty("copyright")
    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    @JsonProperty("call-for-papers")
    public CallForPapers getCallForPapers() {
        return callForPapers;
    }

    @JsonProperty("call-for-papers")
    public void setCallForPapers(CallForPapers callForPapers) {
        this.callForPapers = callForPapers;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("has-session-speakers")
    public boolean isHasSessionSpeakers() {
        return hasSessionSpeakers;
    }

    @JsonProperty("has-session-speakers")
    public void setHasSessionSpeakers(boolean hasSessionSpeakers) {
        this.hasSessionSpeakers = hasSessionSpeakers;
    }

    @JsonProperty("schedule-published-on")
    public String getSchedulePublishedOn() {
        return schedulePublishedOn;
    }

    @JsonProperty("schedule-published-on")
    public void setSchedulePublishedOn(String schedulePublishedOn) {
        this.schedulePublishedOn = schedulePublishedOn;
    }

    @JsonProperty("searchable-location-name")
    public Object getSearchableLocationName() {
        return searchableLocationName;
    }

    @JsonProperty("searchable-location-name")
    public void setSearchableLocationName(Object searchableLocationName) {
        this.searchableLocationName = searchableLocationName;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Event{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", locationName='" + locationName + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", endsAt='" + endsAt + '\'' +
                ", timezone='" + timezone + '\'' +
                ", description='" + description + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", organizerName='" + organizerName + '\'' +
                ", organizerDescription='" + organizerDescription + '\'' +
                ", socialLinks=" + socialLinks +
                ", ticketUrl='" + ticketUrl + '\'' +
                ", privacy='" + privacy + '\'' +
                ", type='" + type + '\'' +
                ", topic='" + topic + '\'' +
                ", subTopic=" + subTopic +
                ", codeOfConduct=" + codeOfConduct +
                ", copyright=" + copyright +
                ", callForPapers=" + callForPapers +
                ", email='" + email + '\'' +
                ", hasSessionSpeakers=" + hasSessionSpeakers +
                ", schedulePublishedOn='" + schedulePublishedOn + '\'' +
                ", searchableLocationName=" + searchableLocationName +
                ", state='" + state + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}