package net.serenity.bdd.samples.etsy;




import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="C:\\PPES\\serenity-cucumber\\Feature\\example.feature",glue={"examplecucumber"})


public class Serenity {

}
