import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class SetOperations {

    private Set<String> setA;
    private Set<String> setB;

    public SetOperations(String A, String B) {
        String[] listA = A.split(" ");
        String[] listB = B.split(" ");

        setA = new TreeSet<>();
        setB = new TreeSet<>();

        for (String word : listA) {
            setA.add(word);
        }

        for (String word : listB) {
            setB.add(word);
        }

    }

    public Set<String> union() {
        Set<String> newSet = new TreeSet<>();
        
        for (String word : setA) {
            newSet.add(word);
        }

        for (String word : setB) {
            newSet.add(word);
        }

        return newSet;
    }

    public Set<String> intersection() {
        Set<String> newSet = new TreeSet<>();
        Set<String> intersectionSet = new TreeSet<>();

        for (String word : setA) {
            newSet.add(word);
        }

        for (String word : setB) {
            if (newSet.contains(word)) {
                intersectionSet.add(word);
            }
        }

        return intersectionSet;
    }

    public Set<String> symmetricDiff() {
        Set<String> newSet = new TreeSet<>();
        
        for (String word : setA) {
            if (!(setB.contains(word))) {
                newSet.add(word);
            }
        }

        for (String word : setB) {
            if (!(setA.contains(word))) {
                newSet.add(word);
            }
        }
        
        return newSet;
    }

    public Set<String> diffAMinusB() {
        Set<String> newSet = new TreeSet<>();

        for (String word : setA) {
            if (!(setB.contains(word))) {
                newSet.add(word);
            }
        }

        return newSet;
    }

    public Set<String> diffBMinusA() {
        Set<String> newSet = new TreeSet<>();
        
        for (String word : setB) {
            if (!(setA.contains(word))) {
                newSet.add(word);
            }
        }

        return newSet;
    }

    public Set<String> getSetA() {
        return setA;
    }

    public Set<String> getSetB() {
        return setB;
    }
}
