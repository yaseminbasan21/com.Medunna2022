package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.junit.Test;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US010_dbStepDefinitions {

    @Test
    public void test() {

        DBUtils.createConnection();

        String query = "select * from appointment where id=166158";
        System.out.println(DBUtils.getColumnNames(query));

        List<Object> statusList = getColumnData(query, "status");
        System.out.println(statusList);
        String fileName1 = "src/test/resources/testData/AppointmentGenel.txt";
        WriteToTxt.saveAppointmentIds(fileName1, statusList);

        List<Object> actualAppointmentStatus = ReadTxt.returnAppointmentStatusList(fileName1);
        List<Object> expectedAppointmentStatus= new ArrayList<>();

        expectedAppointmentStatus.add("PENDING");
        Assert.assertTrue("STATUS Kodlar uyusmuyor", actualAppointmentStatus.containsAll(expectedAppointmentStatus));

        List<Object> startDateList = getColumnData(query, "start_date");
        System.out.println(startDateList);
        String fileName2 = "src/test/resources/testData/AppointmentGenel.txt";
        WriteToTxt.saveAppointmentIds(fileName2, startDateList);
        List<Object> actualAppointmentStartDate = ReadTxt.returnAppointmentStartDateList(fileName1);
        List<Object> expectedAppointmentStartDate= new ArrayList<>();
        expectedAppointmentStartDate.add("2022-11-08 00:00:00.0");
        Assert.assertTrue("STARTDATE Kodlar uyusmuyor", actualAppointmentStartDate.containsAll(expectedAppointmentStartDate));


        List<Object> endDateList = getColumnData(query, "end_date");
        System.out.println(endDateList);
        String fileName3 = "src/test/resources/testData/AppointmentGenel.txt";
        WriteToTxt.saveAppointmentIds(fileName3, startDateList);
        List<Object> actualAppointmentEndDate = ReadTxt.returnAppointmentStartDateList(fileName1);
        List<Object> expectedAppointmentEndDate= new ArrayList<>();
        expectedAppointmentEndDate.add("2022-11-08 00:00:00.0");
        Assert.assertTrue("ENDDATE Kodlar uyusmuyor", actualAppointmentEndDate.containsAll(expectedAppointmentEndDate));
    }

    @Given("database ile baglanti kurulur.")
    public void databaseIleBaglantiKurulur() {
    }

    @And("Table tablosundan selectRow satirlari getirilir.")
    public void tableTablosundanSelectRowSatirlariGetirilir() {
    }

    @And("appointments tablosunun column sutununun columnData icerdigi dogrulanir.")
    public void appointmentsTablosununColumnSutunununColumnDataIcerdigiDogrulanir() {
    }

}
