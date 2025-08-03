package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirLaPagina implements Task {
    private final String url;

    public AbrirLaPagina(String url) {
        this.url = url;
    }

    public static AbrirLaPagina en(String url) {
        return instrumented(AbrirLaPagina.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

}
