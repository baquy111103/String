public class String_Bai1 {
    // Hàm kiểm tra số thuận nghịch
    public static boolean isThuanNghich(int number) {
        String str = Integer.toString(number);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Hàm liệt kê các số thuận nghịch có 6 chữ số
    public static void lietKeThuanNghich6ChuSo() {
        System.out.println("Các số thuận nghịch có 6 chữ số là:");
        for (int i = 100000; i <= 999999; i++) {
            if (isThuanNghich(i)) {
                System.out.println(i);
            }
        }
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        lietKeThuanNghich6ChuSo();
    }
}
