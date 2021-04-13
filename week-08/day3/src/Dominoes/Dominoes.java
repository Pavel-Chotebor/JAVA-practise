package Dominoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

    /* Approach
    1. getting values on the right from dominoes and putting them into arraylist rightDomino
    2. sorting rightDomino and use of first loop: the domino with value on the right == rightDomino(0) is the first domino in new list dominoesOrdered
    3. while + inner loop: now when we know the first domino we performs multiple looping comparing the value on the right from the last domino in dominoesOrdered
    with the value on the left from all dominoes stored in array list "dominoes". If match, the domino is added to dominoesOrdered Array list.
     */

        System.out.println(dominoes);

        List<Integer> rightDomino = new ArrayList<>();
        for (int i = 0; i < dominoes.size(); i++) {
            rightDomino.add(dominoes.get(i).getRightSide());
        }

        Collections.sort(rightDomino);
        System.out.println(rightDomino);

        List<Domino> dominoesOrdered = new ArrayList<>();
        for (int i = 0; i < dominoes.size(); i++) {
            if (dominoes.get(i).getRightSide() == rightDomino.get(0)) {
                dominoesOrdered.add(dominoes.get(i));
            }
        }

        while (dominoesOrdered.size() != dominoes.size()) {
            for (int i = 0; i < dominoes.size(); i++) {
                if (dominoes.get(i).getLeftSide() ==
                        dominoesOrdered.get(dominoesOrdered.size() - 1).getRightSide()) {
                    if (dominoesOrdered.size() < dominoes.size()) {
                        dominoesOrdered.add(dominoes.get(i));
                    }
                }
            }
        }

        System.out.println(dominoesOrdered);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}