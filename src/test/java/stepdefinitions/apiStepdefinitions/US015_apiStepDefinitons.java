package stepdefinitions.apiStepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_015_UserPojo;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;



public class US015_apiStepDefinitons {

        Response response;
        US_015_UserPojo user;
        List<Object> patientList;
        JsonPath jsonPath;
        Faker faker = new Faker();



    @Given("Kullanıcı hasta bilgileri için get request yapar")
    public void kullanıcıHastaBilgileriIçinGetRequestYapar() {
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigReader.getProperty("api_patients_endpoint"));

//        response.prettyPrint();

    }

    @And("Kullanıcı gelen datayı deserialize eder")
    public void kullanıcıGelenDatayıDeserializeEder() {
        jsonPath = response.jsonPath();
        patientList = jsonPath.get("");
        System.out.println(patientList.size());
    }

    @Then("Kullanıcı hasta datalarını kaydeder ve doğrular")
    public void kullanıcıHastaDatalarınıKaydederVeDoğrular() {
        saveApiListPatientsData(patientList);

        List<String> ssn = jsonPath.getList("user.ssn");
        for(String s : ssn){
            if(s.equals("654-54-5424")){
                System.out.println("Found the patient");
            }
        }
    }


    private void saveApiListPatientsData(List<Object> patientList) {
    }



}
