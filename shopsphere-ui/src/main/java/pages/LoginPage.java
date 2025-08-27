package pages;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

public class LoginPage {
    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public LoginPage login(String username, String password) {
        $("#user-name").setValue(username);
        $("#password").setValue(password);
        $("#login-button").click();
        return this;
    }

    public SelenideElement error() {
        return $("[data-test='error']");
    }

}
