import java.util.*;
//import java.util.function.Supplier;
class Bubblesort
{
public static void main(String arg[])
{
  int i,z;
 
  Scanner sc= new Scanner(System.in);
  int a=sc.nextInt();
   int x[]=new int[a];
  for(i=0;i<a;i++)
  {
     
      z=sc.nextInt();
      x[i]=z;
  }
  System.out.println("Array Before Bubble Sort");  
 for( i=0; i < x.length; i++){  
  System.out.print(x[i] + " ");
} 
for( i=0;i<x.length;i++)
{
for(int j=1;j<x.length-i;j++)
{
   if(x[j-1]>x[j])
{
int temp=x[j-1];
x[j-1]=x[j];
x[j]=temp;
}

}

}
System.out.println("");
System.out.println("Array after  Bubble Sort");  
 for( i=0; i < x.length; i++){  
  System.out.print(x[i] + " ");
} 

}
}

