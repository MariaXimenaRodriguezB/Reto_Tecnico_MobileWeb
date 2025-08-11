package co.com.choucair.automation.android.questions;

import co.com.choucair.automation.android.models.ExecutionData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionMobile implements Question<Boolean> {

    public static QuestionMobile value() { return  new QuestionMobile();}


    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean resultOperation;

        String message = actor.recall("Resultado");

        String numberStr = message.split("=")[1].trim(); // Divide la cadena por '=', toma la segunda parte y elimina espacios
        int number = Integer.parseInt(numberStr); // Convierte la cadena a entero


        if (number == ExecutionData.resultAuto) {
            resultOperation = true;
        } else {
            resultOperation = false;
        }

        return resultOperation;
    }
}
