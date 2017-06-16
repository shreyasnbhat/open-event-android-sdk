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
        "holder",
        "holder-url",
        "licence",
        "licence-url",
        "logo",
        "year"
})
public class Copyright {

    @JsonProperty("holder")
    private String holder;
    @JsonProperty("holder-url")
    private String holderUrl;
    @JsonProperty("licence")
    private String licence;
    @JsonProperty("licence-url")
    private String licenceUrl;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("year")
    private int year;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("holder")
    public String getHolder() {
        return holder;
    }

    @JsonProperty("holder")
    public void setHolder(String holder) {
        this.holder = holder;
    }

    @JsonProperty("holder-url")
    public String getHolderUrl() {
        return holderUrl;
    }

    @JsonProperty("holder-url")
    public void setHolderUrl(String holderUrl) {
        this.holderUrl = holderUrl;
    }

    @JsonProperty("licence")
    public String getLicence() {
        return licence;
    }

    @JsonProperty("licence")
    public void setLicence(String licence) {
        this.licence = licence;
    }

    @JsonProperty("licence-url")
    public String getLicenceUrl() {
        return licenceUrl;
    }

    @JsonProperty("licence-url")
    public void setLicenceUrl(String licenceUrl) {
        this.licenceUrl = licenceUrl;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("year")
    public int getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(int year) {
        this.year = year;
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
        return "Copyright{" +
                "holder='" + holder + '\'' +
                ", holderUrl='" + holderUrl + '\'' +
                ", licence='" + licence + '\'' +
                ", licenceUrl='" + licenceUrl + '\'' +
                ", logo='" + logo + '\'' +
                ", year=" + year +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}