package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];


        System.out.println("5개의 정수를 입력하세요 : ");

        for(int i = 0; i < number.length; i++) {
             number[i] = scanner.nextInt();
        }

        // 역순 출력
        for (int i = 4; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
