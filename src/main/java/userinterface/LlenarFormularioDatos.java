package userinterface;


import model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static userinterface.LlenarFormulario.*;

import static userinterface.LlenarFormulario.Nombre;

public class LlenarFormularioDatos implements Task {
    private List<Datos> datos;

    public LlenarFormularioDatos(List<Datos> datos){
        this.datos = datos;
    }
    public static LlenarFormularioDatos laPagina(List<Datos> datos){
        return Tasks.instrumented(LlenarFormularioDatos.class, datos);
    }
@Override
    public <T extends Actor> void performAs(T actor){
    actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(Nombre),
        Enter.theValue(datos.get(0).getStrApellido()).into(Apellido),
        Enter.theValue(datos.get(0).getStrEmail()).into(Email),
        SelectFromOptions.byVisibleText(datos.get(0).getStrMes()).from(MesNa),
        SelectFromOptions.byVisibleText(datos.get(0).getStrDia()).from(DiaNa),
        SelectFromOptions.byVisibleText(datos.get(0).getStrAno()).from(AnoNa),
        Click.on(Boton));

    }
}
