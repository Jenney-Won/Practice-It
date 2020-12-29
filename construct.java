//Get array data as parameter, then construct bst(in-order)
public void construct(int[] data){
    overallRoot = construct(data, 0, data.length-1);
}

private IntTreeNode construct(int[] data, int start, int end){
    if(start > end){
        return null;
    }
    
    int mid = (start + end + 1) / 2;
    IntTreeNode node = new IntTreeNode(data[mid]);
    node.left = construct(data, start, mid - 1);
    node.right = construct(data, mid + 1, end);
    return node;
}
