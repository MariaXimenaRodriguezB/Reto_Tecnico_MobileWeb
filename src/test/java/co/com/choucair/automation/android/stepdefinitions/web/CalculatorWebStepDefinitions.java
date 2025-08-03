package co.com.choucair.automation.android.stepdefinitions.web;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class CalculatorWebStepDefinitions {

    @Given("Into the url application")
    public void intoTheUrlApplication() {
        OnStage.theActorCalled("Maria").wasAbleTo(Open.url("https://www.rojadirectaenvivo.pl/"));

    }

}
