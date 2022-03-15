public class RoosveltField extends Mall {
    private int parkingSpaceavail;

    public RoosveltField (int b,double r, int s, int c, int p) {
        super(b, r, s, c);
        parkingSpaceavail = p;
    }
    public int getParkingSpaceavail (){
        return parkingSpaceavail;
    }

    public void restrictParking () {
        System.out.println("It's after 6 PM, parking is now $5 an hour." + "\n" + "There are "+ parkingSpaceavail+ " available");
    }
    public void unrestrictParking () {
        System.out.println ("Good thing it's not 6 PM yet, parking is free!""\n" + "There are "+ parkingSpaceavail+ " available");
    }


}
