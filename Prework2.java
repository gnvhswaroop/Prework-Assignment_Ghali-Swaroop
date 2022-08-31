  import java.util.Scanner;
public class Prework2 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int a[]=new int[1000];

int n,t;
n=s.nextInt();
for(int i=0;i<n-1;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t; 
}
}
}
for(int i=0;i<n;i++)
{
if(a[i]-a[i+1]>1)
{
    System.out.println(a[i]-1);
}
}
}
}

