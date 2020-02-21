public class Solution {
    public String defangIPaddr(String address) {

        char[] charArr;
        StringBuilder returnStr = new StringBuilder();

        charArr = address.toCharArray();

        for(int i = 0; i < charArr.length; i++) {
            // ran into a '.'
            if(charArr[i] == '.'){
                returnStr.append('[');
                returnStr.append(charArr[i]);
                returnStr.append(']');
            }
            // normal characters
            else{
                returnStr.append(charArr[i]);
            }
        }
        return returnStr.toString();
    }
}
