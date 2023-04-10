import java.util.*;
class MyException extends Exception
{
MyException(String str)
{
super(str);
}
}
class userexcept
{
public static void main(String args[])
{
System.out.println("welcome");
System.out.println("enter amount to withdraw");
Scanner sc=new Scanner(System.in);
try{
double bal=sc.nextInt();
if(bal>25000)
{
MyException m=new MyException("balance is very high");
throw m;
}
System.out.println("balance is withdrawn");
}
catch(MyException m)
{
System.out.println(m);
}
}
}
