import java.io.*;
import java.util.*;
class alphabet
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        char a[]={'a','e','i','o','u'};
        int b=0;
        for(int i=0;i<a.length;i++)
        {
            if(ch[0]==a[i])
            {
                System.out.println("vowels");
                b=1;
            }
        }
            if(b==0)
            {
              System.out.println("consonants");   
            }
    }
}
