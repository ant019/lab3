import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void reverseInPlace1(){
    int[] testArray = {1, 2, 3};
    int[] expected = {3, 2, 1};
    ArrayExamples.reverseInPlace(testArray);
    assertArrayEquals(expected, testArray);
  }
  
  @Test
  public void reversed1(){
    int[] testArray = {1, 2, 3};
    int[] expected = {3, 2, 1};
    assertArrayEquals(expected, ArrayExamples.reversed(testArray));
  }

  @Test
  public void averageWithoutLowest(){
    double[] testArray = {8, 5, 7, 2, 2};
    double expected = 22.0/4.0;
    assertEquals(expected,ArrayExamples.averageWithoutLowest(testArray), 0.1);
  }
}
