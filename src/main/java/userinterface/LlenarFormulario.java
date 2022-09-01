package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class LlenarFormulario {

    public static final Target Nombre = Target.the("First name")
            .located(By.id("firstName"));
    public static final Target Apellido = Target.the("Last name")
            .located(By.id("lastName"));
    public static final Target Email = Target.the("Email address")
            .located(By.id("email"));
    public static final Target MesNa = Target.the("Mes Nacimiento")
            .located(By.id("birthMonth"));
    public static final Target DiaNa = Target.the("dia Nacimiento")
            .located(By.id("birthDay"));
    public static final Target AnoNa = Target.the("año Nacimiento")
            .located(By.id("birthYear"));
    public static final Target Boton = Target.the("Siguiente")
            .located(By.xpath("//a[@class='btn btn-blue']"));


}
