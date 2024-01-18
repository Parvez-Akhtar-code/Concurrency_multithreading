package Testing_Codes;

import java.util.concurrent.locks.ReentrantLock;
public class T4_code {
private static ReentrantLock rlock = new ReentrantLock();
private static void accessResource() {
    rlock.lock();
    System.out.println("Locked");
    rlock.unlock();
    System.out.println("unlocked");
}   public static void main(String[] args) {

        Thread t1 =new Thread(() -> accessResource()); t1.start();
        Thread t2 =new Thread(() -> accessResource()); t2.start();
        Thread t3 =new Thread(() -> accessResource()); t3.start();
        Thread t4 =new Thread(() -> accessResource()); t4.start();
    }
}
