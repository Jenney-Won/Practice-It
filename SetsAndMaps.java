import java.util.*;

public class SetsAndMaps{
    public static void main(String[] args){
        System.out.print(m(5));
    }

    public static int m(int n){
        if(n<=1){
            return 1;
        }
        else{
            return m(n-2) + m(n-1);
        }
    }

}