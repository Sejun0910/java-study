package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1 을 입력하세요 :");
            int number = scanner.nextInt();

            if (number == -1) {
//                System.out.println("입력한 숫자들의 합계 : " + sum);
//                System.out.println("입력한 숫자들의 평균 : " + (sum/count));
                break;
            }


            sum += number;
            count++;



        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫잗들의 평균 : " + average);

    }
}
