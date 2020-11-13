//음수,양수 나누는게 아닌 말 그대로 dash(-) 기준으로 base case생각하기
public void printDashed(int n) {
    if(n < 0){
        System.out.print("-");
        printDashed(-n);
    }
    else if(n < 10){
        System.out.print(n);
    }
    else{
        int remainder = n/10;
        int lastDigit = n%10;
        printDashed(remainder);
        System.out.print("-" + lastDigit);
    }
}