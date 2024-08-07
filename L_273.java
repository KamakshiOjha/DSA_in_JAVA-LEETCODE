class Solution {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        
        HashMap<Integer, String> ones_map = new HashMap<>();
        ones_map.put(1, "One");
        ones_map.put(2, "Two");
        ones_map.put(3, "Three");
        ones_map.put(4, "Four");
        ones_map.put(5, "Five");
        ones_map.put(6, "Six");
        ones_map.put(7, "Seven");
        ones_map.put(8, "Eight");
        ones_map.put(9, "Nine");
        ones_map.put(10, "Ten");
        ones_map.put(11, "Eleven");
        ones_map.put(12, "Twelve");
        ones_map.put(13, "Thirteen");
        ones_map.put(14, "Fourteen");
        ones_map.put(15, "Fifteen");
        ones_map.put(16, "Sixteen");
        ones_map.put(17, "Seventeen");
        ones_map.put(18, "Eighteen");
        ones_map.put(19, "Nineteen");
        
        HashMap<Integer, String> tens_map = new HashMap<>();
        tens_map.put(20, "Twenty");
        tens_map.put(30, "Thirty");
        tens_map.put(40, "Forty");
        tens_map.put(50, "Fifty");
        tens_map.put(60, "Sixty");
        tens_map.put(70, "Seventy");
        tens_map.put(80, "Eighty");
        tens_map.put(90, "Ninety");

        String[] postfix = {"", " Thousand", " Million", " Billion"};
        int i = 0;
        ArrayList<String> res = new ArrayList<>();
        
        while (num != 0) {
            int digits = num % 1000;
            if (digits != 0) {
                String s = get_string(digits, ones_map, tens_map) + postfix[i];
                res.add(0, s.trim());
            }
            num = num / 1000;
            i++;
        }
        
        String joinedWords = res.stream().collect(Collectors.joining(" "));
        return joinedWords.trim();
    }
    
    public String get_string(int n, Map<Integer, String> ones_map, Map<Integer, String> tens_map) {
        StringBuilder sb = new StringBuilder();
        
        if (n >= 100) {
            sb.append(ones_map.get(n / 100)).append(" Hundred ");
            n = n % 100;
        }
        
        if (n >= 20) {
            sb.append(tens_map.get(n - n % 10)).append(" ");
            n = n % 10;
        }
        
        if (n > 0) {
            sb.append(ones_map.get(n)).append(" ");
        }
        
        return sb.toString().trim();
    }

}
