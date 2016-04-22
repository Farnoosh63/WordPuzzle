import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordPuzzleTest {

//the app gets the userTyped and returns the same, this test check //if the method receive the input
  @Test
public void runWordPuzzle_getInputReturnSame_userTyped() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  ArrayList<Object> userTyped = new ArrayList<Object>();
  //  userTyped.add("test");
  assertEquals(userTyped, testWordPuzzle.runWordPuzzle(userTyped));
  }


}
