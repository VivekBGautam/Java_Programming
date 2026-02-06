// 2. Write a program which accept one number and position from user and off
// that bit. Return modified number.

import java.util.*;

class CheckBit
{
    int ChkBit(int iNo,int iPos)
    {
        int iResult = 0, iMask = 0x1;
        iMask = ~(iMask << (iPos-1));

        iResult = iNo & iMask;

        return iResult;
    }
}

class program66_2
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
        int iRet = cobj.ChkBit(iNo,iPos);

       
        System.out.println("Updated Value is : "+iRet);
       
        sobj.close();
    }
}