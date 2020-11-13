import java.util.*;

public class RecursiveExercise{
    public static void main(String[] args){
        System.out.printf("%-15s%-15s\n", "Decimal", "Binary");
        System.out.println("----------------------------");
        test(1);
        test(37);
        test(2020);
    }

    public static void test(int d){
        System.out.printf("%-15s", d);
        printBinary(d);
        System.out.println();
    }

    public static void printBinary(int d){
        if(d < 2){
            System.out.print(d);
        }
        else{
            printBinary(d / 2);
            printBinary(d % 2);
        }
    }
}