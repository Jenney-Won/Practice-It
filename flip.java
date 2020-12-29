//Take IntTreeNode as parameter, swap each left node data to right, vice versa
public void flip(){
    overallRoot = flip(overallRoot); //overallRoot = 빼도 맞다고나옴
}

private IntTreeNode flip(IntTreeNode root){
    if(root == null){
        return null;
    }
    IntTreeNode x = root.left;
    root.left = flip(root.right);
    root.right = flip(x);
    return root;
}
