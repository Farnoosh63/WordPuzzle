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

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Word Puzzle Game");
  }

  @Test
  public void isAllConstants() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("tst");
    submit(".btn");
    assertThat(pageSource().contains("tst"));
  }

  @Test
  public void isAllVowels() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("aio");
    submit(".btn");
    assertThat(pageSource().contains("---"));
  }

  @Test
  public void isVowelAndConstants() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("mommy");
    submit(".btn");
    assertThat(pageSource().contains("m-mmy"));
  }


  @Test
  public void isVowelAndConstantsCaseSensitivity() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("MommyJoon");
    submit(".btn");
    assertThat(pageSource().contains("M-mmyJ--n"));
  }


  @Test
  public void rootTestForResultPage() {
    goTo("http://localhost:4567/results?userInput=");
    assertThat(pageSource()).contains("Word Puzzle");
  }


  @Test
  public void isresultWorkWithUserinput() {
    goTo("http://localhost:4567/results?userInput=hello+world");
    assertThat(pageSource().contains("h-ll- w-rld"));
  }
}
