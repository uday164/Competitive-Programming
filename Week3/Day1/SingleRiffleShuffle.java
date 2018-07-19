public class SingleShuffle {

    public Boolean isRiffle(Integer[] half1, Integer[] half2, Integer[] deck )  {
        int h1 = 0 ;
        int h2 = 0 ;
        for (int d=0; d<deck.length ; d++) {
            if (h1<half1.length && deck[d].equals(half1[h1] ) ) {
                h1++ ;
                continue;
            }
            if (deck[d].equals(half2[h2] ) ) {
                h2++ ;
                continue;
            }
            return false;
        }
        return true ;
    }

}
