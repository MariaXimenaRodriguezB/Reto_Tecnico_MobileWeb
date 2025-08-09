package co.com.choucair.automation.android.stepdefinitions.mobile;

import co.com.choucair.automation.android.utils.drivers.DriverAndroid;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.BeforeClass;

public class HooksMobile {

    @BeforeClass
    public static void setUpTags() {
        String tags = System.getProperty("cucumber.filter.tags", "@defaultTag");
        System.setProperty("cucumber.filter.tags", tags);
    }

    @Before()
    public void setUpMobile() {
        OnStage.setTheStage(new OnlineCast());
       // DriverAndroid.setUpAppium(OnStage.theActorCalled("Maria"));
    }

}
