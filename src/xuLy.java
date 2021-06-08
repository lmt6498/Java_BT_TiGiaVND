import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        final int VND = 23500;

        int USD;
        int quyDoi;

        Scanner nhap = new Scanner(System.in);

        System.out.print("Vui lòng nhập số USD muốn quy đổi: ");
        USD = Integer.parseInt(nhap.nextLine());

        quyDoi = USD * VND;
        System.out.println("Số tiền quy đổi sang VNĐ là:\t" + quyDoi);

    }

}
