
package TaxiBackend;


public class AddTaxi {
    
    private String taxiID;
    private int capacity;
    private String model;
    private int year;
    public AddTaxi(){
    }
    public AddTaxi(String taxiID, int capacity, String model, int year) {
        this.taxiID = taxiID;
        this.capacity = capacity;
        this.model = model;
        this.year = year;
    }

    // Getters and Setters
    public String getTaxiID() {
        return taxiID;
    }

    public void setTaxiID(String taxiID) {
        this.taxiID = taxiID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

    

