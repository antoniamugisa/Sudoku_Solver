import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double firstNum, secondNum, answer;

        System.out.println("Enter first number");
        firstNum = in.nextDouble();

        System.out.println("Enter second number");
        secondNum = in.nextDouble();

        answer = firstNum + secondNum;

        System.out.println(answer);

    }
}
