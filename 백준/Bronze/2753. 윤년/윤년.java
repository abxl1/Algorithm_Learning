import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // 윤년 구하기 - 4의 배수임, 100의 배수가 아님, 400의 배수임
        if (year < 1 || year > 4000) {
            System.out.println("입력값의 범위가 아닙니다.");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}