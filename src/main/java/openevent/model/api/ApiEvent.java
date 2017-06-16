package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

import java.util.HashMap;
import java.util.Map;

@Type("event")
public class ApiEvent {

    @Id
    private String id;
    @JsonProperty("payment-country")
    private String paymentCountry;
    @JsonProperty("paypal-email")
    private String paypalEmail;
    @JsonProperty("code-of-conduct")
    private String codeOfConduct;
    @JsonProperty("pay-by-bank")
    private boolean payByBank;
    @JsonProperty("schedule-published-on")
    private String schedulePublishedOn;
    @JsonProperty("payment-currency")
    private String paymentCurrency;
    @JsonProperty("organizer-description")
    private String organizerDescription;
    @JsonProperty("xcal-url")
    private String xcalUrl;
    @JsonProperty("original-image-url")
    private String originalImageUrl;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("onsite-details")
    private String onsiteDetails;
    @JsonProperty("organizer-name")
    private String organizerName;
    @JsonProperty("large-image-url")
    private String largeImageUrl;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("deleted-at")
    private String deletedAt;
    @JsonProperty("ticket-url")
    private String ticketUrl;
    @JsonProperty("pay-by-stripe")
    private boolean payByStripe;
    @JsonProperty("location-name")
    private String locationName;
    @JsonProperty("privacy")
    private String privacy;
    @JsonProperty("state")
    private String state;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("tax-allow")
    private boolean taxAllow;
    @JsonProperty("pay-onsite")
    private boolean payOnsite;
    @JsonProperty("type")
    private String type;
    @JsonProperty("email")
    private String email;
    @JsonProperty("starts-at")
    private String startsAt;
    @JsonProperty("searchable-location-name")
    private String searchableLocationName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("pentabarf-url")
    private String pentabarfUrl;
    @JsonProperty("logo-url")
    private String logoUrl;
    @JsonProperty("ticket-include")
    private boolean ticketInclude;
    @JsonProperty("event-url")
    private String eventUrl;
    @JsonProperty("ical-url")
    private String icalUrl;
    @JsonProperty("pay-by-paypal")
    private boolean payByPaypal;
    @JsonProperty("show-map")
    private int showMap;
    @JsonProperty("sponsors-enabled")
    private boolean sponsorsEnabled;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sub-topic")
    private String subTopic;
    @JsonProperty("icon-image-url")
    private String iconImageUrl;
    @JsonProperty("thumbnail-image-url")
    private String thumbnailImageUrl;
    @JsonProperty("created-at")
    private String createdAt;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("pay-by-cheque")
    private boolean payByCheque;
    @JsonProperty("bank-details")
    private String bankDetails;
    @JsonProperty("cheque-details")
    private String chequeDetails;
    @JsonProperty("has-session-speakers")
    private boolean hasSessionSpeakers;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("ends-at")
    private String endsAt;
    @JsonIgnore
    private Map<String, String> additionalProperties = new HashMap<>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("payment-country")
    public String getPaymentCountry() {
        return paymentCountry;
    }

    @JsonProperty("payment-country")
    public void setPaymentCountry(String paymentCountry) {
        this.paymentCountry = paymentCountry;
    }

    @JsonProperty("paypal-email")
    public String getPaypalEmail() {
        return paypalEmail;
    }

    @JsonProperty("paypal-email")
    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    @JsonProperty("code-of-conduct")
    public String getCodeOfConduct() {
        return codeOfConduct;
    }

    @JsonProperty("code-of-conduct")
    public void setCodeOfConduct(String codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    @JsonProperty("pay-by-bank")
    public boolean isPayByBank() {
        return payByBank;
    }

    @JsonProperty("pay-by-bank")
    public void setPayByBank(boolean payByBank) {
        this.payByBank = payByBank;
    }

    @JsonProperty("schedule-published-on")
    public String getSchedulePublishedOn() {
        return schedulePublishedOn;
    }

    @JsonProperty("schedule-published-on")
    public void setSchedulePublishedOn(String schedulePublishedOn) {
        this.schedulePublishedOn = schedulePublishedOn;
    }

    @JsonProperty("payment-currency")
    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    @JsonProperty("payment-currency")
    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    @JsonProperty("organizer-description")
    public String getOrganizerDescription() {
        return organizerDescription;
    }

    @JsonProperty("organizer-description")
    public void setOrganizerDescription(String organizerDescription) {
        this.organizerDescription = organizerDescription;
    }

    @JsonProperty("xcal-url")
    public String getXcalUrl() {
        return xcalUrl;
    }

    @JsonProperty("xcal-url")
    public void setXcalUrl(String xcalUrl) {
        this.xcalUrl = xcalUrl;
    }

    @JsonProperty("original-image-url")
    public String getOriginalImageUrl() {
        return originalImageUrl;
    }

    @JsonProperty("original-image-url")
    public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }

    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @JsonProperty("onsite-details")
    public String getOnsiteDetails() {
        return onsiteDetails;
    }

    @JsonProperty("onsite-details")
    public void setOnsiteDetails(String onsiteDetails) {
        this.onsiteDetails = onsiteDetails;
    }

    @JsonProperty("organizer-name")
    public String getOrganizerName() {
        return organizerName;
    }

    @JsonProperty("organizer-name")
    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    @JsonProperty("large-image-url")
    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    @JsonProperty("large-image-url")
    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("deleted-at")
    public String getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deleted-at")
    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("ticket-url")
    public String getTicketUrl() {
        return ticketUrl;
    }

    @JsonProperty("ticket-url")
    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    @JsonProperty("pay-by-stripe")
    public boolean isPayByStripe() {
        return payByStripe;
    }

    @JsonProperty("pay-by-stripe")
    public void setPayByStripe(boolean payByStripe) {
        this.payByStripe = payByStripe;
    }

    @JsonProperty("location-name")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("location-name")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @JsonProperty("privacy")
    public String getPrivacy() {
        return privacy;
    }

    @JsonProperty("privacy")
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("tax-allow")
    public boolean isTaxAllow() {
        return taxAllow;
    }

    @JsonProperty("tax-allow")
    public void setTaxAllow(boolean taxAllow) {
        this.taxAllow = taxAllow;
    }

    @JsonProperty("pay-onsite")
    public boolean isPayOnsite() {
        return payOnsite;
    }

    @JsonProperty("pay-onsite")
    public void setPayOnsite(boolean payOnsite) {
        this.payOnsite = payOnsite;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("starts-at")
    public String getStartsAt() {
        return startsAt;
    }

    @JsonProperty("starts-at")
    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    @JsonProperty("searchable-location-name")
    public String getSearchableLocationName() {
        return searchableLocationName;
    }

    @JsonProperty("searchable-location-name")
    public void setSearchableLocationName(String searchableLocationName) {
        this.searchableLocationName = searchableLocationName;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("pentabarf-url")
    public String getPentabarfUrl() {
        return pentabarfUrl;
    }

    @JsonProperty("pentabarf-url")
    public void setPentabarfUrl(String pentabarfUrl) {
        this.pentabarfUrl = pentabarfUrl;
    }

    @JsonProperty("logo-url")
    public String getLogoUrl() {
        return logoUrl;
    }

    @JsonProperty("logo-url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @JsonProperty("ticket-include")
    public boolean isTicketInclude() {
        return ticketInclude;
    }

    @JsonProperty("ticket-include")
    public void setTicketInclude(boolean ticketInclude) {
        this.ticketInclude = ticketInclude;
    }

    @JsonProperty("event-url")
    public String getEventUrl() {
        return eventUrl;
    }

    @JsonProperty("event-url")
    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    @JsonProperty("ical-url")
    public String getIcalUrl() {
        return icalUrl;
    }

    @JsonProperty("ical-url")
    public void setIcalUrl(String icalUrl) {
        this.icalUrl = icalUrl;
    }

    @JsonProperty("pay-by-paypal")
    public boolean isPayByPaypal() {
        return payByPaypal;
    }

    @JsonProperty("pay-by-paypal")
    public void setPayByPaypal(boolean payByPaypal) {
        this.payByPaypal = payByPaypal;
    }

    @JsonProperty("show-map")
    public int getShowMap() {
        return showMap;
    }

    @JsonProperty("show-map")
    public void setShowMap(int showMap) {
        this.showMap = showMap;
    }

    @JsonProperty("sponsors-enabled")
    public boolean isSponsorsEnabled() {
        return sponsorsEnabled;
    }

    @JsonProperty("sponsors-enabled")
    public void setSponsorsEnabled(boolean sponsorsEnabled) {
        this.sponsorsEnabled = sponsorsEnabled;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("sub-topic")
    public String getSubTopic() {
        return subTopic;
    }

    @JsonProperty("sub-topic")
    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    @JsonProperty("icon-image-url")
    public String getIconImageUrl() {
        return iconImageUrl;
    }

    @JsonProperty("icon-image-url")
    public void setIconImageUrl(String iconImageUrl) {
        this.iconImageUrl = iconImageUrl;
    }

    @JsonProperty("thumbnail-image-url")
    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    @JsonProperty("thumbnail-image-url")
    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    @JsonProperty("created-at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created-at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("pay-by-cheque")
    public boolean isPayByCheque() {
        return payByCheque;
    }

    @JsonProperty("pay-by-cheque")
    public void setPayByCheque(boolean payByCheque) {
        this.payByCheque = payByCheque;
    }

    @JsonProperty("bank-details")
    public String getBankDetails() {
        return bankDetails;
    }

    @JsonProperty("bank-details")
    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    @JsonProperty("cheque-details")
    public String getChequeDetails() {
        return chequeDetails;
    }

    @JsonProperty("cheque-details")
    public void setChequeDetails(String chequeDetails) {
        this.chequeDetails = chequeDetails;
    }

    @JsonProperty("has-session-speakers")
    public boolean isHasSessionSpeakers() {
        return hasSessionSpeakers;
    }

    @JsonProperty("has-session-speakers")
    public void setHasSessionSpeakers(boolean hasSessionSpeakers) {
        this.hasSessionSpeakers = hasSessionSpeakers;
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "ApiEvent{" +
                "id='" + id + '\'' +
                ", paymentCountry='" + paymentCountry + '\'' +
                ", paypalEmail='" + paypalEmail + '\'' +
                ", codeOfConduct='" + codeOfConduct + '\'' +
                ", payByBank=" + payByBank +
                ", schedulePublishedOn='" + schedulePublishedOn + '\'' +
                ", paymentCurrency='" + paymentCurrency + '\'' +
                ", organizerDescription='" + organizerDescription + '\'' +
                ", xcalUrl='" + xcalUrl + '\'' +
                ", originalImageUrl='" + originalImageUrl + '\'' +
                ", topic='" + topic + '\'' +
                ", onsiteDetails='" + onsiteDetails + '\'' +
                ", organizerName='" + organizerName + '\'' +
                ", largeImageUrl='" + largeImageUrl + '\'' +
                ", timezone='" + timezone + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", ticketUrl='" + ticketUrl + '\'' +
                ", payByStripe=" + payByStripe +
                ", locationName='" + locationName + '\'' +
                ", privacy='" + privacy + '\'' +
                ", state='" + state + '\'' +
                ", latitude='" + latitude + '\'' +
                ", taxAllow=" + taxAllow +
                ", payOnsite=" + payOnsite +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", searchableLocationName='" + searchableLocationName + '\'' +
                ", description='" + description + '\'' +
                ", pentabarfUrl='" + pentabarfUrl + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", ticketInclude=" + ticketInclude +
                ", eventUrl='" + eventUrl + '\'' +
                ", icalUrl='" + icalUrl + '\'' +
                ", payByPaypal=" + payByPaypal +
                ", showMap=" + showMap +
                ", sponsorsEnabled=" + sponsorsEnabled +
                ", name='" + name + '\'' +
                ", subTopic='" + subTopic + '\'' +
                ", iconImageUrl='" + iconImageUrl + '\'' +
                ", thumbnailImageUrl='" + thumbnailImageUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", longitude='" + longitude + '\'' +
                ", payByCheque=" + payByCheque +
                ", bankDetails='" + bankDetails + '\'' +
                ", chequeDetails='" + chequeDetails + '\'' +
                ", hasSessionSpeakers=" + hasSessionSpeakers +
                ", identifier='" + identifier + '\'' +
                ", endsAt='" + endsAt + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}