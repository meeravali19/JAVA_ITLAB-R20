class mythread extends Thread 
{
    public void run()
    {
        System.out.println("n1");
        try{
            Thread.sleep(0);
            //System.out.println("thread is working");
        }
        catch(InterruptedException e){}
        System.out.println("n2");
    }
}
class Alive
{
    public static  void main(String[] args)
    {
        mythread m1=new mythread();
        Thread t1=new Thread(m1);
        t1.start();
        
        System.out.println(t1.isAlive());
        mythread m2=new mythread();
        
     
        System.out.println(.isAlive());
    } 
}