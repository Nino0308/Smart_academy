package elitelectronics;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.time.Duration;

public class Elit {

    @Test
    public void test2() {
        Selenide.open("https://ee.ge/registration");
        Selenide.$(Selectors.byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$(Selectors.byId("singup")).shouldBe(new Condition[]{Condition.disabled});
        Selenide.$(Selectors.byName("firstName")).click();
        Selenide.$(Selectors.byName("lastName")).click();
        Selenide.$(Selectors.byText("სახელი სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$(Selectors.byName("email")).click();
        Selenide.$(Selectors.byText("გვარი სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$(Selectors.byAttribute("name", "password")).pressEnter();
        Selenide.sleep(3000L);
        Selenide.$(Selectors.byAttribute("name", "confirmPassword")).pressEnter();
        Selenide.$(Selectors.byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$(Selectors.byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$(Selectors.byId("confirmPassword")).click();
        Selenide.$(Selectors.byName("email")).click();
        Selenide.$(Selectors.byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$("#email").setValue("test");
        Selenide.$(Selectors.byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$("#email").sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL, "a", Keys.DELETE})});
        Selenide.$("#email").setValue("test@");
        Selenide.$(Selectors.byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$("#email").sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL, "a", Keys.DELETE})});
        Selenide.$("#email").setValue("test@gmail");
        Selenide.$(Selectors.byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$("#email").sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL, "a", Keys.DELETE})});
        Selenide.$("#email").setValue("test@gmail.");
        Selenide.$(Selectors.byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$("#email").sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL, "a", Keys.DELETE})});
        Selenide.$("#password").setValue("12345");
        Selenide.sleep(3000L);
        Selenide.$(Selectors.byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible, Duration.ofMillis(1000L));
        Selenide.$("#password").sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL, "a", Keys.DELETE})});
        Selenide.$("#password").setValue("12345");
        Selenide.$("#confirmPassword").setValue("123456");
        Selenide.$(Selectors.byText("პაროლის გამეორება სავალდებულოა")).shouldBe(new Condition[]{Condition.visible});
    }
}
