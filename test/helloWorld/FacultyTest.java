package at.htlw.neumair;

import junit.awtui.TestRunner;
import junit.framework.TestCase;

/**
 * Created by neuma on 03.03.2017.
 */
public class FacultyTest extends TestCase {


    public void testFaculty(){
        Faculty fac5 = new Faculty();
        assertTrue(120 == fac5.faculty(5));
    }

    public static void main(String[] args){
        TestRunner.run(FacultyTest.class);
    }

}
