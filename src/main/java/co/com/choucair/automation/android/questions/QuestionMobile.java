package co.com.choucair.automation.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionMobile implements Question<Boolean> {

    public static QuestionMobile value() { return  new QuestionMobile();}


    @Override
    public Boolean answeredBy(Actor actor) {

        String message = actor.recall("Resultado");

        System.out.println("resultado calculadora " + message);

        return null;
    }
}
