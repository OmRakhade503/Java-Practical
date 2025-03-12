public class practical {
    static void performanceString(int size){
        long start = 0;
        long stop = 0;
        String teString = "";

        for(int i =0; i < size; i ++){
            start += System.nanoTime();

            teString = start+"";

            stop += System.nanoTime();
        }
        System.out.println("Average Performanc Time for String is : " + (stop - start)/size);
    }
    static void performanceStringBuffer(int size){
        long start = 0;
        long stop = 0;
        StringBuffer teString = new StringBuffer();

        for(int i =0; i < size; i ++){
            start += System.nanoTime();

            teString.append(start);

            stop += System.nanoTime();
        }
        System.out.println("Average Performanc Time for StringBuffer is : " + (stop - start)/size);
    }

    static void performanceStringBuilder(int size){
        long start = 0;
        long stop = 0;
        StringBuilder teString = new StringBuilder();

        for(int i =0; i < size; i ++){
            start += System.nanoTime();

            teString.append(start);

            stop += System.nanoTime();
        }
        System.out.println("Average Performanc Time for StringBuilder is : " + (stop - start)/size);
    }

    static void AverageTimeForCalculateFactorialUsingForLoop(int size){
        long start = 0;
        long stop = 0;
        int factorial = 1;

        for(int i =0; i < size; i ++){
            start += System.nanoTime();

            for(int j = 1; j <= i; j++){
                factorial *= j;
            }

            stop += System.nanoTime();
        }
        System.out.println("Average Performanc Time for Factorial using For Loop is : " + (stop - start)/size);
    }

    static void AverageTimeForCalculateFactorialUsingRecursion(int size){
        long start = 0;
        long stop = 0;
        int factorial = 1;

        for(int i =0; i < size; i ++){
            start += System.nanoTime();

            factorial = calculateFactorial(i);

            stop += System.nanoTime();
        }
        System.out.println("Average Performanc Time for Factorial using Recursion is : " + (stop - start)/size);
    }

    static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
    public static void main(String[] args){
        performanceString(Integer.parseInt(args[0]));
        performanceStringBuffer(Integer.parseInt(args[0]));
        performanceStringBuilder(Integer.parseInt(args[0]));
        AverageTimeForCalculateFactorialUsingForLoop(Integer.parseInt(args[0]));
        AverageTimeForCalculateFactorialUsingRecursion(Integer.parseInt(args[0]));
    }
}
