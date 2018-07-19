public class P14 {
    public Boolean isTwoMovies(Integer flightLength , Integer[] movies) {
        Map<Integer, Integer> sums = new HashMap<Integer, Integer>();
        for (Integer movieLength : movies) {
            if (sums.get(movieLength) != null) return true ;
            sums.put(flightLength - movieLength, 1) ;
        }
        return false;
    }
}
