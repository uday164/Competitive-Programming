
public class NthFibonacci {
    private Integer fibRecurring(Integer n, Map<Integer, Integer> cache) {
        if (cache.get(n) != null ) return cache.get(n);
        cache.put(n, fibRecurring(n-1,cache)+fibRecurring(n-2,cache)) ;
        return cache.get(n);
    }

    public Integer fib(Integer n) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        cache.put(0,1);
        cache.put(1,1);
        return fibRecurring(n, cache);
    }
}
