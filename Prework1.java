	import java.util.Scanner;
class Prework1
{
    public static void main(String arg[])
    {
Scanner s= new Scanner(System.in);
String s1;
s1=s.nextLine();
System.out.print(s1.charAt(0));
for (int i=1;i<s1.length();i++)
{
if(s1.charAt(i)==' ')
{
System.out.print(s1.charAt(i+1));
}
}
}
}
