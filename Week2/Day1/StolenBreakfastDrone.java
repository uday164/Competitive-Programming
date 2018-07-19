public class P21 {
    public Integer findUnique(int[] data ) {
        int target = 0 ;
        for (int i : data) {
            target = target ^ i ;
        }
        return target ;

    }
}
