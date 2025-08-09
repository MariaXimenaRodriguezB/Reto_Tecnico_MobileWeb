package co.com.choucair.automation.android.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElementValue implements Task {

    private final Target element;
    private final String key;

    public ElementValue(Target element, String key) {
        this.element = element;
        this.key = key;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        String text = Text.of(element).answeredBy(actor);
        actor.remember(key,text);
    }

    public static ElementValue message (Target element, String key) {
        return instrumented(ElementValue.class, element, key);
    }

}
