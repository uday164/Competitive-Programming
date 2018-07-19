public class PermutationPalindrome {
    public boolean isEvenPal(String s) {

        int x = 0 ;

        for (int i=0; i< s.length() ; i++) {
            x = x ^ s.charAt(i) ;
        }
        if (x==0) return true ;
        return false;

    }

}
