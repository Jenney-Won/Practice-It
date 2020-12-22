//backtracking 1: https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e19-countBinary
public void countBinary(int n){
    countBinary(n, "");
}

private void countBinary(int n, String s){
    if(n == 0){
        System.out.println(""); //blank line if n is zero
    }
    else if(s.length() == n){
        System.out.println(s);
    }
    else{
        countBinary(n, s + "0");
        countBinary(n, s + "1");
    }
}
