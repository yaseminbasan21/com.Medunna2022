package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US016_dbStepDefinitions {

    String query;
    List<Object> idList;

    @Given("Kullanici Database Ile Baglanti Kurar")
    public void kullaniciDatabaseIleBaglantiKurar() {

        DBUtils.createConnection();

        query = "select * from room";
        System.out.println(DBUtils.getColumnNames(query));
    }

    @And("Kullanici Room Tablosunu Goruntuler")
    public void kullaniciRoomTablosunuGoruntuler() {
        idList = DBUtils.getColumnData(query, "id");
        //   System.out.println(idList);


    }

    @And("Kullanici Room Tablosunun oda bilgilerini icerdigini dogrular")
    public void kullaniciRoomTablosununOdaBilgileriniIcerdiginiDogrular() {

        String fileName = "src/test/resources/testData/RoomIDs.txt";
        WriteToTxt.saveAppointmentIds(fileName, idList);
        List<Object> actualAppointmentIds = ReadTxt.returnAppointmentIdsList(fileName);
        List<Object> expectedAppointmentIds = new ArrayList<>();
        expectedAppointmentIds.add(238881);
        expectedAppointmentIds.add(33599);
        Assert.assertTrue("ID'ler uyusmuyor", actualAppointmentIds.containsAll(expectedAppointmentIds));

    }
}
