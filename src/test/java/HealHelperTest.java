import com.pews.Helper;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HealHelperTest {
    Helper helper = new Helper();

    @Test
    public void testNegativeWeight () {
        double weight = -1.0;
        double height = 1.7;
        String expectedOutput = "体重值不合法！";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testAboveWeight () {
        double weight = 350.0;
        double height = 1.7;
        String expectedOutput = "体重值不合法！";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testNegativeHeight () {
        double weight = 60.0;
        double height = -1.0;
        String expectedOutput = "身高值不合法！";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testAboveHeight () {
        double weight = 80.0;
        double height = 2.6;
        String expectedOutput = "身高值不合法！";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testUnderweight () {
        double weight = 40.0;
        double height = 1.8;
        String expectedOutput = "您的体重过轻！您的 BMI 值为：12.35";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testNormalWeight () {
        double weight = 60.0;
        double height = 1.6;
        String expectedOutput = "您的体重适中！您的 BMI 值为：23.44";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testOverweight () {
        double weight = 80.0;
        double height = 1.75;
        String expectedOutput = "您的体重过重！您的 BMI 值为：26.12";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testObesity () {
        double weight = 100.0;
        double height = 1.8;
        String expectedOutput = "您的体重肥胖！您的 BMI 值为：30.86";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }

    @Test
    public void testOverObesity () {
        double weight = 120.0;
        double height = 1.65;
        String expectedOutput = "您的体重非常肥胖！您的 BMI 值为：44.08";
        String actualOutput = helper.healHelper(weight, height);
        assertEquals (expectedOutput, actualOutput);
    }
}
