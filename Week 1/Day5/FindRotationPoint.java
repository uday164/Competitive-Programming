public class P13 {
    public Integer binSearch( String[] data, Integer left, Integer right) {
        if (right - left == 1) {
            if ( data[left].compareTo( data[right]) > 0 ) return left;
            return right ;
        }
        if (right - left == 0) {
            return left;
        }
        Integer midpt = (right + left) / 2 ;
        if (data[left].compareTo( data[midpt] ) > 0 ) return binSearch( data, left, midpt) ;
        if ( data[right].compareTo( data[midpt] ) < 0 ) return binSearch( data, midpt, right) ;

        return -1;
    }
}
