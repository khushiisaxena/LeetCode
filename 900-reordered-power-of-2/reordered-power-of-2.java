class Solution {
    public String getSorted(int n){
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String rt = new String(ch);

        return rt;

    }
    public boolean reorderedPowerOf2(int n) {
        String s= getSorted(n);
        for(int p=0 ; p<=29 ; p++){
            if(s.equals(getSorted(1<<p)))
                return true;
        }
        return false;
    }
}