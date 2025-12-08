// Accept the Number from user and if Number is less than 10 print "Hello" Otherwise print "Demo"

////////////////////////////////////////////////////////////////////////
//
//  Required package
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Used to Display "Hello" if given number is less than 10 otherwise print "Demo"
//  Input           :   Value As Integer 
//  Output          :   Display Hello or Demo as per condition
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   07/12/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
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
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value");

        iValue  = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.Display(iValue);

        sobj.close();
    }
}