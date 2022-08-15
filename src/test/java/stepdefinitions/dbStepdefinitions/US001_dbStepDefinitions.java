package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US001_dbStepDefinitions {

    List<Object> idList;

    @Given("Kullanıcı db ile baglanti kurar")
    public void kullanıcı_db_ile_baglanti_kurar() {
        DBUtils.createConnection();
        String query = "select * from asd";
        System.out.println(DBUtils.getColumnNames(query));
        idList = getColumnData(query, "ssn");


    }


}
