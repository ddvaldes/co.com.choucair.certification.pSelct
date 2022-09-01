package tasks;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Direccion {

    public static final Target Cuidad = Target.the("Cuidad")
            .located(By.id("city"));
    public static final Target CodPostal = Target.the("CodPostal")
            .located(By.id("zip"));
    public static final Target Conten = Target.the("Conten")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target Pais = Target.the("Pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));


public static final Target Boton = Target.the("boton")
        .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}


