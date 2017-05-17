package calculator;

import java.util.List;

public class pM 
{
    //--------------------------------------------------------------------------
    public static void pause(int in)
    {
        try
        {Thread.sleep(in);}
        catch(Exception e)
        {System.out.println("Exception caught");}
    }
    //--------------------------------------------------------------------------
    public static void print(Object in)
    {System.out.print(in);}
    public static void puts(Object in)
    {System.out.println(in);}
    //--------------------------------------------------------------------------
    public static void printArray(Object[] in)
    {
        for (Object hold : in)
            print(hold+" ");
    }
    public static void printArray(int[] in)
    {
        for (int hold : in)
            print(hold+" ");
    }
    //--------------------------------------------------------------------------
    public static void printArray(Object[][] in)
    {
        for (Object[] hold : in)
        {
            printArray(hold);
            puts("");
        }
    }
    public static void printArray(int[][] in)
    {
        for (int[] hold : in)
        {
            printArray(hold);
            puts("");
        }
    }
    //--------------------------------------------------------------------------
    public static void printList(List in)
    {
        for (Object hold : in)
            print(hold+" ");
    }
    //--------------------------------------------------------------------------
    public static void sPrint(String in)
    {
        for (int i = 0; i<in.length(); i++)
        {
            print(in.charAt(i));
            pause(400);
        }
    }
    public static void sPrint(String in, int inn)
    {
        if (inn<275)
            inn = 275;
        for (int i = 0; i<in.length(); i++)
        {
            print(in.charAt(i));
            pause(inn);
        }
    }
    //--------------------------------------------------------------------------
    
}