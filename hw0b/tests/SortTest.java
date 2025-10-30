
public class SortTest {
    public static void testSort (){
        String[] input = {"I", "have", "an", "egg"};
        String[] output = {"an", "egg", "have", "I"};

        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(input, output);
    }

    public static void testFindSmallest (){
        String[] input = {"I", "have", "an", "egg"};
        int output = 2;

        int answer = Sort.findSmallest(input, 0);

        org.junit.Assert.assertEquals(output, answer);
    }

    public static void testSwap (){
        String[] input = {"I", "have", "an", "egg"};
        String[] output = {"an", "have", "I", "egg"};

        int a = 0;
        int b = 2;

        Sort.swap(input, a, b);

        org.junit.Assert.assertArrayEquals(output, input);
    }

    public static void main (String[] args){
        testFindSmallest();
    }
}
