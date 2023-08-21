package ATM;

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        int atmno = 123456;
        int atmpin = 1234;
        ATMOperationImpl op = new ATMOperationImpl();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ATM NO :: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter ATM Pin :: ");
        int atmPin = sc.nextInt();

        if((atmNumber==atmno && atmPin == atmpin))
        {
            System.out.println("Validation Done ");
            while (true)
            {
                System.out.print("\n 1. View Balance ");
                System.out.print("\n 2. Withdraw Amount ");
                System.out.print("\n 3. Deposit Amount ");
                System.out.print("\n 4. View Statement");
                System.out.print("\n 5. Exit");

                System.out.print("\n Enter Choice :: ");
                int ch = sc.nextInt();

                switch (ch)
                {
                    case 1:
                        System.out.println("View Balance");
                        op.viewBalance();
                    break;
                    case 2:
                        System.out.print("Enter Amount To Withdraw :: ");
                        double witdrwAmt = sc.nextDouble();
                        op.WithdrawAmount(witdrwAmt);

                        break;
                    case 3:
                        System.out.print("Enter Amount To deposit :: ");
                        double depositAmount = sc.nextDouble();
                        op.depositAmount(depositAmount);
                        break;
                    case 4:
                        op.viewMiniStatement();
                        break;
                    case 5:
                        System.exit(0);
                        System.out.println("Collect Yout ATM");
                        System.out.println("Thank You for Banking With Us");
                        break;
                    default:
                    System.out.println("Invalid Choice Entered");
                    break;

                }
            }
        }
        else
        {
            System.out.println("Incorrect ATM Number Or Pin ");
        }

    }
}
