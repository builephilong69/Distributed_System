package Distributed_System_Java_Src;

class TestThread extends Thread{
    public void run(){
        long time = System.currentTimeMillis();
        System.out.println("New test thread here "+time);
    }
}

public class NewThread extends Thread {
    int n; 
    public NewThread(int number)
    {
        this.n = number;
    }
    public void run()
    {
        long time = System.currentTimeMillis();
        System.out.println("Thread "+ this.n+" is excuting! at "+ time);
        for(int i = 0 ; i<10;i++)
        {
            System.out.println("Thread "+this.n+": "+i);
        }
    }
    /*public static void main(String[] args)
    {
        Thread t1 = new NewThread(1);
        t1.start();
        Thread t2 = new NewThread(2);
        t2.start();
        Thread st = new TestThread();
        st.start();

    }
    */
    
}
