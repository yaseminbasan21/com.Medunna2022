package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;
import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;


public class US_025_dbStepDefinitions {

    List<Object> idList;
    String query;
    String fileName3;




    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        DBUtils.createConnection();

        query = "select * from appointment";
        System.out.println(DBUtils.getColumnNames(query));

    }
    @And("Table tablosundann selectRow satirlari getirilir.")
    public void tableTablosundanSelectRowSatirlariGetirilir() {
        idList = DBUtils.getColumnData(query,"id");

    }

    @Then("Appointments tablosunun columnData icerdigi dogrulanir.")
    public void appointments_tablosunun_column_data_icerdigi_dogrulanir() {
        fileName3 = "src/test/resources/testData/US_025_Appointment.txt";
        WriteToTxt.saveAppointmentIds(fileName3, idList);

        List<Object> actualAppointmentId = ReadTxt.returnAppointmentIdsList(fileName3);
        List<Object> expectedAppointmentId = new ArrayList<>();
        expectedAppointmentId.add(8810);
        expectedAppointmentId.add(8805);

        System.out.println(expectedAppointmentId);
        System.out.println(actualAppointmentId);

        Assert.assertTrue("IDler uyusmuyor", actualAppointmentId.containsAll(expectedAppointmentId));


        List<Object> statusList = getColumnData(query, "status");
        fileName3 = "src/test/resources/testData/US_025_Appointment.txt";
        WriteToTxt.saveAppointmentStatus(fileName3, statusList);

        List<Object> actualAppointmentStatus = ReadTxt.returnAppointmentStatusList(fileName3);
        List<Object> expectedAppointmentStatus = new ArrayList<>();

        expectedAppointmentStatus.add("PENDING");
        Assert.assertTrue("STATUS Kodlar uyusmuyor", actualAppointmentStatus.containsAll(expectedAppointmentStatus));
    }

}






