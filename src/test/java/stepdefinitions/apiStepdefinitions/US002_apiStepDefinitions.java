package stepdefinitions.apiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.Registrant;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US002_apiStepDefinitions {

    Registrant registrant=new Registrant();
    RequestSpecification spec;
    Response response;

    @Then("Kullanici olusturulan user'in ve request yapilan user'in usernamelerini karsilastirir")
    public void kullanici_olusturulan_user_in_ve_request_yapilan_user_in_usernamelerini_karsilastirir() throws IOException {
        response.then().assertThat().statusCode(201);
        response.prettyPrint();

        ObjectMapper mapper=new ObjectMapper();

        Registrant actualData= mapper.readValue(response.asString(),Registrant.class);

        assertEquals(registrant.getLogin(),actualData.getLogin());
    }


}

