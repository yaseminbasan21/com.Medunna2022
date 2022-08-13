package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US007_dbStepDefinitions {

    List<Object> idList;
    String fileName1;


        @Given("Database ile baglanti kurulur.")
        public void database_ile_baglanti_kurulur() {

            DBUtils.createConnection();
            String query = "select * from appointment";
            System.out.println(DBUtils.getColumnNames(query));
            idList = getColumnData(query, "id");
            // System.out.println(idList);

        }
        @Then("table tablosundan selectRow satirlari getirilir.")
        public void tableTablosundanSelectRowSatirlariGetirilir() {

        }

        @And("Appointments tablosunun column sutununun columnData icerdigi dogrulanir.")
        public void appointmentsTablosununColumnSutunununColumnDataIcerdigiDogrulanir() {

            fileName1 = "src/test/resources/testData/AppointmentID.txt";
            WriteToTxt.saveAppointmentIds(fileName1, idList);

            List<Object> actualAppointmentId = ReadTxt.returnAppointmentIdsList(fileName1);
            List<Object> expectedAppointmentId = new ArrayList<>();
            expectedAppointmentId.add(3403);
            expectedAppointmentId.add(8810);
            //   expectedAppointmentId.add(8805);

            System.out.println(expectedAppointmentId);
            System.out.println(actualAppointmentId);

            Assert.assertTrue("IDler uyusmuyor", actualAppointmentId.containsAll(expectedAppointmentId));

        }



}
