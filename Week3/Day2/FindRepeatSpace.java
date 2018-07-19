public class FindRepeatSpace {
    public Integer[] listDuplicates(Integer[] data) {

        inPlaceSort(data, (int)0, (int) data.length -1);

        Integer head ;
        HashSet<Integer> out = new HashSet<Integer>() ;

        Integer tail = data[0];
        for (int i=1; i < data.length; i++) {
            head = data[i] ;
            if (head == tail) out.add(head) ;
            tail = head ;
        }
        Integer[] outArray = new Integer[out.size()]   ;
        int i=0 ;
        for (Integer val : out) {
            outArray[i] = val;
            i++ ;
        }
        return outArray ;
    }

    private void inPlaceSort ( Integer[] x, int first, int last ) {
        if (first >= last) return ;
        int mid=(first+last)/2 ;
        inPlaceSort (x, first,  mid);
        inPlaceSort (x, mid+1, last);

        int left = first;
        int right = mid+1;

        if ( x[mid].compareTo(x[right]) <= 0 )
            return;

        while (left <= mid && right <= last)
        {
            if ( x[left].compareTo(x[right]) <= 0 )
                left++;

            else
            {  Integer tmp = x[right];
                System.arraycopy(x, left, x, left+1, right-left);
                x[left] = tmp;
                left++;  mid++;  right++;
            }
        }
    }
}
