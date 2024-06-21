import java.util.Scanner;

public class String_Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string 1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter a string 2 : ");
        String s2 = sc.nextLine();

        while (s1.contains(s2)) {
            int index = s1.indexOf(s2);
            s1 = s1.substring(0, index) + s1.substring(index +s2.length());
        }

        System.out.println("Chuoi s1 sau khi loai bo s2 : ");
        System.out.println(s1);
    }
}
