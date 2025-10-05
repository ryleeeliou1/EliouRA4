import java.util.*;

/**
 * This utility class will help to build and sort integer lists
 * such as the one in this program.
 * Allows for the reuse of the Collections Framework instead of
 * re-implementing it.
 * @see java.util.List
 * @see java.util.Stack
 * @see java.util.Collections
 * @since 1.0
 */

public final class NumberLists {

    private NumberLists(){} //no given instances

    /**
     * Reads {@code n} integers from the Scanner.
     *
     * Note: This method does NOT close the scanner
     *
     * @param sc the scanner
     * @param n how many integers are read
     * @return mutable List that contains the integers in input order
     * @throws java.util.InputMismatchException if non-int input provided
     */
    public static Stack<Integer> readIntegers(Scanner sc, int n) {
        Stack<Integer> out = new Stack<>();
        for (int i = 0; i < n; i++) out.push(sc.nextInt());
        return out;
    }

    /**
     * Returns new Stack in ascending order from given integers.
     * Reuses {@link Collections#sort(List)} and {@link Stack}.
     * @param numbers input numbers
     * @return sorted Stack
     */

    public static Stack<Integer> sortedStack(Collection<Integer> numbers) {
        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list); //reuse of Collections.sort

        //Push sorted elements into new stack
        Stack<Integer> sorted = new Stack<>();
        for (Integer num : list) {
            sorted.push(num);
        }
        return sorted;
    }
}