class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        int n = binary.length();
        char s[] = new char[n];
        for (int i = 0; i < n; i++) {
            if (binary.charAt(i) == '0') {
                s[i] = '1';
            } else {
                s[i] = '0';
            }
        }
        String m = new String(s);
        return Integer.parseInt(m, 2);
    }
}
