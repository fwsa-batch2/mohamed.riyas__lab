import java.util.concurrent.*;

public class blockingqueue extends Thread{
    static BlockingQueue<String> animals;
    public static void main(String[] args) throws InterruptedException {
        animals =  new LinkedBlockingQueue<>(3);
        animals.put("dog");
        animals.put("snake");
        animals.put("horse");
        System.out.println(animals);
        blockingqueue obj = new blockingqueue();
        obj.start();
        animals.put("lion");
        System.out.println(animals);
        }
    public void run(){
            try {
                Thread.sleep(0);
                animals.remove("dog");
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
    }
}