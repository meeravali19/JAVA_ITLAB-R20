interface student
{
  int sub1,sub2,sub3;
 void m1();
 //void m2();

}
class Interface implements student
{
int sub1=90;
int sub2=50;
 public void m1()
{
System.out.println(sub1+sub2);
}

