import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPageTest {
    @BeforeAll
    static void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.saucedemo.com";
    }

    @Test
    void loginPageHasUsernameField() {
        open("/");
        $("#user-name").should(exist);
    }
}
