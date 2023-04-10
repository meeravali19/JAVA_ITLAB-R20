import java.util.Scanner;
class Execpt
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
int a=sc.nextInt();
System.out.println("enter b");
int b=sc.nextInt();
//int a=10;
//int b=0;
try{
int c=a/b;
System.out.println("c is"+c);
}
catch(Exception e){System.out.println("exception handled");} 
finally {
System.out.println("normal flow");
}
}
}
