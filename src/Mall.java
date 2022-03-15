public class Mall {
    private int numBathroom;
    private double rating;
    private int numStores;
    private int closedStores;

    public Mall (int b, double r, int s, int c) {
        numBathroom = b;
        rating = r;
        numStores = s;
        closedStores = c;
    }
    public int getNumBathroom () {
        return numBathroom;
    }
    public double getRating (){
        return rating;
    }
    public int getNumStores (){
        return numStores;
    }
    public int getClosedStores () {
        return closedStores;
    }


    public void cleanMall () {
        System.out.println("The mall has been cleaned");
    }

    public void openAll () {
        System.out.println("All closed stores have been opened");
    }

}
