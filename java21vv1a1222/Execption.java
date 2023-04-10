import java.io.*;
class Execption
{
public static void main(String args[])
{
test t=new test();
t.m1();
System.out.println("normal flow of code");
}
}

class test
{
void m1()throws IOExecption
{
throw new IOExecption("expection occured");
}
}
