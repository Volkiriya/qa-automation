import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.LoginPage;

public class LoginPageTest {

    @Test
    void loginPageHasUsernameField() {
        open("/");
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();
        $(".inventory_list").shouldBe(visible);
    }

    @ParameterizedTest
    @CsvSource({
            "'','',Username is required",
            "standard_user,'',Password is required",
            "standard_user,bad,Username and password do not match",
    })
    void login_negative(String user, String pass, String expected) {
        LoginPage page = new LoginPage().open();
        page.login(user, pass);
        page.error().shouldHave(text(expected));
    }

}
