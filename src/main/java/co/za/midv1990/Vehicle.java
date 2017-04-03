package co.za.midv1990;

/**
 * Created by Ihsaan on 2017/04/03.
 */
public class Vehicle {
    private String vinNumber;
    private String manufacturer;
    private String model;
    private double engineSize;
    private boolean transmissionType;
    private String driveType;
    private Hatch compHatch;


    Vehicle()
    {

    }

    Vehicle(String vinNumber,String manufacturer,String model,double engineSize,boolean transmissionType,int numberOfDoors,boolean convertable)
    {
        compHatch = new Hatch(numberOfDoors,convertable);

        this.vinNumber = vinNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.engineSize = engineSize;
        this.transmissionType = transmissionType;
    }

    public int getHatchDoors()
    {
        return compHatch.getNumberOfDoors();
    }

    public boolean getHatchConvert()
    {
        return compHatch.isConvertable();
    }

    Vehicle(String vinNumber,String manufacturer,String model,double engineSize,boolean transmissionType)
    {
        this.vinNumber = vinNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.engineSize = engineSize;
        this.transmissionType = transmissionType;
    }

    //getters
    public String getVinNumber() {
        return vinNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public boolean getTransmissionType() {
        return transmissionType;
    }

    public String getDriveType() {
        return driveType;
    }

    //setters
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setTransmissionType(boolean transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String toString()
    {
        return "Vehicle Details:\n Vin Number: \t"+ getVinNumber()+"\n Manufacturer: \t"+getManufacturer()+"\n Model: \t"+getModel()+"\n Engine SIze: \t"+getEngineSize()+"\n Transmission Type [True = Auto] \t"+getTransmissionType()+"\n";
    }
}
