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
    public int Multiplication(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 == 0) && (iNo2 == 0))
        {
            return iNo3;
        }
        else if((iNo2 == 0) && (iNo3 ==  0))
        {
            return iNo1;
        }
        else if((iNo3 == 0) && (iNo1 == 0))
        {
            return iNo2;
        }
        else if(iNo1 == 0)
        {
            return iNo2 * iNo3;
        }
        else if(iNo2 == 0)
        {
            return iNo1 * iNo3;
        }
        else if(iNo3 == 0)
        {
            return iNo2 * iNo1;
        }
        else
        {
            return iNo1 * iNo2 * iNo3;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

public class program6_4 
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        int iRet = 0;  

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the First number :\n");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Second number :\n");
        iValue2 = sobj.nextInt();

        System.out.println("Enter the Third number :\n");
        iValue3 = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.Multiplication(iValue1, iValue2, iValue3);

        System.out.println("Multiplication is : "+iRet);

        sobj.close();
    }
}