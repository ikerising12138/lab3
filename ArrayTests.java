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
  public void testReverseInPlace2(){
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertEquals(input1[0], 3);
    assertEquals(input1[1], 2);
    assertEquals(input1[2], 1);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse2(){
    int[] input1 = {1,2,3};
    int[]output = ArrayExamples.reversed(input1);
    assertEquals(output[0], 3);
    assertEquals(output[1], 2);
    assertEquals(output[2], 1);
  }

  @Test
  public void testLow(){
    double[] input1 = {};
    double a = ArrayExamples.averageWithoutLowest(input1);
   
   
   
    assertEquals(a, 0,0.1);
    double[] input2 = {1,1,1,2,2,3,3};
    double b = ArrayExamples.averageWithoutLowest(input2);
    assertEquals(b,2,0.1);

  }


}
