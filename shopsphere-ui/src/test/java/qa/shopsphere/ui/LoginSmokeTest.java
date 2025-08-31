package qa.shopsphere.ui;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selenide.open;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginSmokeTest {
    @Test @Tag("smoke")
    void openLoginPage() {
        open("/");
        $("#user-name").shouldBe(visible);
    }

    @Test
    @Tag("smoke")
    void canLoginWithValidCreds() {

    }
}