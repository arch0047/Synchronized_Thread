package HomePackage;

public class Main
{
    public static void  main(String[] args) throws Exception
    {

        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run()
            {
                for(int i=1; i<=100; i++)
                {
                    c.setCount();
                }

            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run()
            {
                for(int i=1; i<=100; i++)
                {
                    c.setCount();
                }

            }
        });

        t1.start();
        t2.start();
        
        try {
          // t1.join();
            t2.join();
        } catch (InterruptedException e){

            e.printStackTrace();
        }
        System.out.println("Counter FINAL Value : "+ c.getCount());
    }
}
















//https://www.youtube.com/watch?v=8bSlaGsG4dk