package co.za.midv1990;

/**
 * Created by Ihsaan on 2017/04/03.
 */
public class Sedan extends Vehicle {
    private int numberOfSeats;
    private boolean convertable;



    public Sedan(String vinNumber,String manufacturer,String model,double engineSize,boolean transmissionType,int numberOfSeats,boolean convertable)
    {
        super(vinNumber,manufacturer,model,engineSize,transmissionType);
        this.numberOfSeats = numberOfSeats;
        this.convertable = convertable;
    }


    //getters
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isConvertable() {
        return convertable;
    }

    //setters
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public String toString() {
        return "Sedan Info\n Vin Number: \t"+ getVinNumber()+"\n Manufacturer: \t"+getManufacturer()+"\n Model: \t"+getModel()+"\n Engine SIze: \t"+getEngineSize()+"\n Transmission Type [True = Auto] \t"+getTransmissionType()+"\n Num of Seats: \t"+getNumberOfSeats()+"\n Convertable?: \t"+isConvertable()+"\n";
    }
}
