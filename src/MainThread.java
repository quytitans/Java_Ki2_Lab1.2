import caculation.HelperClass;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1st side length: ");
        double a = scan.nextDouble();
        System.out.println("Please enter 2nd side length: ");
        double b = scan.nextDouble();
        System.out.println("Please enter 3rd side length: ");
        double c = scan.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
            System.exit(0);
        } else {
            if (a + b < c || a + c <= b || b + c <= a) {
                System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)");
                System.exit(0);
            }else {
                HelperClass cacu001 = new HelperClass();
                double nuaChuVi = cacu001.tinhNuaChuVi(a,b,c);
                System.out.printf("Nua chu vi tam giac da nhap vao la : %f",nuaChuVi);
            }
        }
    }
}
