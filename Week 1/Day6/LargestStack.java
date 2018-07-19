public class LargestStack {
    public Integer findUnique(int[] data ) {
        int target = 0 ;
        for (int i : data) {
            target = target ^ i ;
        }
        return target ;
    }
}
