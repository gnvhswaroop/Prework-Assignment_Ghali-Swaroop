import java.util.Scanner;
class Prework3
{
public static void main(String arg[])
{
Scanner s= new Scanner(System.in);
int n;
n=s.nextInt();
for(int i=n;i>=1;i--)
{
for(int j=n;j>=1;j--)
{
for(int k=1;k<=i;k++)
{
System.out.print(j);
}
}
System.out.println();
}
}
}