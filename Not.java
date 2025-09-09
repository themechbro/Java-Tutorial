// class MyThread extends Thread{
//     public void run() {
//         System.out.println("Hello from thread:- "+ Thread.currentThread().getName()) ;
//     }
// }

// public class Not {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.run();
//     }
// }

public class Not {
    
    public static int addItems(int n) {
        return n+n;
    }

    public static void main(String[] args) {
        addItems(10);
    }
}