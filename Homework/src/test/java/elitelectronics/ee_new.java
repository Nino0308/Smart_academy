package elitelectronics;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Utils.runner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.title;

public class ee_new extends runner {
    public ee_new() {
    }


    @Test
    public void elitElectronics() {

        Selenide.$(Selectors.byAttribute("class", "btn-register mb-2 mr-4")).click();
        Selenide.$(Selectors.byText("სწრაფი რეგისტრაცია")).shouldBe(new Condition[]{Condition.visible});
        Selenide.$(Selectors.byAttribute("id", "firstName")).setValue("nino");
        Selenide.$(Selectors.byAttribute("name", "lastName")).setValue("Khutsishvili");
        Selenide.$(Selectors.byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        Selenide.$(Selectors.byAttribute("name", "password")).setValue("nino123");
        Selenide.$(Selectors.byAttribute("name", "confirmPassword")).setValue("nino123");
        Selenide.$(Selectors.byId("singup")).shouldBe(new Condition[]{Condition.enabled});

        Assert.assertEquals("რეგისტრაცია | Elit Electronics", title());
        Assert.assertEquals("nino", Selenide.$(Selectors.byAttribute("id", "firstName")).getValue());
        Assert.assertEquals("Khutsishvili", Selenide.$(Selectors.byAttribute("name", "lastName")).getValue());
        Assert.assertEquals("ninoo.khutsishvili@gmail.com", Selenide.$(Selectors.byAttribute("name", "email")).getValue());
        Assert.assertEquals("nino123", Selenide.$(Selectors.byAttribute("name", "password")).getValue());
        Assert.assertEquals("nino123", Selenide.$(Selectors.byAttribute("name", "confirmPassword")).getValue());

        Selenide.sleep(1000L);

    }
}
