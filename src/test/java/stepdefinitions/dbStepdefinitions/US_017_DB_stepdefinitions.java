package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.DBUtils.getColumnData;

public class US_017_DB_stepdefinitions {

  List<Object> nameList;
  String query;


    @Given("HC Database ile baglanti kururlur")
    public void hc_database_ile_baglanti_kururlur() {
      DBUtils.createConnection();
       query = "select * from public.c_test_item";
     System.out.println(DBUtils.getColumnNames(query));
      //nameList = getColumnData(query, "name");
      //System.out.println(nameList);



    }

  @Then("HC Admin Test items  bilgilerini sorgulama yapar")
  public void hcAdminTestItemsBilgileriniSorgulamaYapar() {

        nameList=DBUtils.getColumnData(query,"name");
     // String username="team55.";
    //  String query1="select * from public.c_test_item";
      //String query="select *from public.c_test_item where name= 'folik asit 5";


  }


  @And("HC Admin test items tablosunun column sutununun columnData icerdigi dogrulanir.")
  public void hcAdminTestItemsTablosununColumnSutunununColumnDataIcerdigiDogrulanir() {

        String fileName="src/test/resources/testData/testitemsID.txt";
      WriteToTxt.saveNameList(fileName,nameList);
      List<Object>actualTestItemsNames= ReadTxt.returnnameList(fileName);
      List<Object>expectedTestItemsNames=new ArrayList<>();
      expectedTestItemsNames.add("Urea");
      expectedTestItemsNames.add("Albumin");

      Assert.assertTrue("nameler uyusmuyor",actualTestItemsNames.containsAll(expectedTestItemsNames));



  }


}


