public class P28 {
    public Integer findParen(String s, int idx) {
        Stack stack = new Stack();
        stack.push(s.charAt(idx)) ;

        while (!stack.empty()) {
            idx++;
            if (s.charAt(idx) == '(') stack.push(s.charAt(idx)) ;
            if (s.charAt(idx) == ')' ) stack.pop() ;
        }
        return idx ;
    }
}
