class Solution {
    class Pair<U, V> {
        public final U first;
        public final V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        public U getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }
    }
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        if(skill.length == 2){
            return skill[0]*skill[1];
        }
        List<Pair<Integer,Integer>> arr = new ArrayList<>();
        int i= 1;
        int j = skill.length-2;
        int sum  = skill[i -1] + skill[j+1];
        arr.add(new Pair( skill[i -1], skill[j +1]));
        while(i<j){
            if(sum == skill[i] + skill[j]){
                arr.add(new Pair( skill[i], skill[j]));
                i++;
                j--;
            }else{
                return -1;
            }
        }
        int total = 0;
        for (Pair<Integer, Integer> pair : arr) {
            int mul = pair.getFirst()*pair.getSecond();
            total+=mul;
        }
        return total;
    }
}
