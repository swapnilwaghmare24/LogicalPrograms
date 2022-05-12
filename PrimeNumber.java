package LogicalProblems;

import java.util.Scanner;

public class PrimeNumber {
    void calPrimeNumber()
    {
    boolean check=false;
    int sum=0;
        System.out.println("Enter number ");
    Scanner sc = new Scanner(System.in);
    int number=sc.nextInt();
        for(int i=2;i<=number/2;i++)
    {
        if(number==0 || number==1)
            System.out.println(number+" is prime");
        else if(number%i==0)
        {
            check=true;
            break;
        }

    }
        if(check==true)
            System.out.println(number+" is not prime");
        else
                System.out.println(number+" is prime");
}

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        pn.calPrimeNumber();

    }
}
