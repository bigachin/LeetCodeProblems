class Solution {
    public boolean isValid(String s) {
        boolean YN = false;
        String value = s.substring(0,2);
        for(int i=0;i<s.length()-1;i++){
            value = s.substring(i,i+2);
            if(value.equals("()") | value.equals("{}") | value.equals("[]")){
                YN = true;
                i++;
            }
            else{
                YN = false;
                break;
            }
            
        }
        if (YN && s.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}