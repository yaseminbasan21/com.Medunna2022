package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    /*
    "user": {
            "createdBy": "hastatugbaefe",
            "createdDate": "2022-08-11T06:49:24.758688Z",
            "id": 174962,
            "login": "user_112233445_56677889991660200564665",
            "firstName": "tugba",
            "lastName": "ozefe",
            "email": "efekfkdld@gmail.com",
            "activated": false,
            "langKey": null,
            "imageUrl": null,
            "resetDate": null,
            "ssn": "285-66-1254"
        },
     */

    private String createdBy;
    private String createdDate;
    private String id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String activated;
    private String imageUrl;
    private String resetDate;
    private String ssn;

    public User() {
    }

    public User(String createdBy, String createdDate, String id, String login, String firstName, String lastName, String email, String activated, String imageUrl, String resetDate, String ssn) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.imageUrl = imageUrl;
        this.resetDate = resetDate;
        this.ssn = ssn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getResetDate() {
        return resetDate;
    }

    public void setResetDate(String resetDate) {
        this.resetDate = resetDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activated='" + activated + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", resetDate='" + resetDate + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
