// write a program which accept the number from user and Dispaly diffrence between factor and non factor

////////////////////////////////////////////////////////////////////////
//
//  Required header file / Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   DiffBetwFactorAndNonFactor
//  Description     :   Used to Display Differece Between Factor And Non Factor
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   19/10/2025
//
////////////////////////////////////////////////////////////////////////
class Logic
{
    public int DiffBetwFactorAndNonFactor(int iNo)
    {
        int iCnt = 0;
        int iSumFact = 0, iSumNonFact = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <=(iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSumFact = iSumFact + iCnt;
            }
            else
            {
                iSumNonFact = iSumNonFact + iCnt;
            }
        }
        return (iSumFact - iSumNonFact);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program4_5
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number :");

        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.DiffBetwFactorAndNonFactor(iValue);

        System.out.println("Diffrence between All Factor and  Non factors : "+iRet);

        sobj.close();
    }
}