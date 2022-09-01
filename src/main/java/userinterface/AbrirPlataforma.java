package userinterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPlataforma implements Task  {
    private UtestPlataforma plataforma;
    public static AbrirPlataforma laPagina(){
        return Tasks.instrumented(AbrirPlataforma.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(plataforma),
        Click.on(UtestPlataforma.JOIN));
    }

}
