package utilities;

import com.google.gson.Gson;
import pojos.Appointment;
import pojos.Registrant;
import pojos.US25_appointment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt {


    public static void saveRegistrantData(Registrant registrant) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_registrant_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void saveAppointData(Appointment appointment) {

        try {

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("appointment_records"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveAppointmentDatalar(US25_appointment us25appointment) {

        try {

            //src/test/resources/testdata/AppointmentDatalar.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("AppointmentDatalar"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(us25appointment + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveAppointmentApiDatalar(US25_appointment us25appointment) {

        try {

            //src/test/resources/testdata/AppointmentDatalar.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("AppointmentApiDatalar"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(us25appointment + "\n");

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void saveRegistrantData(List<Object> SSNIds) {

        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("database_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachSSN : SSNIds) {
                writer.append(eachSSN + ",\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void saveRegistrantData(Registrant[] registrants) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_all_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            for (int i = 0; i < registrants.length; i++) {
                writer.append(registrants[i].getFirstName() + "," + registrants[i].getLastName() + "," + registrants[i].getSsn() + "," + registrants[i].getLogin() +
                        "," + registrants[i].getId() + "," + registrants[i].getEmail() + "\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //tugba

    public static void saveAppointmentIds(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));
            for (int i = 0; i < id.size(); i++)
                writer.append(id.get(i).toString()+",\n");


            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //tugba
    public static void saveAppointmentStatus(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));
            for (int i = 0; i < id.size(); i++)
                writer.append(id.get(i).toString()+",\n");


            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //tugba
    public static void saveAppointmentStartDate(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));
            for (int i = 0; i < id.size(); i++)
                writer.append(id.get(i).toString()+",\n");


            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //tugba
    public static void saveAppointmentEndDate(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));
            for (int i = 0; i < id.size(); i++)
                writer.append(id.get(i).toString()+",\n");


            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void saveNameList(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));
            for (int i = 0; i < id.size(); i++)
                writer.append(id.get(i).toString()+",\n");


            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
