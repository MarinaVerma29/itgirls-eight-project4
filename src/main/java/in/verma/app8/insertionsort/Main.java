package in.verma.app8.insertionsort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] animals = {"cat", "orange", "elephant", "bird"};

        insertionSortByVowels(animals);
        System.out.println(Arrays.toString(animals));
    }

    public static void insertionSortByVowels(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String currentWord = arr[i];
            int j = i - 1;

            int currentVowelCount = countVowels(currentWord);

            while (j >= 0 && countVowels(arr[j]) > currentVowelCount) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = currentWord;
        }
    }

    public static int countVowels(String word) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

}
