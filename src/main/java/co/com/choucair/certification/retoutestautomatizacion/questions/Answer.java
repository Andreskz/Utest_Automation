package co.com.choucair.certification.retoutestautomatizacion.questions;


import co.com.choucair.certification.retoutestautomatizacion.userinterface.FieldMapping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        //Compara el texto de la ultima pagina con el que se manda del feature
        String bienvenido = Text.of(FieldMapping.TEXTO).viewedBy(actor).asString();
        if (question.equals(bienvenido)){
            result = true;
        }else {
            result = false;
        }
        return result;

    }
}
