import java.util.Arrays;
import java.util.Scanner;

public class String_Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao Full Name : ");
        String s = sc.nextLine();

        String[] parts = s.split(" ");
        String[] reorderParts = new String[parts.length];
        reorderParts[0] = parts[parts.length-1];
        reorderParts[1] = parts[0];
        if(parts.length > 2) {
            reorderParts[2] = String.join(" ", Arrays.copyOfRange(parts,1,parts.length-1));

        }
        String rearangedFullName = String.join(" ", reorderParts);

        System.out.println("Xau ho ten khi da chuyen doi : "+rearangedFullName);
    }
}
