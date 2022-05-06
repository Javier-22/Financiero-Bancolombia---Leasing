package bancolombia.cannon.simulator.tasks;

import bancolombia.cannon.simulator.models.DataModelOne;
import bancolombia.cannon.simulator.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static bancolombia.cannon.simulator.userinterfaces.FillFormPage.*;

public class FillForm  implements Task {
    private List<DataModelOne> fillform;
    public FillForm (List<DataModelOne> fillform){this.fillform=fillform;}

    @Override
    public <T extends Actor> void performAs(T actor) {
Wait.Time(8000);
        actor.attemptsTo(
                Enter.theValue(fillform.get(0).getStrCommercialvalue()).into(INPUT_HOUSING),
                Click.on(INPUT_PERCENTAGE),
                Click.on(SELECT_PERCENTAGE.of(fillform.get(0).getStrPercentege())),
                Enter.theValue(fillform.get(0).getStrYears()).into(INPUT_YEARS),
                Click.on(INPUT_DATE));
        while (!FORM_YEAR.of(fillform.get(0).getStrYear_Calendar()).resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(BACK_BUTTON));
        }
        actor.attemptsTo(
                Click.on(FORM_YEAR.of(fillform.get(0).getStrYear_Calendar())),
                Click.on(FORM_YEAR.of(fillform.get(0).getStrMount_Calendar())),
                Click.on(FORM_YEAR.of(fillform.get(0).getStrDay_Calendar())));
    }
    public static FillForm fill(List<DataModelOne> fillform){return  Tasks.instrumented(FillForm.class, fillform);}
}
