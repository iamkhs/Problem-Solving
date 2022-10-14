package CodeWithHarry;

public class FountainPen extends Pen{

    @Override
    public void write() {
        System.out.println("Writing...");
    }

    @Override
    public void refill() {
        System.out.println("Ink is refilling...");
    }

    public void changeNib(){
        System.out.println("Nib changing..");
    }
}
