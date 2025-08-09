package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.models.TblDataProcess;
import co.com.choucair.automation.android.utils.ElementValue;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static co.com.choucair.automation.android.userinterfaces.ScreenMobile.*;

public class OperationsMobile implements Task {

    private final TblDataProcess tblDataProcess;

    public OperationsMobile(TblDataProcess tblDataProcess) {
        this.tblDataProcess = tblDataProcess;
    }

    public static OperationsMobile data(TblDataProcess tblDataProcess){
        return Tasks.instrumented(OperationsMobile.class,tblDataProcess);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLEAN_TEXT),
                Click.on(NUMBER_BUTTON.of(tblDataProcess.getNumberOne())),
                Click.on(OPERATION_BUTTON.of(tblDataProcess.getOperation())),
                Click.on(NUMBER_BUTTON.of(tblDataProcess.getNumberTwo())),
                Click.on(RESULT_BUTTON),
                ElementValue.message(RESULT_TEXT,"Resultado")

        );



        int numberOne = Integer.parseInt(tblDataProcess.getNumberOne());
        int numberTwo = Integer.parseInt(tblDataProcess.getNumberTwo());

        int result = 0;

        switch (tblDataProcess.getOperation()) {

            case "plus" -> result = (numberOne+numberTwo);
            case "minus" -> result = numberOne-numberTwo;
            case "multiply" -> result = (numberOne*numberTwo);
            case "divide" -> result = (numberOne/numberTwo);

        }


        System.out.println("resulta java" + result);

    }


}
