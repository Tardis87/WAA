package tests;

import base.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PokemonTest extends TestBase {


    @Before
    public void openPage() {

        driver.get(BASE_URL + "/vybersi.php");
    }

    @Test
    public void itShouldSelectPokemons() {
        String[] selectedPokemons = {"Pikachu", "Bulbasaur", "Charmander", "Diglett", "Geodude"};

        //najdem element select

        for (String pokemon : selectedPokemons) {
            //vyberiem pokemona
            selectPokemon(pokemon);
            //overim hlasku
           getActualMessage();
            //String expectedMessage = "I choose you " + pokemon + " !";
            Assert.assertEquals(GetExpectedMessage(pokemon),getActualMessage());
        }
    }

    private void selectPokemon(String pokemonToSelect){
        WebElement pokemonSelect = driver.findElement(By.cssSelector("select"));
        new Select(pokemonSelect).selectByVisibleText(pokemonToSelect);

    }

    private String getActualMessage(){
      return driver.findElement(By.cssSelector("div.pokemon h3")).getText();
    }

    private String GetExpectedMessage(String pokememonSelect){
        return String.format("I choose you %s !", pokememonSelect);
    }
}
