import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.lang.Thread;



public class clock implements Runnable{
    public void run(){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("hh:mm:ss");
                while (true) {
                    try{
                        Thread.sleep(1000);
                        LocalTime CurrentTime = LocalTime.now();
                        System.out.println(d.format(CurrentTime));
                        System.out.flush();
                    }catch(InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
    }
    public static void main(String[] args) {
        clock c = new clock();
        Thread t = new Thread(c);
        t.start();
    }    
}
