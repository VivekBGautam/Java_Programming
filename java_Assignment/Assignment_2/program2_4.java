// Accept two Number from user and Display first number in Second number of time
import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Logic
//  Function Name   :   Display
//  Description     :   Used to Display same number in second number of time
//  Input           :   Integer , Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   07/12/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iNo1, int iNo2)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo2; iCnt++)
        {
            System.out.print(iNo1+"\t");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program2_2
{
    public static void  main(String A[])
    {
        int iValue1 = 0,iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value");

        iValue1  = sobj.nextInt();

        System.out.println("Enter how many time you want to display value");

        iValue2  = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.Display(iValue1, iValue2);

        sobj.close();
    }
}