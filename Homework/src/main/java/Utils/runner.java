package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class runner {
    @BeforeTest

    public static void setup() {
        Configuration.browser = "chrome";
        Selenide.open("https://ee.ge/");
    }

}




