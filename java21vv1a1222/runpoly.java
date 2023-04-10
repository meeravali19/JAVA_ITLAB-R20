 class bank
{
float interest()
{
return 0;
}
}
class sbi extends bank
{
float interest()
{
return 8.4f;
}
}
class axis extends bank
{
float interest()
{
return 7.3f;
}
} 
class runpoly
{
public static void main(String args[])
{
bank b1=new sbi();
System.out.println("sbi rate of interest"+b1.interest());
bank b2=new axis();
System.out.println("axis rate of interest"+b2.interest());
}
}
