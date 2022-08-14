package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US005_dbStepDefinitions {

    List<Object> idsList;
    String fileName2;

    @Given("US05 için Database ile baglanti kurulur.")
    public void us05_için_database_ile_baglanti_kurulur() {

        DBUtils.createConnection();
        String queryS = "select * from appointment";
        System.out.println(DBUtils.getColumnNames(queryS));
        idsList = getColumnData(queryS, "id");
        // System.out.println(idList);

    }
    @Then("US05 table tablosundan selectRow satirlari getirilir.")
    public void us05_table_tablosundan_select_row_satirlari_getirilir() {


    }
    @Then("US05 Appointments tablosunun column sutununun columnData icerdigi dogrulanir.")
    public void us05_appointments_tablosunun_column_sutununun_column_data_icerdigi_dogrulanir() {

        fileName2 = "src/test/resources/testData/AppointmentUS005ID.txt";
        WriteToTxt.saveAppointmentIds(fileName2, idsList);

        List<Object> actualAppointmentId = ReadTxt.returnAppointmentIdsList(fileName2);
        List<Object> expectedAppointmentId = new ArrayList<>();
        expectedAppointmentId.add(3403);
        // expectedAppointmentId.add(8810);
        //   expectedAppointmentId.add(8805);

        System.out.println(expectedAppointmentId);
        System.out.println(actualAppointmentId);

        Assert.assertTrue("IDler uyusmuyor", actualAppointmentId.containsAll(expectedAppointmentId));


    }

}
