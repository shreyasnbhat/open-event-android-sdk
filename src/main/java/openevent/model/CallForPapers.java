package openevent.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "announcement",
        "starts-at",
        "privacy",
        "ends-at"
})
public class CallForPapers {

    @JsonProperty("announcement")
    private String announcement;
    @JsonProperty("starts-at")
    private String startsAt;
    @JsonProperty("privacy")
    private String privacy;
    @JsonProperty("ends-at")
    private String endsAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("announcement")
    public String getAnnouncement() {
        return announcement;
    }

    @JsonProperty("announcement")
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    @JsonProperty("starts-at")
    public String getStartsAt() {
        return startsAt;
    }

    @JsonProperty("starts-at")
    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    @JsonProperty("privacy")
    public String getPrivacy() {
        return privacy;
    }

    @JsonProperty("privacy")
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @JsonProperty("ends-at")
    public String getEndsAt() {
        return endsAt;
    }

    @JsonProperty("ends-at")
    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
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
        return "CallForPapers{" +
                "announcement='" + announcement + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", privacy='" + privacy + '\'' +
                ", endsAt='" + endsAt + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}