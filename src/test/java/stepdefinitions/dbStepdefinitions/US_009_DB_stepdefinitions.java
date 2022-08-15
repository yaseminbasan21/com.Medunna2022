package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Then;

import java.util.List;

import static utilities.DBUtils.*;

public class US_009_DB_stepdefinitions {


    public static int hastaToplamSayisi_DB;

    public static List<Object> hastalistesi_DB;


    @Then("Kullanici medunna database e baglanir")
    public void kullaniciMedunnaDatabaseEBaglanir() {
        createConnection();
    }

    @Then("Kullanici database'den tum hasta bilgilerini alir")
    public void kullaniciDatabaseDenTumHastaBilgileriniAlir() {
        hastalistesi_DB = getColumnData("select * from patient", "id");

        hastaToplamSayisi_DB = hastalistesi_DB.size();

        System.out.println("Tüm kayıtlı DB Hasta  Sayısı : "+ hastaToplamSayisi_DB);
        closeConnection();
    }
}
