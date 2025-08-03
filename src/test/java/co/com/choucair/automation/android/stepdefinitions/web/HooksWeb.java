package co.com.choucair.automation.android.stepdefinitions.web;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.BeforeClass;

public class HooksWeb {

    @Before()
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @BeforeClass
    public static void setUpTags() {
        String tags = System.getProperty("cucumber.filter.tags", "@defaultTag");
        System.setProperty("cucumber.filter.tags", tags);
    }


}
