package LogicalProblems;

import java.util.Scanner;

public class PerfectNumber {
    void calPerfectNumber()
    {
        int sum=0;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)
            {
                sum=sum+i;
            }
        }
        if(number==sum)
            System.out.println(number+" is perfect number");
        else
            System.out.println(number+" is not perfect number");

    }

    public static void main(String[] args) {
        PerfectNumber pn = new PerfectNumber();
        pn.calPerfectNumber();
    }
}
