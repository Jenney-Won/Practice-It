/*
Call	Output
printRange(1, 9);	1 > 2 > 3 > 4 > 5 < 6 < 7 < 8 < 9
printRange(10, 20);	10 > 11 > 12 > 13 > 14 > 15 < 16 < 17 < 18 < 19 < 20
printRange(-8, -8);	-8
printRange(1, 10);	1 > 2 > 3 > 4 > 5 - 6 < 7 < 8 < 9 < 10
printRange(13, 14);	13 - 14
*/

public void printRange(int x, int y){
    if(x > y){
        throw new IllegalArgumentException();
    }
    else if(x == y){
        System.out.print(x);
    }
    else if(y - x == 1){
        System.out.print(x + " - " + y);
    }
    else{
        System.out.print(x + " > ");
        printRange(x+1, y-1);
        System.out.print(" < " + y);
    }
}