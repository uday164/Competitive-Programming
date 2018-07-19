 private Integer maxValueAtCapacity(Integer capacity,Cake[] cakes, Map<Integer, Integer> pastSolns  ) {
        if (pastSolns.get(capacity) != null) return pastSolns.get(capacity);
        if (capacity < 1) return 0 ;

        Integer maxValue = 0 ;
        Integer valueToConsider = 0;
        for (Cake cake  : cakes) {
            if (cake.getWeight() > capacity) continue;
            valueToConsider = cake.getValue() + maxValueAtCapacity(capacity - cake.getWeight(), cakes, pastSolns) ;
            if (valueToConsider > maxValue) maxValue = valueToConsider ;
        }
        pastSolns.put(capacity, maxValue) ;
        return maxValue ;
        
         public Integer maxValueCapacity(Integer capacity, Cake[] cakes )
         {
        Map<Integer, Integer> pastSolns = new HashMap<Integer, Integer>() ;
        return maxValueAtCapacity(capacity, cakes, pastSolns);
        }
 public class CakeThief {
    public void maxValueCapacity() throws Exception {
        P16 p16 = new P16() ;
        P16.Cake[] cakes = {p16.new Cake(), p16.new Cake(), p16.new Cake()  };
        cakes[0].setValue(1);
        cakes[0].setWeight(1);
        cakes[1].setValue(3);
        cakes[1].setWeight(2);
       cakes[2].setValue(5);
        cakes[2].setWeight(3);
        Integer mv = p16.maxValueCapacity(1, cakes);
        assertEquals(mv, (Integer) 1);
    }
