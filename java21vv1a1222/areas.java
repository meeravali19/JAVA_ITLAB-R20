 import java.util.Scanner;
 
  abstract class A
{
  abstract double area();
}


class areas
{
public static void main(String args[])
{
rectangle r=new rectangle();
square s=new square();
triangle t= new triangle();

System.out.println("area of square"+s.area());
System.out.println("area of rectangle"+r.area());
System.out.println("area of rectangle"+t.area());
}
}





class square extends A
{
  Scanner n=new Scanner(System.in);
   
    double a =n.nextInt();
  double area(){
   
  double x=a*a;
return x;
  }
}


class rectangle extends A
{
 
  Scanner n2=new Scanner(System.in);
   
     double a =n2.nextInt();
     Scanner n=new Scanner(System.in);
   
      double b =n2.nextInt();
  double area()
  {
double x=a*b;
return x;
  }
}
class triangle extends A
{ 

  Scanner n1=new Scanner(System.in);
   
     double a =n1.nextInt();
     Scanner n=new Scanner(System.in);
   
     double b =n1.nextInt();
  double area(){
double x=(a*b)/2;
return x;
  }
}
