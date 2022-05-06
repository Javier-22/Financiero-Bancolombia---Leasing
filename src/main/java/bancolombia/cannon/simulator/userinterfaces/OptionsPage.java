package bancolombia.cannon.simulator.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OptionsPage {
    //public static final Target OPTIONX=Target.the("Click X").located(By.xpath("//button[@class='btn-close-modal btn-modal']"));
    public static final Target OPTIONPRODUCTANDSERVICES=Target.the("click in product and serveces").located(By.xpath("//a[@id='menu-productos']"));
    public static final Target LEASING=Target.the("click in leasing").located(By.xpath("//a[@id='header-productos-leasing']"));
    public static final Target OPTION_LH=Target.the("Click in housing lease").located(By.xpath("//div[@class='leer-mas']//a[@title='Leasing Habitacional']"));
    public static final Target OPTION_SIMULATES=Target.the("To select Simulate").located(By.xpath("//div[@class='swiper-slide sticky-item']//a[@href='/personas/creditos/vivienda/simulador-credito-vivienda']"));
    public static final Target OPTIONHOMEVALUE=Target.the("Select based on home value").located(By.xpath("//div[@id='calcular-cuotas']"));
}
