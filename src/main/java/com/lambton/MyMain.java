package com.lambton;

public class MyMain
{
    public static void main(String[] args) {

        DataThread t1 = new DataThread();
        //DataThread t2 = new DataThread();
        DataThreadRunnable t2 = DataThreadRunnable;



        try
        {
            t1.start();
            t1.join();
            //t2.start();
            Thread thread = new Thread(t2);
            thread.start();
            thread.join();
            
        }
        catch (InterruptedException e)
        {
            //System.out.println("**** END ****");
            e.printStackTrace();
        }


    }
}
