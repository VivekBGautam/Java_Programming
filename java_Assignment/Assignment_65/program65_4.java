// 4. Write a program which accept one number from user and toggle 7th and
// 10th bit of that number. Return modified number.
// Page

import java.util.*;

class CheckBit
{
    int ChkBit(int iNo,int iPos1,int iPos2)
    {
        int iResult = 0, iMask = 0x1;
        iMask = ~((iMask << (iPos1-1)) | (iMask << (iPos2-1)));

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class program65_2
{
    public static void main(String A[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        CheckBit cobj = new CheckBit();
        int iRet = cobj.ChkBit(iNo,7,10);

        System.out.println("Updated number is : "+iRet);

        sobj.close();
    }
}