public class runnableInterfaceThroughLamdaExpression {
    public static void main(String[] args) {
        Runnable r1 = ()->{
            System.out.println("you are inside the lamda class 1");
        };
        Runnable r2 = ()->{
            System.out.println("you are inside the runnable class 2");
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.run();
        t2.run();
    }
    
}
