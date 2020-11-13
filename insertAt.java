public int[] insertAt(int index, int n, int value){
    if(index > size || index < 0 || n < 1){
        throw new IllegalArgumentException();
    }   
    else{
        size += n; //new size
        for(int i=0; i<size-n-index; i++){
            elementData[size-1-i] = elementData[size-1-n-i];
        }
        for(int i=1; i<=n; i++){
            elementData[index] = value;
            index++;
        }
    }  
    return elementData;
}