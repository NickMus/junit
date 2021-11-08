
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit {

    @Test
    public void arrayTest() {
        int[] provided = Main.arrCheck(new int[] {1,2,3,5,4,7,6,8,9});
        int[] expected = {7,6,8,9};
        Assertions.assertArrayEquals(expected,provided);
    }

    @Test
    public void arrayTest2() {
        int[] provided = Main.arrCheck(new int[] {2,4,5,6,2,4,7,4,5});
        int[] expected = {5};
        Assertions.assertArrayEquals(expected,provided);
    }

    @Test
    public void arrayTest3() {
        try {
            int[] provided = Main.arrCheck(new int[] {1,2,3,5,7,6,8,9});
        } catch (RuntimeException e) {
            e.printStackTrace();
            Assertions.assertTrue(true);
        }
    }

    @Test
    public void arrayTest4() {
        int[] provided = Main.arrCheck(new int[] {1,2,3,5,4,4,7,6,4,8,9});
        int[] expected = {8,9};
        Assertions.assertArrayEquals(expected,provided);
    }

    @Test
    public void arrayTest5() {
        boolean provided = Main.arrayCheck2(new int[] {1,2,3,5,4,4,7,6,4,8,9});
        boolean expected = true;
        Assertions.assertTrue(provided);
    }


    @Test
    public void arrayTest6() {
        boolean provided = Main.arrayCheck2(new int[] {2,3,5,7,6,8,9});
        boolean expected = false;
        Assertions.assertFalse(provided);
    }


    @Test
    public void arrayTest7() {
        boolean provided = Main.arrayCheck2(new int[] {2,3,5,7,6,8,9,1});
        boolean expected = true;
        Assertions.assertTrue(provided);
    }


    @Test
    public void arrayTest8() {
        boolean provided = Main.arrayCheck2(new int[] {4,7,6,1,8,9});
        boolean expected = true;
        Assertions.assertTrue(provided);
    }
}
