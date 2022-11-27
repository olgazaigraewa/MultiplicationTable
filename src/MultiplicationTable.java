import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class MultiplicationTable {

    public MultiplicationTable() {
        Random random = new Random();
        Set<Number> numberSet = new HashSet<>();
        while (numberSet.size() < 15) {
            numberSet.add(new Number(random.nextInt(10), random.nextInt(10)));
        }
    }

}
