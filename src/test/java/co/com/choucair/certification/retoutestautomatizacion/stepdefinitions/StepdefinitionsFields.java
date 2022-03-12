package co.com.choucair.certification.retoutestautomatizacion.stepdefinitions;

import co.com.choucair.certification.retoutestautomatizacion.model.ChoucairData;
import co.com.choucair.certification.retoutestautomatizacion.model.ChoucairData2;
import co.com.choucair.certification.retoutestautomatizacion.model.ChoucairData3;
import co.com.choucair.certification.retoutestautomatizacion.tasks.ClickJoin;
import co.com.choucair.certification.retoutestautomatizacion.tasks.OpenPage;
import co.com.choucair.certification.retoutestautomatizacion.tasks.Signup;
import co.com.choucair.certification.retoutestautomatizacion.tasks.Signup2;
import co.com.choucair.certification.retoutestautomatizacion.tasks.Signup3;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepdefinitionsFields {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Johnathan ingresa a la pagina de Utest$")
    public void queJohnathanIngresaALaPaginaDeUtest() throws Exception {
        OnStage.theActorCalled("").attemptsTo(OpenPage.page());
    }

    @And("^le da click en el boton JOINTODAY$")
    public void leDaClickEnElBotonJOINTODAY() throws Exception {
        OnStage.theActorCalled("").attemptsTo(ClickJoin.button());

    }

    @When("^diligencia el formulario en el paso uno$")
    public void diligenciaElFormularioEnElPasoUno(List<ChoucairData> choucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Signup.form1(choucairData));

    }

    @And("^diligencia el formulario del paso dos$")
    public void diligenciaElFormularioDelPasoDos(List<ChoucairData2> choucairData2) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Signup2.form2(choucairData2));

    }

    @And("^diligencia el formulario del paso tres$")
    public void diligenciaElFormularioDelPasoTres(List<ChoucairData3> choucairData3) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Signup3.form3(choucairData3));

    }

    /*@And("^diligencia el formulario del paso cuatro$")
    public void diligenciaElFormularioDelPasoCuatro(List<ChoucairData> choucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Signup.form4(choucairData));

    }*/

    @Then("^Verifica que completo el registro$")
    public void verificaQueCompletoElRegistro() throws Exception {

    }

}