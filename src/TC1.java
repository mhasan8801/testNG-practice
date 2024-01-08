import org.testng.annotations.Test;

public class TC1 {

    @Test
    void setup(){
        System.out.println("I am inside setup");
    }

    @Test
    void testSteps(){
        System.out.println("I am inside testSteps");
    }

    @Test
    void tearDown(){
        System.out.println("I am inside tearDown");
    }

}
