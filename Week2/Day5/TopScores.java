public class TopScores {


    public Integer[] countingSort(Integer[] data, int maxScore) {
        int[] store = new int[maxScore] ;

        for (Integer i : data) {
            store[i]++ ;
        }

        Integer[] out = new Integer[data.length] ;
        int idx=0 ;
        for (int i=0; i<store.length; i++) {
            while (store[i] != 0) {
                store[i] = store[i] - 1 ;
                out[idx] = i ;
                idx++ ;
            }
        }
        return out ;
    }

}
