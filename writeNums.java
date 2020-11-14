//writeNums(5) -> 1, 2, 3, 4, 5
public static void writeNums(int n){
    if(n < 1){
        throw new IllegalArgumentException();
    }
    else if(n == 1){
        System.out.print(1);
        return;
    }
    writeNums(n-1);
    System.out.print(", " + n);
}