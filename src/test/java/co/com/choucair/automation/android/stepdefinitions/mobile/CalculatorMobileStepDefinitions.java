package co.com.choucair.automation.android.stepdefinitions.mobile;

import co.com.choucair.automation.android.models.SetData;
import co.com.choucair.automation.android.questions.QuestionMobile;
import co.com.choucair.automation.android.tasks.OperationsMobile;
import co.com.choucair.automation.android.utils.drivers.DriverAndroid;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CalculatorMobileStepDefinitions {

    private final SetData setData = new SetData();

    @Given("Into the application")
    public void intoTheApplication() {
        DriverAndroid.setUpAppium(OnStage.theActorCalled("Maria"));
    }

    @When("Enter the number and type of operation")
    public void enterTheNumberAndTypeOfOperation(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(OperationsMobile.data(setData.setData(dataTable).get(0)));

    }
    @Then("Validate the results")
    public void validate_the_results() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(QuestionMobile.value()));
    }

}
