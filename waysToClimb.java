//backtracking 2, 이게 맞나싶다..
public void waysToClimb(int total){
    waysToClimb(total, new ArrayList<Integer>());
}

private void waysToClimb(int total, List<Integer> list){
    if(total == 0 && list.isEmpty()){
        System.out.println();
    }
    else if(total == 0 && !list.isEmpty()){
        System.out.println(list);
    }
    else if(total == 1){
        list.add(1);
        waysToClimb(total - 1, list);
        list.remove(list.size() - 1);
    }
    else{
        list.add(1);
        waysToClimb(total - 1, list);
        list.remove(list.size() - 1);
        list.add(2);
        waysToClimb(total - 2, list);
        list.remove(list.size() - 1);
    }
}
