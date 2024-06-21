import java.util.Scanner;

public class String_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String result = convert(s);
        System.out.println("Chuoi sau khi chuyen : "+result);
    }

    public static String convert(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for(char c : s.toCharArray()) {
            if(Character.isSpaceChar(c)) {
                result.append(c);
                capitalizeNext = true;
            }else{
                if(capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                }else{
                    result.append(Character.toLowerCase(c));
                }
            }
        }
    return result.toString();
    }
}
