public class AmericanDream extends Mall{
    private boolean waterPark;
    private boolean amusementPark;

    public AmericanDream (int b,double r, int s, int c, boolean w, boolean a) {
        super(b, r, s, c);
        waterPark = w;
        amusementPark = a;

    }

    public boolean getWaterPark () {
        return waterPark;
    }
    public boolean getAmusementPark() {
        return amusementPark;
    }

    public void waterParkStatus() {
        if (waterPark) {
            System.out.println("The water park is open!");
        }
    }
    public void amuesmentParkStatus() {
        if (amusementPark) {
            System.out.println("The amusement park is open!");
        }
    }

    public void closeWaterPark () {
        System.out.println("Sorry, the water park is closed now");
        waterPark = false;
    }
    public void closeAmusementPark () {
        System.out.println("Sorry, the amusement park is closed now");
        amusementPark = false;
    }

}
