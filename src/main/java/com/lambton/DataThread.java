package com.lambton;

public class DataThread extends Thread
{
    private static final String TAG = DataThread.class.getCanonicalName();
    @Override
    public void run()
    {
        super.run();


        for (int i = 1; i <= 10; i++)
            System.out.println(TAG + " : " + i);

        try
        {

        }
    }
}
