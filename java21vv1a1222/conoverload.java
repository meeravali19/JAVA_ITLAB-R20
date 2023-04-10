class Conoverload
{
 
 Conoverload()
 {
 	System.out.println("defalut constructor");
  }
 Conoverload(int a,int b)
 {
	System.out.println("sum is "+(a+b));

    
  }
Conoverload(String a,String b)
{
	System.out.println("combining strings is "+(a+b));
}

public static void main(String arg[])
{
Conoverload a=new Conoverload();
Conoverload b=new Conoverload(10,20);
Conoverload e=new Conoverload(30,50);
Conoverload c=new Conoverload("hello","world");
Conoverload d=new Conoverload("welcome to","java");

}

}
