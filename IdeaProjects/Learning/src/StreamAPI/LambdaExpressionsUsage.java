package StreamAPI;

public class LambdaExpressionsUsage { //It is used to reduce the loc(line of code) as shown below.
    public static void main(String[] args) {
//        Runnable ok = (() -> {System.out.println("OK");});
//        Thread thread = new Thread(ok);
        //              ||
        //              || Reduced Code
        //              \/
        Thread thread = new Thread(()-> System.out.println("OK"));
        thread.run();
//        Threads threads = new Threads();
//        threads.run();
    }
}

class Threads implements Runnable{

    @Override
    public void run() {
        System.out.println("RUN");
    }
}
