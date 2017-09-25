package week2.Lesson1.WarAndPeace;

/**
 * Created by vidok on 25.09.17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("countOf(страдание) = " + Consumer.counter);
    }
}
