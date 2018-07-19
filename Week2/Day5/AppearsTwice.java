public class AppearsTwice {

    public Integer findTwiceInstance(Integer[] data) {

        HashSet set = new HashSet() ;
        for (Integer x : data) {
            if (set.contains(x) ) return x ;
            set.add(x) ;
        }
        return -1 ;

    }

}
