package LogicalProblems;

import java.util.Scanner;

public class ReverseNumber {
    void calReverseNumber() {
        int remainder = 0, reverse = 0;
        System.out.println("Enter number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse number is " + reverse);
    }


    public static void main(String[] args) {
      ReverseNumber rn = new ReverseNumber();
      rn.calReverseNumber();
    }
}
