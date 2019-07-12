import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap so luong sinh vien:");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("So luong sinh vien phai nho hon 30");
            }
        } while (size > 30);
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            do {
                System.out.println("Nhap diem cua sinh vien thu " + (i + 1) + ":");
                array[i] = sc.nextDouble();
                if(array[i]<0||array[i]>10){
                    System.out.println("Diem sinh vien trong khoang 0-10");
                }
            }while (array[i]<0||array[i]>10);
        }
        int count = 0;
        for(int i = 0;i<size;i++){
            if(array[i]>=5){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Khong co sinh vien thi do");
        }
        else {
            System.out.println("So luong sinh vien thi do la "+count);
        }
    }
}
