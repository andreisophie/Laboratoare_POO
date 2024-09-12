package EvenSets;

import java.util.HashSet;

public class EvenSet extends HashSet<Integer> {
    @Override
    public boolean add(Integer e) {
        if (e % 2 == 1) {
            return false;
        }
        return super.add(e);
    }
}
