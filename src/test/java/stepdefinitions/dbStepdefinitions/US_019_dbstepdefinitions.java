package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_019_dbstepdefinitions {
    String query;
    List<Object> idList;

    @Given("Kullanici database ile medunnaya baglanir")
    public void kullaniciDatabaseIleMedunnayaBaglanir() {
        DBUtils.createConnection();
        query = "select * from staff";
        System.out.println(DBUtils.getColumnNames(query));
        // List<Object> actualId=DBUtils.getColumnData(query,"id");
        // System.out.println(actualId);
    }

    @When("staff datalarina erisir")
    public void staffDatalarinaErisir() {
      idList=DBUtils.getColumnData(query,"id");
    }

    @And("kullanici database den gelen bilgileri dogrular")
    public void kullaniciDatabaseDenGelenBilgileriDogrular() {
        String fileName = "src/test/resources/testData/StaffIDs.txt";
        WriteToTxt.saveAppointmentIds(fileName, idList);
        List<Object> actualAppointmentIds = ReadTxt.returnAppointmentIdsList(fileName);
        List<Object> expectedAppointmentIds = new ArrayList<>();
        expectedAppointmentIds.add(245988);
        expectedAppointmentIds.add(246000);
        Assert.assertTrue("ID'ler uyusmuyor", actualAppointmentIds.containsAll(expectedAppointmentIds));
    }


}
