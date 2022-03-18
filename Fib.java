package Distributed_System_Java_Src;

public class Fib extends Thread {
    int x;
    public int answer;
    public Fib(int x)
    {
        this.x = x;
    }
    public void run()
    {
        if (x<2)
            this.answer = 1;
        else
        {
            try{
                Fib f1 = new Fib(x-1);
                Fib f2 = new Fib(x-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                this.answer = f1.answer+f2.answer;
                //System.out.println("The final answer for Fibonacci of x="+x+" is "+this.answer);
            }catch(InterruptedException i){};
        }
    }
    public static void main(String[] args) throws Exception{
        try{
        int x=5 ;
        Fib t = new Fib(x);
        t.start();
        t.join();
        System.out.println("The final answer for Fibonacci of x="+x+" is "+t.answer);
        }catch(Exception ex){
            System.err.println("usage: java Fib NUMBER");
        }
        
    }
    
}
