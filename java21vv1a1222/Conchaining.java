class Conchaining
{
  

  public static void main(String arg[])
  {
    chain a=new chain(20,30);
  }
}
class chain
{

  chain()
   {
     System.out.println("0arg constructor");
    }
 chain(int a)
   {
      this();

     System.out.println("1 arg constructor");
	System.out.println(a);
    }
  chain(int a,int b)
   {
		this(10);
     System.out.println("2 arg constructor");
      System.out.println(a+b);
    }
}
