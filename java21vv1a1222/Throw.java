import java.util.*;
class Throw{
public static void main(String[] args)
{
try
{
System.out.println("welcome");
throw new NullPointerException("expection data"); 
}
catch(NullPointerException ne)
{
System.out.println(ne);
}
}

}
