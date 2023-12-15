package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 :");
        String food = scanner.nextLine();
        System.out.print("음식의 가격을 입력해주세요 :");
        int price = scanner.nextInt();
        System.out.print("음식의 수량을 입력해주세요 :");
        int Quantity = scanner.nextInt();

        int totalPrice = price * Quantity;

        System.out.println(food + Quantity + "개를 주문하셨스빈다. 총 가격은 " + totalPrice + "원 입니다.");
    }
}
