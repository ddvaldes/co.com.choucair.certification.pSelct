package tasks;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UltimaPag {

    public static final Target CONTRASENA = Target.the("CONTRASENA")
            .located(By.id("password"));
    public static final Target CONFIRMA_CONTRASENA = Target.the("CONFIRMA_CONTRASENA")
            .located(By.id("confirmpassword"));

    public static final Target CHECK1 = Target.the("CHECK1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK2 = Target.the("CHECK2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));


    public static final Target CHECK3 = Target.the("CHECK3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


    public static final Target FINAL = Target.the("FINAL")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
