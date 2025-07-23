class Solution {
    public int maximumGain(String s, int x, int y) {
        int c = 0;
        StringBuilder sb = new StringBuilder(s);
        if(x > y){
            c += helper(sb, 'a', 'b', x);
            c += helper(sb, 'b', 'a', y);
        }else{
            c += helper(sb, 'b', 'a', y);
            c += helper(sb, 'a', 'b', x);
        }
        return c ;
    }
    public int helper(StringBuilder st, char n, char m, int num){
        int c = 0;
        for(int i=0; i<st.length()-1; ){
            if(st.charAt(i) == n && st.charAt(i+1) == m){
                c += num ;
                st.delete(i, i+2) ;
                if(i > 0){
                    i-- ;
                }
            }else{
                i++ ;
            }
        }
        return c ;
    }
}