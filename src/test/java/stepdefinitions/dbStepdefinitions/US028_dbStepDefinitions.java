package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US028_dbStepDefinitions {
    String queryy;
    List<Object> idList;


    @Given("Kullanici DB ile MedunnaDB ye Baglanir")
    public void kullaniciDBIleMedunnaDBYeBaglanir() {
        DBUtils.createConnection();
        queryy = "select * from country";
        System.out.println(DBUtils.getColumnNames(queryy));


    }

    @Then("Kullanici DB den Tumulkee Bilgisini Alir")
    public void kullaniciDBDenTumulkeeBilgisiniAlir() {

        idList=DBUtils.getColumnData(queryy,"id");
        String fileName = "src/test/resources/testData/ulkeIDs.txt";
        WriteToTxt.saveAppointmentIds(fileName, idList);
        List<Object> actualAppointmentIds = ReadTxt.returnAppointmentIdsList(fileName);
        List<Object> expectedAppointmentIds = new ArrayList<>();
        expectedAppointmentIds.add(43965);
        Assert.assertTrue("ID'ler uyusmuyor", actualAppointmentIds.containsAll(expectedAppointmentIds));
    }


}
