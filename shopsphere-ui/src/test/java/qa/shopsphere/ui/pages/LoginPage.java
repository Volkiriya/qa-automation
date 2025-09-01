package qa.shopsphere.ui.pages;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class LoginPage {
    public LoginPage open() {
        com.codeborne.selenide.Selenide.open("/");
        return this;
    }
    public LoginPage shouldBeOpen() {
        $("#user-name").shouldBe(visible);
        return this;
    }
    public LoginPage loginButtonIsVisible() {
        $("#login-button").shouldBe(visible);
        return this;
    }
    public LoginPage login(String username, String password) {
        $("#user-name").setValue(username);
        $("#password").setValue(password);
        $("#login-button").click();
        return this;
    }
    public LoginPage errorVisible() {
        $("[data-test='error']").shouldBe(visible);
        return this;
    }
}