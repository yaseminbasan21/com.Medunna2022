package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_017_Test_items {

    /*
     {
        "createdBy": "ogunes",
        "createdDate": "2022-07-21T14:00:10.086367Z",
        "id": 132000,
        "name": "cccs",
        "description": "ok",
        "price": 20.00,
        "defaultValMin": "15",
        "defaultValMax": "45"
    },
    {
        "createdBy": "adminhalimharap",
        "createdDate": "2022-08-26T07:39:08.060349Z",
        "id": 232899,
        "name": "team61test1",
        "description": "test1",
        "price": 35.00,
        "defaultValMin": "70",
        "defaultValMax": "120"
    },
     */
    private String name;
    private String description;
    private double price;
    private String defaultValMin;
    private String defaultValMax;

    public US_017_Test_items() {

    }

    public US_017_Test_items(String name, String description, double price, String defaultValMin, String defaultValMax) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    @Override
    public String toString() {
        return "US_017_Test_items{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }
}
