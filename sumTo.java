/*
sumTo(n) returns: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
The method should return 0.0 if passed the value 0 and 
should throw an IllegalArgumentException if passed 
a value less than 0 
*/
public static double sumTo(int n){
    if(n<0){
        throw new IllegalArgumentException();
    }
    
    else if(n==0){
        return 0.0;
    }
    
    else if(n==1){
        return 1.0;
    }
    
    else{
        return sumTo(n - 1) + 1.0/n; //1로 실수하지말것
    }
}