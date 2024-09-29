package TaxiBackend;


public class TaxiService {
    
    
    public AddTaxi createTaxi(String taxiID, int capacity, String model, int year) {
        AddTaxi taxi = new AddTaxi();
        taxi.setTaxiID(taxiID);
        taxi.setCapacity(capacity);
        taxi.setModel(model);
        taxi.setYear(year);
        return taxi;
    }
}

    

