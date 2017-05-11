package morph.base.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by jayeshathila
 * on 11/05/17.
 */
public class User {

    @JsonProperty(UserMapping.name)
    private String name;

    @JsonProperty(UserMapping.firstName)
    private String firstName;

    @JsonProperty(UserMapping.lastName)
    private String lastName;

    @JsonProperty(UserMapping.email)
    private String email;

    @JsonProperty(UserMapping.imageUrl)
    private String imageUrl;

    @JsonProperty(UserMapping.phoneNumber)
    private String phoneNumber;

    @JsonProperty(UserMapping.gender)
    private Gender gender;

    @JsonProperty(UserMapping.locations)
    private List<Location> locations;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public interface UserMapping {
        public static final String id = "id";
        public static final String name = "name";
        public static final String firstName = "firstName";
        public static final String lastName = "lastName";
        public static final String email = "email";
        public static final String imageUrl = "imageUrl";
        public static final String phoneNumber = "phoneNumber";
        public static final String gender = "gender";
        public static final String locations = "locations";
    }
}
