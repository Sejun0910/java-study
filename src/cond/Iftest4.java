package cond;

public class Iftest4 {
    public static void main(String[] args) {
        double rating = 6;

        if (rating <= 9) {
            System.out.println("'어바웃타임' 을 추천합니다.");
        }

        if (rating <=8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }

        if (rating <= 7) {
            System.out.println("'마이데몬'을 추천합니다.");
        }
    }
}
