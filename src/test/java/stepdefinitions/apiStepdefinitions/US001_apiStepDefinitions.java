package stepdefinitions.apiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Registrant;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;


public class US001_apiStepDefinitions {

    RequestSpecification spec;
    Response response;

    Registrant registrant=new Registrant();
    Faker faker = new Faker();

    @Given("Kullanici tum kullanicilarin bilgileri icin endpoint olusturur")
    public void kullanici_tum_kullanicilarin_bilgileri_icin_endpoint_olusturur() {

        spec= new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first","api","second","users").queryParams("page",1,"size",5000);

    }

    @Then("Kullanici tum kayitlar icin get request yapar")
    public void kullanici_tum_kayitlar_icin_get_request_yapar() {

        String guncelToken = Authentication.generateToken();

        //response = ApiUtils.getRequest(guncelToken,"/{first}/{second}");

        response = given().
                header(
                        "Authorization",
                        "Bearer " + guncelToken,
                        "Content-Type",ContentType.JSON,
                        "Accept",ContentType.JSON).
                spec(spec).
                when().
                get("https://medunna.com/api/users?=size=10000");

        response.prettyPrint();

    }

    @Given("Kullanici status code'un {int} oldugunu testeder")
    public void kullanici_status_code_un_oldugunu_testeder(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

    @Given("Kullanici yeni kullanici eklemek icin endpoint olusturur")
    public void kullanici_yeni_kullanici_eklemek_icin_endpoint_olusturur() {

        spec= new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first","api","second","register");

    }

    @Given("Kullanici api ile bir kullanici olusturur")
    public void kullanici_api_ile_bir_kullanici_olusturur() {

        registrant.setEmail(faker.internet().emailAddress());
        registrant.setFirstName(faker.name().firstName());
        registrant.setLastName(faker.name().lastName());
        registrant.setLogin(faker.name().username());
        registrant.setPassword(faker.internet().password(8,10));
        registrant.setSsn(faker.idNumber().ssnValid());

        response = given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");
    }
    @Then("Kullanici kayit yaptigi kullanicinin var oldugunu dogrular")
    public void kullanici_kayit_yaptigi_kullanicinin_var_oldugunu_dogrular() throws IOException {

        response.then().assertThat().statusCode(201);
        response.prettyPrint();

        ObjectMapper mapper=new ObjectMapper();

        Registrant actualData= mapper.readValue(response.asString(),Registrant.class);

        assertEquals(registrant.getEmail(),actualData.getEmail());
        assertEquals(registrant.getFirstName(),actualData.getFirstName());
        assertEquals(registrant.getLastName(),actualData.getLastName());
        assertEquals(registrant.getSsn(),actualData.getSsn());
        assertEquals(registrant.getLogin(),actualData.getLogin());
        assertEquals(registrant.getPassword(),actualData.getPassword());

    }

}

