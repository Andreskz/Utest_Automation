package co.com.choucair.certification.retoutestautomatizacion.tasks;

import co.com.choucair.certification.retoutestautomatizacion.model.ChoucairData;
import co.com.choucair.certification.retoutestautomatizacion.userinterface.FieldMapping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Signup implements Task {

    List<ChoucairData> choucairData;
    private FieldMapping fieldMapping;

    public Signup(List<ChoucairData> choucairData)
    {
      this.choucairData = choucairData;
    }

    public static Signup form1(List<ChoucairData> choucairData) {
        return Tasks.instrumented(Signup.class,choucairData);
    }

    /* public static Signup form2(List<ChoucairData> choucairData) {
        return Tasks.instrumented(Signup.class,choucairData);
    }

   public static Signup form4(List<ChoucairData> choucairData) {
        return Tasks.instrumented(Signup.class,choucairData);
    }

    public static Signup form3(List<ChoucairData> choucairData) {
        return Tasks.instrumented(Signup.class,choucairData);
    }*/

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(fieldMapping.FIRTS_NAME),
                Enter.theValue(choucairData.get(0).getFirstName()).into(fieldMapping.FIRTS_NAME),
                Click.on(fieldMapping.LAST_NAME),
                Enter.theValue(choucairData.get(0).getLastName()).into(fieldMapping.LAST_NAME),
                Click.on(fieldMapping.EMAIL),
                Enter.theValue(choucairData.get(0).getEmail()).into(fieldMapping.EMAIL),
                Click.on(fieldMapping.BIRTHMONTH),
                Click.on(fieldMapping.BIRTHMONTHCLICK),
                Click.on(fieldMapping.BIRTHDAY),
                Click.on(fieldMapping.BIRTHDAYCLICK),
                Click.on(fieldMapping.BIRTHYEAR),
                Click.on(fieldMapping.BIRTHYEARCLICK),
                Click.on(fieldMapping.LANGUAGES),
                Click.on(fieldMapping.LANGUAGESCLICK),
                Click.on(fieldMapping.NEXTLOCATION)
        );
    }
}
