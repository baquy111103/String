import java.util.Arrays;
import java.util.Scanner;

public class String_Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string(0 qua 20  tu ) :");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        Arrays.sort(words);
        System.out.println("Cac tu trong cau theo thu tu Alphabet : ");
        for(String word : words){
            System.out.print(word);
        }
    }
}
