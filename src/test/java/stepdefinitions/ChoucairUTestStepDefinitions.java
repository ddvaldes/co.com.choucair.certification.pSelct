package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Datos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Responder;
import userinterface.*;

import java.util.List;

public class ChoucairUTestStepDefinitions {


    @Given("^Daniela desea registrarse en la plataforma Utest$")
    public void daniela_desea_registrarse_en_la_plataforma_Utest() {
        OnStage.theActorCalled("Daniela").wasAbleTo(AbrirPlataforma.laPagina());
    }

    @When("^Daniela ingresa toda la informacioón requerida por la pagina$")
    public void daniela_ingresa_toda_la_informacioon_requerida_por_la_pagina(List<Datos> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioDatos.laPagina(datos), LlenarDireccion.laPagina(datos),
                LlenarDispositivos.laPagina(datos), LlevarFinal.laPagina(datos)
            );
    }

    @Then("^el registro se completa cuando aparece el Boton Complete Setu$")
    public void el_registro_se_completa_cuando_aparece_el_Boton_Complete_Setu(List<Datos> datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.a(datos)));
    }

}
