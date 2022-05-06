package bancolombia.cannon.simulator.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ExpectedResult extends PageObject {
    private static String asd= "//div[@class='swiper-wrapper ng-tns-c4-8']//div[@class='swiper-slide info-result ng-tns-c4-8 ng-trigger ng-trigger-fadeIn ng-star-inserted swiper-slide-next']";
    public static final Target INPUT_F1=Target.the("Row fixed fee in pesos").locatedBy(asd + "//h6[@class='title-card']");
    public static final Target INPUT_F2=Target.the("Monthly fees").locatedBy(asd + "//small[@class='name-card ng-tns-c4-8 ng-star-inserted']");
    public static final Target INPUT_F3=Target.the("Value monthly installments").locatedBy(asd + "//h4[@class='numero-cuotas']");
    public static final Target INPUT_F4=Target.the("Purchase option percentage").locatedBy(asd + "//small[@class='coutas-info-card ng-tns-c4-8 ng-star-inserted']");
    public static final Target INPUT_F5=Target.the("rate and fees included").locatedBy(asd + "//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c4-8']");
    public static final Target INPUT_F6=Target.the("effective annual rate").locatedBy(asd + "//div[@class='mat-expansion-panel-body']//div[1]");
    public static final Target INPUT_F7=Target.the("month due rate").locatedBy(asd + "//div[@class='mat-expansion-panel-body']//div[2]");
    public static final Target INPUT_F8=Target.the("life insurance").locatedBy(asd + "//div[@class='mat-expansion-panel-body']//div[3]");
    public static final Target INPUT_F9=Target.the("fire and earthquake insurance").locatedBy(asd + "//div[@class='mat-expansion-panel-body']//div[4]");
    public static final Target INPUT_F10=Target.the("error message exceeds the minimum and maximum").locatedBy("//mat-error[@id= contains(text(),error-meses)]");

}