import java.util.Random;

public class RandomGenerator {
    private int index;

    public void setIndex() {
        Random random = new Random();
        index = random.nextInt(3);
    }

    public int getIndex() {
        return index;
    }

}