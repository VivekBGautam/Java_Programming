// Accept number form user and Check Number is even or odd

////////////////////////////////////////////////////////////////////////
//
//  Required header file
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindMax
//  Description     :   Used to find maximum number
//  Input           :   Integer,Integer,Integer
//  Output          :   Maximum Value out of three number
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   20/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public int FindMax(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 >=  iNo2) && (iNo1 >= iNo3))
        {
            return iNo1;
        }
        else if((iNo2 >= iNo1) && (iNo2 >= iNo3))
        {
            return iNo2;
        }
        else
        {
            return iNo3;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program5_5
{
    public static void main()
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the second Number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter the third Number : ");
        iValue3 = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.FindMax(iValue1, iValue2, iValue3);

        if(iRet == iValue1)
        {
            System.out.println(iValue1+" : is Greater Number ");
        }
        else if(iRet == iValue2)
        {
            System.out.println(iValue1+" : is Greater Number ");
        }
        else 
        {
            System.out.println(iValue3+" : is a greater Number ");
        }

        sobj.close();
    }
}