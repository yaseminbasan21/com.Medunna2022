package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import io.restassured.response.Response;

import org.junit.Assert;
import pojos.US019_Staff;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;
import static utilities.AuthenticationYeni.generateToken;

public class US019_apiStepdefinitions {

    static US019_Staff staff;


    Response response;
    @Given("Medunna Api Endpointinden staffleri goruntuler")
    public void medunnaApiEndpointindenStaffleriGoruntuler() {
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken()).when().get(ConfigReader.getProperty("staff_endpoint"));

        response.prettyPrint();

    }

    @Then("Medunna Api Endpointinden staffleri goruntuleme Isleminin Status Codeunun {int} Oldugunu Dogrular")
    public void medunnaApiEndpointindenStaffleriGoruntulemeIslemininStatusCodeununOldugunuDogrular(int statuscode) {
        response.then().assertThat().statusCode(statuscode);

    }



    @And("Medunna Api Endpointinden id numarali mesaji Okur ve mesajin {string}, {string} ve {string} bilgilerine sahip oldugunu dogrular.")
    public void medunnaApiEndpointindenIdNumaraliMesajiOkurVeMesajinVeBilgilerineSahipOldugunuDogrular(String firstName, String lastName, String phone) throws IOException {


        ObjectMapper mapper=new ObjectMapper();
        staff=mapper.readValue(response.asString(),US019_Staff.class);
        Assert.assertEquals(firstName,staff.getFirstName());
        Assert.assertEquals(lastName,staff.getLastName());
        Assert.assertEquals(phone,staff.getPhone());



    }
}
