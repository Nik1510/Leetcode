class Solution {
    public String addBinary(String a, String b) {
        StringBuilder st = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int t1 = 0, t2 = 0;

            if (i >= 0) {
                t1 = a.charAt(i--) - '0';
            }
            if (j >= 0) {
                t2 = b.charAt(j--) - '0';
            }

            int sum = t1 + t2 + carry;
            carry = sum / 2;  
            st.append(sum % 2); 
        }

        return st.reverse().toString(); 
    }
}
