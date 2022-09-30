//This program is done by Ronak Bhalgami(21CE009)
import java.util.*;

import javax.lang.model.util.ElementScanner14;
class ThreadSample implements Runnable{
    int random[]=new int[15];
    ThreadSample(int a[])
    {
        random=a;
    }
    void display()
    {
        if(Thread.currentThread().getName().equals("Thread-0"))
        {
            for(int i=0;i<random.length;i++)
            {
                if(random[i]%2==0)
                {
                    System.out.println("Even Number : "+random[i]+" Identify by "+Thread.currentThread().getName());
                }
            }
        }
        else{
            for(int i=0;i<random.length;i++)
            {
                if(random[i]%2!=0)
                {
                    System.out.println("Odd Number : "+random[i]+" Identify by "+Thread.currentThread().getName());
                }
            }
        }
    }
    public void run()
    {
        display();
    }
}
public class PR2
{
    public static void main(String[] args) {
        Random r=new Random();
        int random[]=new int[15];
        for(int i=0;i<random.length;i++)
        {
            random[i]=r.nextInt(100);
        }
        ThreadSample s1=new ThreadSample(random);
        Thread t1=new Thread(s1);
        t1.start();
        Thread t2=new Thread(s1);
        t2.start();
    }
}