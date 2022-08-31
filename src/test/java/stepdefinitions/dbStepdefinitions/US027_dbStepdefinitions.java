package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US027_dbStepdefinitions {
    String query;
    List<Object> idList;
    @Given("ba DB ile MedunnaDB ye Baglanir")
    public void kullaniciDBIleMedunnaDBYeBaglanir() {

        DBUtils.createConnection();
        query ="select * from cmessage";
        System.out.println(DBUtils.getColumnNames(query));


    }

    @Then("ba DB den Tum Mesajlarin Bilgisini Alir")
    public void kullaniciDBDenTumMesajlarinBilgisiniAlir() {
        idList=DBUtils.getColumnData(query,"id");
        String fileName = "src/test/resources/testData/MsjIDs.txt";
        WriteToTxt.saveAppointmentIds(fileName, idList);
        List<Object> actualAppointmentIds = ReadTxt.returnAppointmentIdsList(fileName);
        List<Object> expectedAppointmentIds = new ArrayList<>();
        expectedAppointmentIds.add(249779);
        Assert.assertTrue("ID'ler uyusmuyor", actualAppointmentIds.containsAll(expectedAppointmentIds));

    }
}
