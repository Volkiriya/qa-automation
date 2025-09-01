package qa.shopsphere.ui;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qa.shopsphere.ui.pages.LoginPage;

public class LoginSmokeTest {

    @Test @Tag("smoke")
    void openLoginPage() {
        new LoginPage()
                .open()
                .shouldBeOpen();
    }

    @Test @Tag("smoke")
    void loginButtonShouldBeVisible() {
        new LoginPage()
                .open()
                .loginButtonIsVisible();
    }
}