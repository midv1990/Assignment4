package co.za.midv1990;

/**
 * Created by Ihsaan on 2017/04/03.
 */
public class Hatch {


    private int numberOfDoors;
    private boolean convertable;

    public Hatch(int numberOfDoors,boolean convertable)
    {

        this.numberOfDoors = numberOfDoors;
        this.convertable = convertable;
    }

    //getters

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    //setters

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }
}
