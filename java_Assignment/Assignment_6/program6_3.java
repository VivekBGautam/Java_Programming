// Write A Program which Accept Name from user and print that name

////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckGraterOrNot
//  Description     :   Used to check given number is greater than 100 or not
//  Input           :   Integer
//  Output          :   It will return true if number is greater than 100 
//                      else return false
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   21/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public boolean CheckGraterOrNot(int iNo)
    {
        if(iNo > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

public class program6_3
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");

        iValue = sobj.nextInt();

        Logic lobj = new  Logic();

        bRet = lobj.CheckGraterOrNot(iValue);

        if (bRet == true) 
        {
            System.out.println(iValue+" : is greater than 100");    
        }
        else
        {
            System.out.println(iValue+" : is less than 100");    
        }

        sobj.close();
        lobj=null;

    }
    
}