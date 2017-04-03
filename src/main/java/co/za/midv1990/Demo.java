package co.za.midv1990;

/**
 * Created by Ihsaan on 2017/04/03.
 */
public class Demo {
    //This method implements polymorphism
    public static  void showPoly(){

        System.out.print("Testing Polymorphism, Vehicle v1 = new Sedan\n");
        Vehicle v1 = new Sedan("123ABC456DE", "Audi", "A4", 4.2, true, 5,false);
        System.out.print(v1.toString()+"\n\n");
    }

    public static void showInheritance()
    {
        System.out.print("Testing Inheritance,Vehicle v2 = new Vehicle() AND Vehicle s1 = new Sedan()\n");
        Vehicle v2 = new Vehicle("456CDE789FG","Bentley","Continental GT",6.0,false);
        Vehicle s1 = new Sedan("789FGH123IJ","Nissan","Skyline",3.50,true,4,false);

        System.out.print(v2.toString());
        System.out.print(s1.toString());
        System.out.print("\n\n");

    }

    public static void showEncapsulation()
    {
        Sedan s2 = new Sedan("987DEF654DE","Ferrari","Berlinetta",6,true,2,false);

        System.out.print("Testing Encapsulation\n");
        System.out.print("Before Changes: \n"+ s2.toString());
        s2.setConvertable(true);
        s2.setNumberOfSeats(4);
        s2.setEngineSize(5.50);
        s2.setModel("Maranello");

        System.out.print("After Changes: \n" + s2.toString());
        System.out.print("\n\n");


    }

    public static void showComposition()
    {
        Vehicle vComp = new Vehicle("954HAL587AW","Ford","Mustang",5.0,true,5,true);

        System.out.print(""+vComp.toString());

        System.out.print("Showing Hatch Class info without Inheritance, but rather Composition\n");
        System.out.print("Number of Doors: "+vComp.getHatchDoors()+"\n");
        System.out.print("Is Convertable: "+vComp.getHatchConvert()+"\n");

    }
}
