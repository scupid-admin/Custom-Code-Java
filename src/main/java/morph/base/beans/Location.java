package morph.base.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Copyright (C) 2016 Scupids - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author aapa
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {

    @JsonProperty(LocationFieldMapping.locationType)
    private String locationType;

    @JsonProperty(LocationFieldMapping.houseNo)
    private String houseNo;

    @JsonProperty(LocationFieldMapping.street)
    private String street;

    @JsonProperty(LocationFieldMapping.locality)
    private String locality;

    @JsonProperty(LocationFieldMapping.city)
    private String city;

    @JsonProperty(LocationFieldMapping.state)
    private String state;

    @JsonProperty(LocationFieldMapping.country)
    private String country;

    @JsonProperty(LocationFieldMapping.latitude)
    private Double latitude;

    @JsonProperty(LocationFieldMapping.longitude)
    private Double longitude;

    @JsonProperty(LocationFieldMapping.url)
    private String url;

    @JsonProperty(LocationFieldMapping.address)
    private String address;


    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    //todo overload function to get city through brand api, or when user clicks on url and selects city

    public String getCity() {
        return city;
    }

    //todo check if city matches with possible values of city (if any) and then set the city

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Location locationType(String locationType) {
        this.locationType = locationType;
        return this;
    }

    public Location houseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }

    public Location street(String street) {
        this.street = street;
        return this;
    }

    public Location locality(String locality) {
        this.locality = locality;
        return this;
    }

    public Location city(String city) {
        this.city = city;
        return this;
    }

    public Location state(String state) {
        this.state = state;
        return this;
    }

    public Location country(String country) {
        this.country = country;
        return this;
    }

    public Location latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Location longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Location url(String url) {
        this.url = url;
        return this;
    }

    public Location address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Location{" +
                "houseNo='" + houseNo + '\'' +
                ", street='" + street + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", url='" + url + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class LocationFieldMapping {
        public static final String locationType = "locationType";
        public static final String houseNo = "houseNo";
        public static final String street = "street";
        public static final String locality = "locality";
        public static final String city = "city";
        public static final String state = "state";
        public static final String country = "country";
        public static final String latitude = "latitude";
        public static final String longitude = "longitude";
        public static final String url = "url";
        public static final String address = "address";
        public static final String postalCode = "postalCode";
        public static final String placeId = "placeId";
    }
}