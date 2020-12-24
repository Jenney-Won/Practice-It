public class Main {
    public static void main(String[] args){
        combinations("google", 3);
    }
    
    public static void combinations(String s, int length) {
        Set<String> all = new HashSet<String>();
        combinations(s, "", all, length);
        for (String comb : all) {
            System.out.println(comb);
        }
    }
    
    private static void combinations(String s, String chosen,
        Set<String> all, int length) {
        if (length == 0) {
            all.add(chosen); // base case: no choices left
        } 
        else {
            for (int i = 0; i < s.length(); i++) {
                String ch = s.substring(i, i + 1);
                if (!chosen.contains(ch)) {
                    String rest = s.substring(0, i) + s.substring(i + 1);
                    combinations(rest, chosen + ch, all, length - 1);
                }
            }
        }
    }
}
