public class InplaceShuffle {
    public String[] shuffle(String[] data ) {

        String temp ;
        for (int i=0; i< data.length ; i++) {
            int dest = (int) Math.floor((Math.random() * data.length));
            temp = data[i] ;
            data[i] = data[dest] ;
            data[dest] = temp ;
        }

        return data ;
    }
}
