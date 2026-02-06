// 1. Write a program which accept one number and position from user and
// check whether bit at that position is on or off. If bit is one return TURE
// otherwise return FALSE.

import java.util.*;

class CheckBit
{
    boolean ChkBit(int iNo,int iPos)
    {
        int iResult = 0, iMask = 0x1;
        iMask = (iMask << (iPos-1));

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else 
        {
            return false;
        }

    }
}

class program66_1
{
    public static void main(String A[])
    {
        int iNo = 0, iPos = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        System.out.println("Enter the Position");
        iPos = sobj.nextInt();

        CheckBit cobj = new CheckBit();
        boolean bRet = cobj.ChkBit(iNo,iPos);

        if(bRet == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("bit is OFF");
        }

        sobj.close();
    }
}