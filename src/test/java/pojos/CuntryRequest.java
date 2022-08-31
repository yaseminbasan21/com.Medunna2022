package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CuntryRequest {
    private String name;

    public CuntryRequest() {
    }

    public CuntryRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CuntryRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
