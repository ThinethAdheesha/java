public class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thineth");
            try {
                Thread.sleep(1000); // Sleep inside the loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ADHEESHA");
            try {
                Thread.sleep(1000); // Sleep inside the loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        A oob1 = new A();
        Thread thread1 = new Thread(oob1);

        B oob2 = new B();
        Thread thread2 = new Thread(oob2);

        thread1.start(); // Start first thread
        thread2.start(); // Start second thread
    }
}
