// 1.Write a program which checks whether 15th bit is On or OFF.

import java.util.*;

class CheckBit
{
    void ChkBit(int iNo,int iPos)
    {
        int iResult = 0, iMask = 0x1;
        iMask = iMask << (iPos-1);

            iResult = iNo & iMask;

            if(iResult == iMask)
            {
                System.out.println(iPos +"th bit is ON");
            }
            else
            {
                System.out.println(iPos +"th bit is OFF");
            }
    }
}

class program64_1
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
        cobj.ChkBit(iNo,iPos);

        sobj.close();
    }
}