import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

//test that our page is running
  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Word Puzzle Game");
  }

//test that our input is all constants and return same word
  @Test
  public void isAllConstants() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("tst");
    submit(".btn");
    assertThat(pageSource().contains("tst"));
  }

//test our input is all vowel and return all hyphened
  @Test
  public void isAllVowels() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("aio");
    submit(".btn");
    assertThat(pageSource().contains("---"));
  }

/*test our input is cointain vowel and constants and return constants with replacing the vowel with hyphen*/
  @Test
  public void isVowelAndConstants() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("mommy");
    submit(".btn");
    assertThat(pageSource().contains("m-mmy"));
  }
}
