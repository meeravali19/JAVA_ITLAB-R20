class goodmorning extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            try{
                Thread.sleep(2500);

            }
            catch(Exception e){}
            System.out.println("good morning");
        }
    }
}
class hello extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            try{
                Thread.sleep(2000);
            }catch(Exception e){
            }
            System.out.println("HEllo");
            
        }
    }
} 
class welcome extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){}
            System.out.println("welcome");
        }
    }
}
class Threads1
{
    public static void main(String[] args){
    goodmorning gm=new goodmorning();
    Thread t1=new  Thread(gm);
    hello h1=new hello();
    Thread t2=new Thread(h1);
    welcome wc= new welcome();
    Thread t3= new Thread(wc);
   t1.start();
   t2.start();
   t3.start();
    
    }
}