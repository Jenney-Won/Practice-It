public int[] insertAt(int index, int n, int value){
        if((index < 0) || (index > size) || (n < 0)){
            throw new IllegalArgumentException();
        }
        else{
            size+=n; //make it biGGER!
            for(int i=1; i<=size-n-i; i++){
                elementData[size-i] = elementData[size-n-i];
            }
            for(int i=1; i<=n; i++){
                elementData[index] = value;
                index++;
            }
        }
        return elementData;
    }