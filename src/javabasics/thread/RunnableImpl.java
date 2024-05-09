package javabasics.thread;

public class RunnableImpl implements Runnable {

    int val;
    public RunnableImpl(int num){
        this.val=num;
    }

    @Override
    public void run() {

       for(int i=0;i<4;i++){
           System.out.println("Hello this printing the the thread values of thread"+val+" "+i);
           try {
               Thread.sleep(1000);

           }catch (Exception e){
               e.printStackTrace();
           }
       }
    }
}

