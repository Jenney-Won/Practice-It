public static int rarestAge(Map<String, Integer> m){
    Map<Integer, Integer> ageCount = new TreeMap<Integer, Integer>();
    int minAge = Integer.MAX_VALUE;
    int minCount = Integer.MAX_VALUE;
    
    if(m == null || m.size() == 0){
        throw new IllegalArgumentException();
    }
    
    for(String name : m.keySet()){
        int age = m.get(name);       
        if(!ageCount.containsKey(age)){ //first occurence
            ageCount.put(age, 1);
        }        
        else{
            int oldCount = ageCount.get(age);
            ageCount.put(age, oldCount + 1); 
        }
    }
    
    for(Integer age : ageCount.keySet()){
        if(minCount > ageCount.get(age)){
            minCount = ageCount.get(age);
            minAge = age;
        }
        else if(minCount == ageCount.get(age)){
            minAge = Math.min(minAge, age);
        }
    }
    return minAge;
}