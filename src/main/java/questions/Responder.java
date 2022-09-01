package questions;

import model.Datos;
import tasks.UltimaPag;
import model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<Datos> datos;
    public Responder(List<Datos> datos){
        this.datos = datos;
    }
    public static Responder a(List<Datos> datos){
        return new Responder(datos);
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        String FINAL = Text.of(UltimaPag.FINAL).viewedBy(actor).asString();
            return datos.get(0).equals(FINAL);

    }
}
