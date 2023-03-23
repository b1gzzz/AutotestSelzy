import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWindow;
import static org.openqa.selenium.By.xpath;

public class SelzyLogin {
    @Test
    public void emailExists() {
        open("https://cp.selzy.com/en/v5/login");
        $(xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div/div/form/div[2]/div/div[2]/input"))
                .should(Condition.exist);
    }

    @Test
    public void passwordExists() {
        open("https://cp.selzy.com/en/v5/login");
        $(xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div/div/form/div[3]/div[1]/div/div[2]/input"))
                .should(Condition.exist);
    }

    @Test
    public void onlineChat() {
        open("https://cp.selzy.com/en/v5/login");
        $(xpath("/html/body/div[1]/div[3]/div[3]/div/button"))
                .click();
        $(xpath("/html/body/div[5]/div/div[1]"))
                .should(Condition.exist);
    }

    @Test
    public void signUpPage() {

        open("https://cp.selzy.com/en/v5/login");
        $(By.partialLinkText("Sign up")).click();
        $(By.cssSelector("#\\30 1_registration")).should(Condition.exist);

    }

    @Test
    public void logIn() {
        open("https://cp.selzy.com/en/v5/login");
        $(xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div/div/form/div[2]/div/div[2]/input"))
                .setValue("depsilidri@gufum.com");
        $(xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div/div/form/div[3]/div[1]/div/div[2]/input"))
                .setValue("qwertyu");
        $(byText("Log in")).click();
        $(byText("Let's keep in touch")).should(Condition.exist);
        closeWindow();
    }

}
