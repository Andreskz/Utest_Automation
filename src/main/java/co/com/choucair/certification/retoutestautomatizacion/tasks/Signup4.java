package co.com.choucair.certification.retoutestautomatizacion.tasks;

import co.com.choucair.certification.retoutestautomatizacion.model.ChoucairData4;
import co.com.choucair.certification.retoutestautomatizacion.userinterface.FieldMapping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Signup4 implements Task {

    List<ChoucairData4> choucairData4;
    private FieldMapping fieldMapping;

    public Signup4(List<ChoucairData4> choucairData4) {
        this.choucairData4 = choucairData4;
    }

    public static Signup4 form4(List<ChoucairData4> choucairData4) {
        return Tasks.instrumented(Signup4.class,choucairData4);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(fieldMapping.PASSWORD),
                Enter.theValue(choucairData4.get(0).getPassword()).into(fieldMapping.PASSWORD),
                Click.on(fieldMapping.CONFIRMPASSWORD),
                Enter.theValue(choucairData4.get(0).getConfirmPassword()).into(fieldMapping.CONFIRMPASSWORD),

                Click.on(fieldMapping.TERMSOFUSE1),
                Click.on(fieldMapping.TERMSOFUSE2),

                Click.on(fieldMapping.BTNCOMPLETE)
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
