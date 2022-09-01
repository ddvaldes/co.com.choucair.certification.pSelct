package userinterface;

import model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static tasks.Dispositivo.*;

public class LlenarDispositivos implements Task {
    private List<Datos> datos;

    public LlenarDispositivos(List<Datos> datos) {
        this.datos = datos;
    }

    public static LlenarDispositivos laPagina(List<Datos> datos) {
        return Tasks.instrumented(LlenarDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(CONTEN_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrComputador()).into(COMPUTADOR).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTEN_VERSION),
                Enter.theValue(datos.get(0).getStrVersion()).into(VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTEN_IDIOMA),
                Enter.theValue(datos.get(0).getStrLenguaje()).into(IDIOMA).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTEN_MOVIL),
                Enter.theValue(datos.get(0).getStrDispositivo()).into(MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTEN_MODELO),
                Enter.theValue(datos.get(0).getStrModelo()).into(MODELO).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTEN_SISTEMA),
                Enter.theValue(datos.get(0).getStrSistema()).into(SISTEMA).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(Boton_S));


    }
}
