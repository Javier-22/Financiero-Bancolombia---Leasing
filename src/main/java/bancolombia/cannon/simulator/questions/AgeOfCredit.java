package bancolombia.cannon.simulator.questions;

import bancolombia.cannon.simulator.userinterfaces.ExpectedResult;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AgeOfCredit implements Question {
    private String question;

    public AgeOfCredit(String question) {
        this.question = question;
    }

    public static AgeOfCredit fails(String question){
        return new AgeOfCredit(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean res;
        actor.attemptsTo(
                WaitUntil.the(ExpectedResult.INPUT_F10,isVisible()).forNoMoreThan(10).seconds()

        );
        String a =(ExpectedResult.INPUT_F10.resolveFor(actor).getText());
        if (a.contains(question)) {
            res = true;
        }else{
       res = false;
        }
        return res;
    }
}
