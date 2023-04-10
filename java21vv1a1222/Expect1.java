class Expect1
{
public static void main(String args[])
{
int marks[]={10,20,30,40};
System.out.println("hello");
//int m1=marks[4];

try{
int m1=marks[4];
System.out.println("marks are"+m1);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("size of array greater than 3");
}
}
}
