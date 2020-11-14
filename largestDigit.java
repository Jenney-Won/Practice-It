//largestDigit(14263203) -> 6
public static int largestDigit(int n){
    if(n < 0){
        return largestDigit(-n);
    }
    else if(n < 10){
        return n;
    }
    else{
        return Math.max(n%10, largestDigit(n/10));       
    }
}