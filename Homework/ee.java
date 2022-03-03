import com.codeborne.selenide.Condition;
import com.sun.jdi.ByteValue;
import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ee {
    @Test
    public void elitElectronics(){
        //პირველი დავალება

        open("https://ee.ge/");
        $(byAttribute("class", "btn-register mb-2 mr-4")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byAttribute("id", "firstName")).setValue("nino");
        $(byAttribute("name", "firstName")).shouldNotBe(Condition.empty);
        $(byAttribute("name", "lastName")).setValue("Khutsishvili");
        $(byAttribute("name", "lastName")).shouldNotBe(Condition.empty);
        $(byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        $(byAttribute("name", "email")).shouldNotBe(Condition.empty);
        $(byAttribute("name", "password")).setValue("nino123");
        $(byAttribute("name", "confirmPassword")).setValue("nino123");
        $(byId("singup")).shouldBe(Condition.enabled);
        sleep(1000);
        
    }

    @Test
    public void test2() {
        //მეორე დავალება//

        open("https://ee.ge/registration");
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byName("firstName")).click();
        $(byName("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $(byName("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $(byAttribute("name","password")).pressEnter();
        sleep(3000);
        $(byAttribute("name","confirmPassword")).pressEnter();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $(byId("confirmPassword")).click();
        $(byName("email")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $("#email").setValue("test");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $("#email").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        $("#email").setValue("test@");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $("#email").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        $("#email").setValue("test@gmail");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $("#email").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        $("#email").setValue("test@gmail.");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $("#email").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        $("#password").setValue("12345");
        sleep(3000);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible, Duration.ofMillis(1000));
        $("#password").sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        $("#password").setValue("12345");
        $("#confirmPassword").setValue("123456");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);

    }

}
