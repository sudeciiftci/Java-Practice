class PrinterTask implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<6; i++){
            System.out.println(Thread.currentThread().getName() + " Running task " + i);
        }
    }
}

public class ThreatExercise {
    public static void main(String[] args) {
        PrinterTask printerTask1 = new PrinterTask();
        Thread thread1 = new Thread(printerTask1);
        thread1.setName("Worker-1");
        thread1.start();

        PrinterTask printerTask2 = new PrinterTask();
        Thread thread2 = new Thread(printerTask2);
        thread2.setName("Worker-2");
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
