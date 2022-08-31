package stepdefinitions.apiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.CountryPojo;
import pojos.CuntryRequest;
import utilities.Authentication;
import utilities.ConfigReader;

import java.net.URI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static utilities.AuthenticationYeni.generateToken;

public class US028apiStepDefinition {
    Response response;
    CuntryRequest countryPojo=new CuntryRequest();
    CountryPojo countryPojoo = new CountryPojo();






    @Given("BA medunna api endpoie gider..")
    public void kullaniciSwaggerKullanarakMedunnaApiEndpointineGider() {





    }


    @Then("BA APİ ile Olusturulan ulke Okur ve Dogrular..")
    public void baAPİIleOlusturulanUlkeOkurVeDogrular() {

        countryPojo.setName("bilolistan");

        response = given().headers(
                "Authorization",
                "Bearer " + generateToken()).body(countryPojo).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("countryEndPoint"));
        response.prettyPrint();
        response.then().assertThat().statusCode(201);



        response.then().assertThat().statusCode(201);
        response.then().body("name",equalTo("bilolistan"));






    }
}
