package src.task1;
import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> candies;

    public ArrayList<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(ArrayList<CandyBox> candies) {
        this.candies = candies;
    }

    public CandyBag() {
        candies = new ArrayList<>();
        candies.add(new Lindt("cherry", "Austria", 20.0F, 5.4F, 19.2F));
        candies.add(new Lindt("apricot", "Austria", 20.0F, 5.4F, 19.2F));
        candies.add(new Lindt("strawberry", "Austria", 20.0F, 5.4F, 19.2F));
        candies.add(new Baravelli("grape", "Italy", 6.7F, 8.7F));
        candies.add(new ChocAmor("coffee", "France", 5.5F));
        candies.add(new ChocAmor("vanilla", "France", 5.5F));
    }
}
