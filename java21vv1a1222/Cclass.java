class student
{
 int sid;
    String ename ;
    int marks;
  void data(int r,String ename,int marks)
{
  sid=r;
  ename=ename;
  marks=marks;
System.out.println(r +" "+ename +" "+ marks);
}
	
   


}
class Cclass
{ 
public static void main(String arg[])
{
	
student s1=new student();
student s2=new student();
student s3=new student();
         s1.data(22,"vali",70);
	s2.data(52,"sandeep",50);
	s3.data(59,"vedeep",34);
	//s1.display();
	}
}


