package traning;

public class Account {
    private int id;
    private String name;
    private String email;
    private double USD_to_UAN;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getUSD_to_UAN() {
        return USD_to_UAN;
    }

    public void setUSD_to_UAN(double USD_to_UAN) {
        this.USD_to_UAN = USD_to_UAN;
    }
}
