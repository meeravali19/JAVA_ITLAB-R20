class mlinherit
{
   public static void main(String args[])
{
student s1=new student("sai",28,"IT","sandeep","mani","gunter","ramesh","rani","vizag");
s1.display();
}
}

class gparent
{
String gfname;
String gmname;
String gcity;

}


class parent extends gparent
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
 student(String sname,int sid,String branch,String fname,String mname,String city,String gfname,String gmname,String gcity)
{
 this.sname=sname;
 this.sid=sid;
 this.branch=branch;
 this.fname=fname;
 this.mname=mname;
 this.city=city;
this.gfname=gfname;
this.gmname=gmname;
this.gcity=gcity;
 
}
 void display()
{
System.out.println("student name "+sname);
System.out.println("student id "+sid);
System.out.println("student branch "+branch);
System.out.println("father name "+fname);
System.out.println("mother name "+mname);
System.out.println("city name "+city);
System.out.println("grand father name "+gfname);
System.out.println("grand mother name"+gmname);
System.out.println("grand parents city"+gcity);

}

}
