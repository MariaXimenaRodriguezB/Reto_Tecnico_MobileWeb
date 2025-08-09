package co.com.choucair.automation.android.utils.drivers;
import co.com.choucair.automation.android.utils.EnvironmentConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverAndroid {

    public static void setUpAppium(Actor actor) {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        String deviceName =  EnvironmentConstants.deviceName;
        String udidApp = EnvironmentConstants.udidApp;
        String platformName = EnvironmentConstants.platformName;
        String versionPlatform = EnvironmentConstants.versionPlatform;
        String appPackage = EnvironmentConstants.appPackage;
        String appActivity = EnvironmentConstants.appActivity;
        String appiumHub = EnvironmentConstants.appiumHub;

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("udid", udidApp);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", versionPlatform);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("autoGrantPermissions",true);


        try {
            AppiumDriver driver = new AndroidDriver(new URL(appiumHub), capabilities);
            actor.can(BrowseTheWeb.with(driver));
        } catch (MalformedURLException e) {
            throw new RuntimeException("URL de Appium mal formada: " + appiumHub, e);
        }
    }
}
