import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int[length];

        for (int index = 1; index <= length; index++) {
            array[index - 1] = index;
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        int newIndex = 0;
        int[] resultArray = new int[length];
        for (int index = 0; index < length; index++) {
            if (array[index] % 3 == 0) {
                resultArray[newIndex++] = array[index];
            }
        }
        resultArray = Arrays.copyOf(resultArray, newIndex);

        System.out.println("Числа, кратные 3: " + Arrays.toString(resultArray));
    }
}