package kyu7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Difference_between_two_collections {
    public static void main(String[] args) {


    }
    public static List<Character> diff2(Collection<Character> a, Collection<Character> b) {
        return Stream.of(a, b).flatMap(Collection::stream).distinct().filter(c -> !a.contains(c) || !b.contains(c))
                .sorted().collect(Collectors.toList());
    }

    static List<Character> diff3(final Collection<Character> aa, final Collection<Character> bb) {
        Set<Character> a = new HashSet<>(aa);
        Set<Character> b = new HashSet<>(bb);

        Set<Character> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        Set<Character> union = new HashSet<>(a);
        union.addAll(b);

        // union minus intersection equals symmetric-difference
        Set<Character> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);

        List<Character> result = new ArrayList<>(symmetricDifference);
        result.sort(Character::compareTo);

        return result;
    }
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        Set s1 = new TreeSet(a), s2 = new HashSet(b);
        s1.removeAll(s2);
        s2.removeAll(new HashSet(a));
        s1.addAll(s2);
        return new ArrayList(s1);
    }
}
