package co.com.choucair.certification.retoutestautomatizacion.tasks;

import co.com.choucair.certification.retoutestautomatizacion.model.ChoucairData3;
import co.com.choucair.certification.retoutestautomatizacion.userinterface.FieldMapping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class Signup3 implements Task{

    List<ChoucairData3> choucairData3;
    private FieldMapping fieldMapping;

    public Signup3(List<ChoucairData3> choucairData3) {
        this.choucairData3 = choucairData3;
    }

    public static Signup3 form3(List<ChoucairData3> choucairData3) {
        return Tasks.instrumented(Signup3.class,choucairData3);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(fieldMapping.MOVILEDEVICE),
                Click.on(fieldMapping.MOVILEDEVICEAPPLE),


                   Click.on(fieldMapping.MODELDEVICE),
                   Click.on(fieldMapping.MODELDEVICECLICK),


                    Click.on(fieldMapping.OSSELECT),
                    Click.on(fieldMapping.OSSELECTCLICK),


                Click.on(fieldMapping.NEXTLASTSTEP)
        );
    }
}
