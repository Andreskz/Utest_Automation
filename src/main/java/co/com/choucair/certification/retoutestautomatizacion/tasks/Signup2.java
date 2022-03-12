package co.com.choucair.certification.retoutestautomatizacion.tasks;

import co.com.choucair.certification.retoutestautomatizacion.model.ChoucairData2;
import co.com.choucair.certification.retoutestautomatizacion.userinterface.FieldMapping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Signup2 implements Task{


    List<ChoucairData2> choucairData2;
    private FieldMapping fieldMapping;

    public Signup2(List<ChoucairData2> choucairData2) {
        this.choucairData2 = choucairData2;
    }

    public static Signup2 form2(List<ChoucairData2> choucairData2) {
        return Tasks.instrumented(Signup2.class,choucairData2);
    }


        @Override
        public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(fieldMapping.CITY),
                    Enter.theValue(choucairData2.get(0).getCity()).into(fieldMapping.CITY),

                   /* Click.on(fieldMapping.ZIP),
                    Enter.theValue(choucairData2.get(0).getZip()).into(fieldMapping.ZIP),

                    Click.on(fieldMapping.COUNTRY),
                    Enter.theValue(choucairData2.get(0).getCountry()).into(fieldMapping.COUNTRY),*/

                    Click.on(fieldMapping.NEXTDEVICE)
            );
    }
}
