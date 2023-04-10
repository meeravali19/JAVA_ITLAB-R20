class Sinherit
{
   public static void main(String args[])
{
student s1=new student("gopi",22,"IT","eswar","devi","markapur");
s1.display();
}
}

class parent 
{
String fname;
String mname;
String city;
}


class student extends parent
{
String sname;
int sid;
String branch;
 student(String sname,int sid,String branch,String fname,String mname,String city)
{
   this.sname=sname;
 this.sid=sid;
 this.branch=branch;
 this.fname=fname;
 this.mname=mname;
 this.city=city;
}
 void display()
{
System.out.println("student name "+sname);
System.out.println("student id "+sid);
System.out.println("student branch "+branch);
System.out.println("father name "+fname);
System.out.println("mothe name "+mname);
System.out.println("city name "+city);
}

}
