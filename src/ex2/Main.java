package ex2;

public class Main {

    public static void main(String args[]) {

        int[] run = new BubbleSort().run(new int[]{64, 34, 25, 12, 22, 11, 90});

        for(int i = 0; i< run.length; i++) {
            System.out.println(run[i]);
        }
    }
}
