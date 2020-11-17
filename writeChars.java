/*
writeChars(1) -> *
writeChars(2) -> **
writeChars(3) -> <*>
writeChars(4) -> <**>
writeChars(5) -> <<*>>
*/
public static void writeChars(int n){
    if(n < 1){
        throw new IllegalArgumentException();
    }
    else if(n == 1){ //two base cases since stars goes 1, 2, 1, 2, 1...
        System.out.print("*");
    }
    else if(n == 2){ //base case2
        System.out.print("**");
    }
    else{
        System.out.print("<");
        writeChars(n-2);
        System.out.print(">");
    }
}