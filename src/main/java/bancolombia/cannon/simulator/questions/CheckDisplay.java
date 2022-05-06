package bancolombia.cannon.simulator.questions;
import static bancolombia.cannon.simulator.userinterfaces.ExpectedResult.*;
import static bancolombia.cannon.simulator.userinterfaces.FillFormPage.*;
import bancolombia.cannon.simulator.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;


public class CheckDisplay  implements Question {
    public  static CheckDisplay result (){
        return  new CheckDisplay();
    }

    @Override
    public Object answeredBy(Actor actor) {
        Wait.Time(10000);
        actor.attemptsTo(
                Click.on(BUTTON_SIMULATE),
                Click.on(BUTTON_HOUSING),
                Click.on(DEPLOY_BUTTON)
        );
        Wait.Time(5000);
        System.out.println(
                    INPUT_F1.resolveFor(actor).getText()+"\n"+
                    INPUT_F2.resolveFor(actor).getText()+"\n"+
                    INPUT_F3.resolveFor(actor).getText()+"\n"+
                    INPUT_F4.resolveFor(actor).getText()+"\n"+
                    INPUT_F5.resolveFor(actor).getText()+"\n"+
                    INPUT_F6.resolveFor(actor).getText()+"\n"+
                    INPUT_F7.resolveFor(actor).getText()+"\n"+
                    INPUT_F8.resolveFor(actor).getText()+"\n"+
                    INPUT_F9.resolveFor(actor).getText()
        );
return true;
    }
}
