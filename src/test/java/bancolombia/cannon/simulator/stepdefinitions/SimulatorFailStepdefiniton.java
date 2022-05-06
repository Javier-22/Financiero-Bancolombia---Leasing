package bancolombia.cannon.simulator.stepdefinitions;

import bancolombia.cannon.simulator.questions.AgeOfCredit;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SimulatorFailStepdefiniton {
    @Before
    public void sedStage(){
        OnStage.setTheStage(new OnlineCast());}
    @Then("^Verify that age of credit must be show (.*)$")
    public void verifyThatAgeOfCreditMustBeShow(String question)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AgeOfCredit.fails(question)));
    }
}
