import com.pews.JourneyFunction;
import org.junit.Test;

public class JourneyTest {
    @Test
    public void blackBoxTesting(){
        JourneyFunction journeyFunction = new JourneyFunction();
        journeyFunction.journey("090807", null);
        journeyFunction.journey("090807", "沈阳");
        journeyFunction.journey("4090", "沈阳");
        journeyFunction.journey("1000000", "沈阳");
        System.out.println(journeyFunction.getJourneys());
        journeyFunction.delete("090807", "沈阳");
        System.out.println(journeyFunction.getJourneys());
    }
}
