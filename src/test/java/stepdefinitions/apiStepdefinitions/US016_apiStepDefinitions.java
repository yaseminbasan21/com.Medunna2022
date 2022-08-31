package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import pojos.Room;
import pojos.RoomPost;
import utilities.ConfigReader;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.ApiUtils.postRequest2;
import static utilities.AuthenticationYeni.generateToken;

public class US016_apiStepDefinitions {

   static RequestSpecification spec;
   Response response;
   Room [] rooms;
   RoomPost roomPost=new RoomPost();
   Room roomPut=new Room();


   @Given("Kullanici Medunna endpointine gider.")
   public void kullaniciMedunnaEndpointineGider() {

  // spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("room_endpoint")).build();
  // spec.pathParams("first","api","second","rooms");
  // response = given().spec(spec).headers(
  //         "Authorization",
  //         "Bearer " + generateToken()).when().get("/{first}/{second}");

     response = given().headers(
                     "Authorization",
            "Bearer " + generateToken()).when().get(ConfigReader.getProperty("room_endpoint"));

    response.prettyPrint();
    


    }

    @And("Kullanici Goruntuleme Isleminin Status Code'unun {int} Oldugunu Dogrular")
    public void kullaniciGoruntulemeIslemininStatusCodeUnunOldugunuDogrular(int statusCode) throws IOException {
    response.then().assertThat().statusCode(statusCode);
    ObjectMapper obj=new ObjectMapper();
    rooms=obj.readValue(response.asString(),Room[].class);
     System.out.println("Room sayisi : " + rooms.length);

     for (int i = 0; i <rooms.length; i++) {
      System.out.println(rooms[i].getDescription());
      System.out.println(rooms[i].getRoomNumber());

     }

    }

    @And("Kullanici New Room Olusturur")
    public void kullaniciNewRoomOlusturur() throws IOException {


     roomPost.setRoomNumber(560641);//960315 963315 967315
     roomPost.setRoomType("TWIN");
     roomPost.setPrice(550);
     roomPost.setStatus(true);


    //response = given().headers(
    //        "Authorization",
    //        "Bearer " + generateToken()).body(roomPost).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("room_post"));

     response=postRequest2(ConfigReader.getProperty("room_post"),roomPost);

     response.prettyPrint();

     response.then().assertThat().statusCode(201);
     response.then().body("price",equalTo(550)).body("roomNumber",equalTo(560641)).
             body("roomType",equalTo("TWIN")).body("status",equalTo(true));

     //2. validation

     JsonPath js=response.jsonPath();

     assertEquals(roomPost.getRoomType(),js.getString("roomType"));
     assertEquals(roomPost.getRoomNumber(),js.getInt("roomNumber"));
     assertEquals(roomPost.getPrice(),js.getInt("price"));

     //3. validation

     Map<String ,Object> actualMap=response.as(HashMap.class);
     assertEquals(roomPost.getPrice(),actualMap.get("price"));
     assertEquals(roomPost.getRoomType(),actualMap.get("roomType"));

     //4. validation
     Room actualRoomData=response.as(Room.class);

     assertEquals(roomPost.getPrice(),actualRoomData.getPrice());
     assertEquals(roomPost.getRoomType(),actualRoomData.getRoomType());

     //5. validation

     ObjectMapper obj=new ObjectMapper();
     Room actualObjectData=obj.readValue(response.asString(),Room.class);

     assertEquals(roomPost.getRoomType(),actualObjectData.getRoomType());
     assertEquals(roomPost.getRoomNumber(),actualObjectData.getRoomNumber());

     // 6. validation

     Gson gson=new Gson();
     Room actualGsonData=gson.fromJson(response.asString(),Room.class);

     assertEquals(roomPost.getRoomType(),actualGsonData.getRoomType());
     assertEquals(roomPost.getRoomNumber(),actualGsonData.getRoomNumber());



    }

    @And("Kullanici Olusturma Isleminin Status Code'unun {int} Oldugunu Dogrular")
    public void kullaniciOlusturmaIslemininStatusCodeUnunOldugunuDogrular(int statusCode) throws IOException {


    }

    @And("Kullanici Olusturdugu Room'u Gunceller")
    public void kullaniciOlusturduguRoomUGunceller() throws IOException {
    roomPut.setId(237198);
    roomPut.setRoomType("DELUXE");
    roomPut.setPrice(1200);
    roomPut.setRoomNumber(979315);

     response = given().headers(
             "Authorization",
            "Bearer " + generateToken()).body(roomPut).contentType(ContentType.JSON).when().put(ConfigReader.getProperty("room_post"));

     response.then().assertThat().statusCode(200);
     ObjectMapper obj=new ObjectMapper();
     Room actualObjectData=obj.readValue(response.asString(),Room.class);

     assertEquals(roomPut.getRoomType(),actualObjectData.getRoomType());
     assertEquals(roomPut.getRoomNumber(),actualObjectData.getRoomNumber());
     assertEquals(roomPut.getId(),actualObjectData.getId());
     assertEquals(roomPut.getPrice(),actualObjectData.getPrice());






    }

    @And("Kullanici Update Isleminin Status Code'unun {int} Oldugunu Dogrular")
    public void kullaniciUpdateIslemininStatusCodeUnunOldugunuDogrular(int statusCode) {


    }
   @And("Kullanici Olusturdugu {string} numarali Room'u Siler")
   public void kullaniciOlusturduguNumaraliRoomUSiler(String id) {
    response = given().headers(
            "Authorization",
            "Bearer " + generateToken()).contentType(ContentType.JSON).when().delete(ConfigReader.getProperty("room_post")+"/"+id);

    response.then().assertThat().statusCode(204);

   }







    @And("Kullanici Delete Isleminin Status Code'unun {int} Oldugunu Dogrular")
    public void kullaniciDeleteIslemininStatusCodeUnunOldugunuDogrular(int arg0) {

    }



}
