package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US005_Appointment {

    /*
    {
    "createdBy": "anonymousUser",
    "createdDate": "2022-08-14T07:25:34.214013Z",
    "id": 187430,
    "startDate": "2022-08-14T00:00:00Z",
    "endDate": "2022-08-14T01:00:00Z",
    "status": "UNAPPROVED",
    "anamnesis": null,
    "treatment": null,
    "diagnosis": null,
    "prescription": null,
    "description": null,
    "physician": null,
    "patient": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-08-07T06:37:24.322731Z",
        "id": 162877,
        "firstName": "Hasta",
        "lastName": "Medunna",
        "birthDate": null,
        "phone": "555-255-5555",
        "gender": null,
        "bloodGroup": null,
        "adress": null,
        "email": "semiharpacik42@gmail.com",
        "description": null,
        "user": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-08-07T06:39:48.675561Z",
            "id": 162523,
            "login": "hastamedunna",
            "firstName": "Hasta",
            "lastName": "Medunna",
            "email": "semiharpacik52@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "159-75-7899"
        },
        "inPatients": null,
        "country": null,
        "cstate": null
    },
    "ctests": []
}
     */


    private String createdBy;
    private String createdDate;
    private int id;
    private String startDate;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private Patient patient;

    public US005_Appointment() {
    }

    public US005_Appointment(String createdBy, String createdDate, int id, String startDate, String endDate, String status, String anamnesis, String treatment, String diagnosis, String prescription, Patient patient) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.patient = patient;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "US005_Appointment{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                ", patient=" + patient +
                '}';
    }
}
