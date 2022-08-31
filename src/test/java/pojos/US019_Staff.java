package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US019_Staff {
    /*
    {
        "createdBy": "team55.",
        "createdDate": "2022-08-23T12:53:13.024474Z",
        "id": 217624,
        "firstName": "emrah",
        "lastName": "T63_staff",
        "birthDate": "2022-08-22T21:00:00Z",
        "phone": "555-555-5332",
        "gender": "MALE",
        "bloodGroup": "Apositive",
        "adress": "ceyhan",
        "description": "staff",
        "user": {
            "createdBy": "team55.",
            "createdDate": "2022-08-23T12:51:42.419184Z",
            "id": 219576,
            "login": "emrahstaff",
            "firstName": "emrah",
            "lastName": "staff",
            "email": "emrahstaff0101@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": "2022-08-23T12:51:42.417785Z",
            "ssn": "886-56-9865"
        },
        "country": {
            "id": 223284,
            "name": "Sri Lanka"
        },
        "cstate": null
    }
     */
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String description;

    public US019_Staff() {
    }

    public US019_Staff(String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.description = description;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "US019_Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

