package co.com.choucair.certification.retoutestautomatizacion.tasks;


import co.com.choucair.certification.retoutestautomatizacion.userinterface.FieldMapping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class ClickJoin implements Task {

 private FieldMapping fieldMapping;
    public static ClickJoin button() {
        return Tasks.instrumented(ClickJoin.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(fieldMapping.JOIN_TODAY));
    }
}
