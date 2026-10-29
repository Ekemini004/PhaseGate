import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class displayParkingSpace{

    @Test //Annotation
    public void testThatParkingSpaceArray_Displayed(){
        
        MiniParkingSystem MiniParkingSystem = new MiniParkingSystem();

        int actual = MiniParkingSystem.displayParkingLot(int [] userArray);
        int [] expected = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]];
    
        Assertions.assertEquals(actual, expected);
                
    }

