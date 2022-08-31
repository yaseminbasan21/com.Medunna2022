package stepdefinitions.apiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.MesajRequest;
import utilities.Authentication;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static utilities.AuthenticationYeni.generateToken;

public class US027apiStepDefinition {
    Response response;
   // String token;"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtNTUuIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NjE4NzgxODB9.zrpXChAcZJkiy1R-quHTgSF3T4lfR1o_7epCI1eLPIT2dSqXQGJcpeDO5QPI2rUtVoJwBq5E8O73h2Xu10gOgg"
    Faker faker = new Faker();
    MesajRequest msjPost=new MesajRequest();
    String email;


    @Given("BA medunna api endpoie gider.")
    public void kullaniciSwaggerKullanarakMedunnaApiEndpointineGider() {
        email=faker.internet().emailAddress();
        msjPost.setEmail(email);
        msjPost.setMessage("merhamba");
        msjPost.setName("bilo");
        msjPost.setSubject("api test");

        response = given().headers(
                "Authorization",
                "Bearer " + generateToken()).body(msjPost).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("iletiEndPoint"));
        response.prettyPrint();
        response.then().assertThat().statusCode(201);

    }

    @Then("BA APİ ile Yeni Bir Mesaj Olusntturur.")
    public void kullaniciAPİIleYeniBirMesajOlusturur() {



    }

    @Then("BA status codeun 201 oldugunu testeder.")
    public void kullaniciStatusCodeUnOldugunuTesteder(int statusCode) {
        response.then().assertThat().statusCode(statusCode);

    }

    @Then("BA APİ ile Olusturulan Mesaj Okur ve Dogrular.")
    public void kullaniciAPİIleOlusturulanMesajiOkurVeDogrular() {
        response.then().assertThat().statusCode(201);
        response.then().body("email",equalTo(email)).body("message",equalTo("merhamba")).
                body("name",equalTo("bilo")).body("subject",equalTo("api test"));


    }
}
