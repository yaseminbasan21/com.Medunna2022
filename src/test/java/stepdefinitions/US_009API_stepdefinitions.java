package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Patient;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.AuthenticationYeni.generateToken;

public class US_009API_stepdefinitions {

    Response response;
    Patient patient;
    public static RequestSpecification spec;

    @Given("Kullanici Medunna patient API endpointini {string} ile olusturur")
    public void kullanici_medunna_patient_apı_endpointini_ile_olusturur(String string) {

        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("MedunnaURL")).build();
        spec.pathParams("first","api","second","patient","third","id");

    }

    @Given("Kullanici patient icin get request gonderir ve response alir")
    public void kullanici_patient_icin_get_request_gonderir_ve_response_alir() {
        response=given().spec(spec).header("Authorization", "Bearer "+ generateToken())
                .contentType(ContentType.JSON)
                .when()
                .get("/{first}/{second}/{third}/");
        response.prettyPrint();
    }

    @Then("Kullanici statuscode {int} oldugunu dogrular")
    public void kullanici_statuscode_oldugunu_dogrular(Integer int1) {

        response.then().statusCode(200);
    }

    @Then("Kullanici gelen Json patient datalarini javaya donusturur")
    public void kullanici_gelen_json_patient_datalarini_javaya_donusturur() {
        patient=response.as(Patient.class);

    }

    @Then("Kullanici API ile gelen bilgileri {string} dogrular")
    public void kullanici_apı_ile_gelen_bilgileri_dogrular(String string) {

        Assert.assertEquals(154140,patient.getId());
    }
}
