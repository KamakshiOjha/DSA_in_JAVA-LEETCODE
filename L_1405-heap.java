class Pair{
    int count;
    char ch;
    Pair(int count,char ch){
        this.count = count;
        this.ch = ch;
    }
}
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p2.count - p1.count);
        if(a>0){
            p.add(new Pair(a,'a'));
        }if(b>0){
            p.add(new Pair(b,'b'));
        }if(c>0){
            p.add(new Pair(c,'c'));
        }
        StringBuilder result = new StringBuilder();

        while(!p.isEmpty()){
            Pair first = p.poll();
            if(result.length()>=2 && result.charAt(result.length()-1) == first.ch && result.charAt(result.length()-2) == first.ch){
                if(p.isEmpty()){
                    break;
                }
                Pair second = p.poll();
                result.append(second.ch);
                second.count--;
                if(second.count>0){
                    p.add(second);
                }
                p.add(first);
            }else{
                result.append(first.ch);
                first.count--;
                if(first.count>0){
                    p.add(first);
                }
            }

        }
        return result.toString();
    }
}
