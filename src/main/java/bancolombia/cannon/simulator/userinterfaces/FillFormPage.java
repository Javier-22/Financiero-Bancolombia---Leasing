package bancolombia.cannon.simulator.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillFormPage {
    public static final Target INPUT_HOUSING=Target.the("Enter the commercial value of the home").located(By.xpath("//input[@id='valor-simulacion']"));
    public static final  Target INPUT_PERCENTAGE=Target.the("Click input Percentage").located(By.xpath("//div[@class='mat-select-value']"));
    public static final  Target  SELECT_PERCENTAGE=Target.the("Click in select percentage").locatedBy("//span[.=' {0} ']");
    public static final  Target  INPUT_YEARS=Target.the("Enter years").locatedBy("//input[@id='valor-year']");
    public static final  Target  INPUT_DATE=Target.the("Enter Calendar").locatedBy("//input[@id='campo-fecha']");
    public static final  Target  FORM_YEAR=Target.the("Form Calendar").locatedBy("//div[.=' {0} ']");
    public static final  Target  BACK_BUTTON=Target.the("Back arrow button").located(By.cssSelector("button[aria-label='Previous 20 years']"));
    public static final  Target  BUTTON_SIMULATE=Target.the("button simulate").locatedBy("//button[@id='boton-simular']");
    public static final Target BUTTON_HOUSING=Target.the("button housing lease").locatedBy("//button[@id='credit-on-UVR-button']");
    public static final Target DEPLOY_BUTTON=Target.the("Deploy button").locatedBy("//mat-expansion-panel-header[@id='mat-expansion-panel-header-3']");
}
