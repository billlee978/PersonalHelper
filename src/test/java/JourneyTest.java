import com.pews.JourneyFunction;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JourneyTest {
    @Test
    public void writeBoxTesting() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        JourneyFunction journeyFunction = new JourneyFunction();

        String string = "2009-08-07";
        Date date1 = simpleDateFormat.parse(string);
        journeyFunction.journey(date1, "沈阳");
        System.out.println(journeyFunction.getJourneys());
        journeyFunction.delete(date1, "沈阳");
        System.out.println(journeyFunction.getJourneys());

        String str1 = "2009-08-32";
        Date date2 = simpleDateFormat.parse(str1);
        journeyFunction.journey(date1, "沈阳");
        System.out.println(journeyFunction.getJourneys());
        journeyFunction.delete(date2, "沈阳");
        System.out.println(journeyFunction.getJourneys());

        String str2 = "40-90";
        Date date3 = simpleDateFormat.parse(str2);
        journeyFunction.journey(date3, "沈阳");
        System.out.println(journeyFunction.getJourneys());
        journeyFunction.delete(date3, "沈阳");
        System.out.println(journeyFunction.getJourneys());
    }
}
