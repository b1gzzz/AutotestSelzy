import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelzyLogin {
    @Test
    public void signUpPage() {

        open("https://cp.selzy.com/en/v5/login");
        $(By.partialLinkText("Sign up")).click();
        $(By.cssSelector("#\\30 1_registration")).should(Condition.exist);

    }


}
