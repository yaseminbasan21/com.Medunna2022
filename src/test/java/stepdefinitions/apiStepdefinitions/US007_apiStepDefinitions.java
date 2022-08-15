package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import pojos.Appointment;
import pojos.US007_Appointment;
import pojos.US007_AppointmentRequest;
import pojos.User;
import utilities.AuthenticationYeni;
import utilities.ConfigReader;

import java.io.IOException;


import static io.restassured.RestAssured.given;
import static utilities.AuthenticationYeni.generateToken;

public class US007_apiStepDefinitions {

    static US007_Appointment appointment;
    static US007_AppointmentRequest appointmentRequest;

    static Faker faker=new Faker();

    static RequestSpecification spec;

    Response response;

    @Given("Medunna Api Endpointinden randevulari goruntuler")
    public void medunnaApiEndpointindenRandevulariGoruntuler() {


        String appoSpecialitySetData = "I don't know";
        String emailSetData = faker.internet().emailAddress();
        String firstnameSetData = "tugba";
        String genderSetData = null;
        String lastnameSetData = "efe";
        String phoneSetData = "9015462324";
        String snumberSetData = "925";
        String ssnSetData = faker.idNumber().ssnValid();
        String startDateSetData = "2022-08-15T00:00:00Z";

        appointmentRequest = new US007_AppointmentRequest();

        appointmentRequest.setAppoSpeciality(appoSpecialitySetData);
        appointmentRequest.setEmail(emailSetData);
        appointmentRequest.setFirstName(firstnameSetData);
        appointmentRequest.setGender(genderSetData);
        appointmentRequest.setLastName(lastnameSetData);
        appointmentRequest.setPhone(phoneSetData);
        appointmentRequest.setSnumber(snumberSetData);
        appointmentRequest.setSsn(ssnSetData);
        appointmentRequest.setStartDate(startDateSetData);

        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "appointments", "third", "request");

        //https://www.medunna.com/api/appointments/request

                 response = given().spec(spec).header(
                        "Authorization",
                        "Bearer " + generateToken("Hastatugbaefe","Toe12345.")).contentType(ContentType.JSON).
                body(appointmentRequest).
                when().post("/{first}/{second}/{third}");

        response.prettyPrint();


    }

    @Then("Medunna Api Endpointinden Randevulari Goruntuleme Isleminin Status Codeunun {int} Oldugunu Dogrular")
    public void medunnaApiEndpointindenRandevulariGoruntulemeIslemininStatusCodeununOldugunuDogrular(int statusKod) {

        response.then().assertThat().statusCode(statusKod);
    }

    @And("Request deger ile Response'un ayni oldugunu dogrular.")
    public void requestDegerIleResponseUnAyniOldugunuDogrular() throws IOException {

        ObjectMapper ob = new ObjectMapper();
        appointment = ob.readValue(response.asString(), US007_Appointment.class);

        Assert.assertEquals(appointmentRequest.getEmail(), appointment.getPatient().getEmail());
        Assert.assertEquals(appointmentRequest.getFirstName(), appointment.getPatient().getFirstName());
        Assert.assertEquals(appointmentRequest.getLastName(), appointment.getPatient().getLastName());
        Assert.assertEquals(appointmentRequest.getGender(), appointment.getPatient().getGender());
        Assert.assertEquals(appointmentRequest.getPhone(), appointment.getPatient().getPhone());
        Assert.assertEquals(appointmentRequest.getSsn(), appointment.getPatient().getUser().getSsn());
        Assert.assertEquals(appointmentRequest.getStartDate(), appointment.getStartDate());

    }



}
