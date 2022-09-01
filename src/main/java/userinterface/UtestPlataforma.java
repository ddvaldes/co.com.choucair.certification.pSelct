package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class UtestPlataforma extends PageObject {

    public static final Target JOIN = Target.the("JOIN TODAY")
            .located(By.xpath("//a[@unauthenticated-nav-bar__sign-up]"));
}
