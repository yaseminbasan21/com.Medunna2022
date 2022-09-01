package stepdefinitions.apiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.AuthenticationYeni.generateToken;

public class US_025_apiStepDefinitions {
    Response response;


    @Then("Medunna Api Endpointinden Randevulari Goruntuleme Isleminin Status Codeunun 201 Oldugunu Dogrular")
    public void medunnaApiEndpointindenRandevulariGoruntulemeIslemininStatusCodenun201OldugunuDogrular(int statusKod) {

        response.then().assertThat().statusCode(statusKod);

    }

    @Given("Medunna Endpointinden randevulari goruntuler")
    public void medunnaApiEndpointindenRandevulariGoruntuler() {

        response = given().headers(
                "Authorization",
                "Bearer " + generateToken()).when().get(ConfigReader.getProperty("appointments"));

        response.prettyPrint();
    }

}


