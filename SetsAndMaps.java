import java.util.*;

public class SetsAndMaps{
    public static void main(String[] args){
        Map<String, Integer> ageGroup = new TreeMap<String, Integer>();
        ageGroup.put("Alyssa", 22);
        ageGroup.put("Char", 25);
        ageGroup.put("Dan", 25);
        ageGroup.put("Jeff", 20);
        ageGroup.put("Kasey", 20);
        ageGroup.put("Kim", 20);
        ageGroup.put("Ryan", 25);

        rarestAge(ageGroup);
    }

    //prints out rarest-min age of the group
    public static void rarestAge(Map<String, Integer> map){
        if((map == null) || map.isEmpty()){
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        int minAge = Integer.MAX_VALUE;
        int minCount = Integer.MAX_VALUE;

        for(String name : map.keySet()){
            int age = map.get(name);
            if(!temp.containsKey(age)){
                temp.put(age, 1);
            }
            else{//add by one
                temp.put(age, temp.get(age) + 1);
            }
        }

        for(Integer age : temp.keySet()){
            if(minCount > temp.get(age)){
                minCount = temp.get(age);
                minAge = age;
            }
            else if(minCount == temp.get(age)){
                minAge = Math.min(minAge, age);
            }
        }
        System.out.println(minAge);
    }

}