// class Solution {
//     public boolean isValid(String s) {
//         boolean changed = true;
//         while(changed){
//             changed = false;
//             if(s.contains("()")){
//                 s=s.replace("()", "");
//                 changed=true;
//             }
//             if(s.contains("[]")){
//                 s=s.replace("([]", "");
//                 changed=true;
//             }
//             if(s.contains("{}")){
//                 s=s.replace("{}", "");
//                 changed=true;
//             }
//         }
//         return s.isEmpty();
//     }
// }
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty())  return false;

                char top = st.pop();
                if((c==')' && top != '(')||(c==']' && top != '[')||(c=='}' && top != '{')){
                    return false;
                }
            }
            
        }
        return st.isEmpty();
    }
}
