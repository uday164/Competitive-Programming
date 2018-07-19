public class TwoEgg {

    public Integer findHighest(int floorSize, int answer) 
        double root = -.5 + Math.sqrt(.25 + 2*floorSize) ;
        int step = (int) Math.ceil(root) ;
        int curr_floor = 0 ;
        while (step > 0) {
            curr_floor = curr_floor  + step ;
            if (curr_floor > answer) {
                curr_floor = curr_floor - step ;
                for (int j = 1; j < step; j++) {
                    if ((j+curr_floor)==answer) return j+curr_floor  ;
                }
                return -1;
            }
            step = step -1 ;
        }
        return floorSize ;

    }

}
