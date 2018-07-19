public class BEASTMODEfsr {
    public Integer findDuplicate(Integer[] data) {

        int idx = 0 ;
        int val_at_next_idx = 0 ;
        int next_idx = 0 ;
        int store = 0 ;
        while (idx < data.length) {
            next_idx = data[idx] ;

            if (idx == next_idx ) {
                idx++ ;
                continue ;
            }

            // we know next_idx is pointing somewhere other than current place.
            // this value is the value there to be replaced by (next_idx)
            val_at_next_idx = data[next_idx] ;

            while ( val_at_next_idx != next_idx ) {
                data[next_idx] = next_idx ;
                next_idx =  val_at_next_idx;
                val_at_next_idx = data[next_idx] ;
            }
            return val_at_next_idx ;
        }
        return null ;
    }

}
