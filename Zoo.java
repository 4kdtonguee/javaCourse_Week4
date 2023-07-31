import java.util.ArrayList;
public class Zoo {
    private ArrayList<Hedgehog> hedgehogs;
    public Zoo() {
        hedgehogs = new ArrayList<>();
    }
    public void addAHedgehog(Hedgehog hedge) {
        hedgehogs.add(hedge);
    }

    public void hedgehogSpeak1(String message) {
        for (Hedgehog hedge : hedgehogs) {
            hedge.speak3(message);
        }
    }

    public void hedgehogSpeak2(int number) {
        for (Hedgehog hedge : hedgehogs) {
            hedge.speak2(number);
        }
    }
    public void hedgehogList() {
        for (Hedgehog hedge : hedgehogs) {
            System.out.println(hedge.getName());
        }
    }
}