class test
{
public  String add(String a,String b)
{
return a+b;
}
public String add(String a,String b, String c)
{
return a+b+c;
}
}
class Moverload
{
public static void main(String[] args)
{
test b=new test();
System.out.println(b.add("hello","world"));
System.out.println(b.add("welcome","to","java"));
}
}
