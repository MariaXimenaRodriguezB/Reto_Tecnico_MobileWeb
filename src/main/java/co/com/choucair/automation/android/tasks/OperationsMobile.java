package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.models.DataProcess;
import co.com.choucair.automation.android.models.ExecutionData;
import co.com.choucair.automation.android.utils.ElementValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automation.android.userinterfaces.ScreenMobile.*;

public class OperationsMobile implements Task {

    private final DataProcess dataProcess;

    public OperationsMobile(DataProcess dataProcess) {
        this.dataProcess = dataProcess;
    }

    public static OperationsMobile data(DataProcess dataProcess){
        return Tasks.instrumented(OperationsMobile.class, dataProcess);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLEAN_TEXT),
                Click.on(NUMBER_BUTTON.of(dataProcess.getNumberOne())),
                Click.on(OPERATION_BUTTON.of(dataProcess.getOperation())),
                Click.on(NUMBER_BUTTON.of(dataProcess.getNumberTwo())),
                Click.on(RESULT_BUTTON),
                ElementValue.message(RESULT_TEXT,"Resultado")

        );

        int numberOne = Integer.parseInt(dataProcess.getNumberOne());
        int numberTwo = Integer.parseInt(dataProcess.getNumberTwo());

        int result = 0;

        switch (dataProcess.getOperation()) {

            case "plus" -> result = (numberOne+numberTwo);
            case "minus" -> result = numberOne-numberTwo;
            case "multiply" -> result = (numberOne*numberTwo);
            case "divide" -> result = (numberOne/numberTwo);

        }
        ExecutionData.setResultAuto(result);

    }

}
