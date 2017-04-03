package co.za.midv1990;

import junit.framework.TestCase;

/**
 * Created by Ihsaan on 2017/04/03.
 */
public class DemoTest extends TestCase {
    public void testShowPoly() throws Exception {
        System.out.print("Testing Polymorphism, Vehicle v1 = new Sedan\n");
        Vehicle v1 = new Sedan("123ABC456DE", "Audi", "A4", 4.2, true, 5,false);
        System.out.print(v1.toString()+"\n\n");

    }

    public void testShowInheritance() throws Exception {

    }

    public void testShowEncapsulation() throws Exception {

    }

    public void testShowComposition() throws Exception {

    }

}