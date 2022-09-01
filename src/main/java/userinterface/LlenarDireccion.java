package userinterface;


import model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static tasks.Direccion.*;


public class LlenarDireccion implements Task {
    private List<Datos> datos;
    public LlenarDireccion(List<Datos> datos){
        this.datos = datos;
    }
    public static LlenarDireccion laPagina(List<Datos> datos){
        return Tasks.instrumented(LlenarDireccion.class, datos);

    }

    @Override

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCodPostal()).into(Cuidad),
                Hit.the(Keys.ARROW_DOWN).into(Cuidad),
                Hit.the(Keys.ENTER).into(Cuidad),
                Enter.theValue(datos.get(0).getStrCodPostal()).into(CodPostal),
                Click.on(Conten),
        Enter.theValue(datos.get(0).getStrPais()).into(Pais).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
        Click.on(Boton));
    }
}
