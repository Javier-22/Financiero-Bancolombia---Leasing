package bancolombia.cannon.simulator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static bancolombia.cannon.simulator.userinterfaces.OptionsPage.*;

public class ClickOptions implements Task {
    public static ClickOptions toGetToTheForm(){ return Tasks.instrumented(ClickOptions.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTIONPRODUCTANDSERVICES),
                Click.on(LEASING),
                Click.on(OPTION_LH),
                Click.on(OPTION_SIMULATES),
                Click.on(OPTIONHOMEVALUE)
        );
    }
}
