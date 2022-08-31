package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_017_Test_items;
import pojos.US_017_Test_itemsRequest;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static utilities.AuthenticationYeni.generateToken;


public class US_017_apiStepDefinitions {

    Response response;
    Response response1;
    US_017_Test_items testItems=new US_017_Test_items();
    US_017_Test_itemsRequest test_itemsRequest=new US_017_Test_itemsRequest();
    Faker faker= new Faker();

    @Given("HC Medunna Api Endpointinden test ıtems ı goruntuler")
    public void hCmedunnaApiEndpointindenTestItemsIGoruntuler() {
        response=given().headers(
                "Authorization",
                "Bearer" + generateToken()).when().get(ConfigReader.getProperty("hcappointments"));
        response.prettyPrint();

    }

    @Then("HC Medunna Api Endpointinden test items i Status Codeunun {int} Oldugunu Dogrular")
    public void hCmedunnaApiEndpointindenTestItemsIStatusCodeununOldugunuDogrular(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

    @And("HC Admin test items olusturur")
    public void hCadminTestItemsOlusturur() {
        test_itemsRequest.setName("folik team 5555");
        test_itemsRequest.setDescription("kan sayimi team 55");
        test_itemsRequest.setPrice(254);
        test_itemsRequest.setDefaultValMin("150");
        test_itemsRequest.setDefaultValMax("1500");
        response1=given().headers(
                "Authorization",
                "Bearer" + generateToken()).body(test_itemsRequest).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("hcappointments"));
        response1.prettyPrint();


    }

    @And("HC Admin gelen datayi dogrular")
    public void hCadminGelenDatayiDogrular() throws IOException {

        response1.then().assertThat().statusCode(201);
        response1.then().body("name",equalTo("folik team 5555")).body("description",equalTo("kan sayimi team 55")).
                body("price",equalTo(254)).body("defaultValMax",equalTo("1500")).body("defaultValMin",equalTo("150"));


        //HashMap actualTestData=response.as(HashMap.class);
        //System.out.println("actualTestData=" + actualTestData);
        //Assert.assertTrue(testItems.getName(),actualTestData.get(Name));







    }
}
