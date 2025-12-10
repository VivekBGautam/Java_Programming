// Write A program which Accept the number from user and Perform its Multiplication

////////////////////////////////////////////////////////////////////////
//
//  Required header file
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Multiplication
//  Description     :   Used to Multiplay three number and it will handell all condition if any number is zero
//  Input           :   Integer,Integer,Integer
//  Output          :   It will display weather it is leap year or not
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   21/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public float CalculatePercent(int iTotal, int iObtain)
    {
        float iPercent = 0.0f;

        iPercent = (float)iObtain / (float)iTotal;

        return iPercent;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

public class program6_5
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        float fRet = 0.0f;  

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the total mark :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the obtain mark :");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();

        fRet = lobj.CalculatePercent(iValue1, iValue2);

        System.out.println("Your percengate is : "+fRet);

        sobj.close();
    }
}