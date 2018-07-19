public class ReverseWords {

    public String revWordsInPlace( String sentenceString ) {
        char[] sentence = sentenceString.toCharArray() ;

        P26 p26 = new P26() ;
        p26.reverse(sentence) ;

        int len = 0 ;
        for (int i=0; i< (sentence.length) ; i++ ) {
            if (sentence[i] == ' ') {
                revWord(sentence, i-len, i ) ;
                len = 0;
                continue;
            }
            len++ ;

        }
        revWord(sentence, sentence.length-len, sentence.length ) 

        String out = new String(sentence);
        return out ;
    }

    private void revWord(char[] sentence, int start, int end) {
        if (start == end) return ;
        if ( end- start == 1 ) return ;
        int range = (end-start) / 2 ;
        char temp = '0';
        for (int i=0; i<range; i++) {
            temp = sentence[i+ start] ;
            sentence[i + start] = sentence[end - i - 1] ;
            sentence[end - i -1] = temp ;
        }
    }

}
