package bancolombia.cannon.simulator.stepdefinitions;

import bancolombia.cannon.simulator.models.DataModelOne;
import bancolombia.cannon.simulator.questions.CheckDisplay;
import bancolombia.cannon.simulator.tasks.ClickOptions;
import bancolombia.cannon.simulator.tasks.FillForm;
import bancolombia.cannon.simulator.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SimulatorScenarioOneStepDefinition {
    @Before
    public void sedStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^the user opens the bancolombia portal and clicks on the different options to get to the housing credit simulation form$")
    public void theUserOpensTheBancolombiaPortalAndClicksOnTheDifferentOptionsToGetToTheHousingCreditSimulationForm() {
        theActorCalled("user").wasAbleTo(OpenUp.theUrl(),
                ClickOptions.toGetToTheForm());
    }
    @When("^when you have clicked on the option according to the value of the home, fill in the form and choose the option Housing Leasing$")
    public void whenYouHaveClickedOnTheOptionAccordingToTheValueOfTheHomeFillInTheFormAndChooseTheOptionHousingLeasing(List<DataModelOne>dataModelOnes) {
        theActorInTheSpotlight().attemptsTo(FillForm.creditSimulation(dataModelOnes));
    }
    @Then("^Verify that when simulating your credit you get the result of the simulation$")
    public void verifyThatWhenSimulatingYourCreditYouGetTheResultOfTheSimulation() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckDisplay.result()));
    }


}
