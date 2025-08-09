package co.com.choucair.automation.android.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ScreenMobile {

    public static final Target NUMBER_BUTTON = Target.the("Number {0} Button").locatedBy("//android.widget.TextView[@resource-id=\"com.miui.calculator:id/digit_{0}\"]");
    public static final Target OPERATION_BUTTON = Target.the("Operation {0} Button").locatedBy("//android.widget.ImageView[@content-desc=\"{0}\"]");
    public static final Target RESULT_BUTTON = Target.the("Result Buttton").located(By.id("com.miui.calculator:id/btn_equal_s"));
    public static final Target RESULT_TEXT = Target.the("The result").located(By.id("com.miui.calculator:id/expression"));
    public static final Target CLEAN_TEXT = Target.the("Limpiar historial").located(By.id("com.miui.calculator:id/btn_c_s"));

}
