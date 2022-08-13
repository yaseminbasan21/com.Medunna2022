package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US007_Appointment;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static utilities.AuthenticationYeni.generateToken;

public class US010_apiStepDefinitions {

    static US007_Appointment appointment;
    static RequestSpecification spec;
    Response response;

    @Given("MedunnaApi Endpointinden randevulari goruntuler")
    public void medunnaapiEndpointindenRandevulariGoruntuler() {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "appointments", "third", 179424);

        //https://www.medunna.com/api/appointments/patient/155802

        response = given().spec(spec).header(
                "Authorization",
                "Bearer " + generateToken("Doctortugbaefe","Toe12345.")).//contentType(ContentType.JSON).
                when().get("/{first}/{second}/{third}");

        response.prettyPrint();
    }

    @And("MedunnaApi Endpointinden Randevulari Goruntuleme Isleminin Status Codeunun {int} Oldugunu Dogrular")
    public void medunnaapiEndpointindenRandevulariGoruntulemeIslemininStatusCodeununOldugunuDogrular(int statusKod) {
        response.then().assertThat().statusCode(statusKod);
    }


    @And("Medunna Api Endpointinden id numarali mesaji Okur ve mesajin {string}, {string}, {string} ve {string} bilgilerine sahip oldugunu dogrular.")
    public void medunnaApiEndpointindenIdNumaraliMesajiOkurVeMesajinVeBilgilerineSahipOldugunuDogrular(String patientid, String startdate, String enddate, String status) throws IOException {
        ObjectMapper ob = new ObjectMapper();
        appointment = ob.readValue(response.asString(), US007_Appointment.class);

        Assert.assertEquals(Integer.parseInt(patientid),appointment.getPatient().getId());
        Assert.assertEquals(startdate,appointment.getStartDate());
        Assert.assertEquals(enddate,appointment.getEndDate());
        Assert.assertEquals(status,appointment.getStatus());
    }
}
