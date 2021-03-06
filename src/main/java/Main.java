import org.junit.jupiter.api.Assertions;
import structures.Actions;
import structures.tables.chain.ChainHashTable;
import structures.tables.doublehash.DoubleHashTable;
import structures.singlelinked.SingleLinkedList;

import java.util.AbstractMap;
import java.util.HashMap;

public class Main {
    public static void test(Actions<Integer, Integer> type, int size, String name) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            type.put(i, i);
        }
        for (int i = 0; i < size; i++) {
            Assertions.assertEquals(i, type.get(i));
        }
        time = System.currentTimeMillis() - time;
        System.out.println(name + ": " + time);
    }
    public static void test(AbstractMap<Integer, Integer> type, int size, String name) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            type.put(i, i);
        }
        for (int i = 0; i < size; i++) {
            Assertions.assertEquals(i, type.get(i));
        }
        time = System.currentTimeMillis() - time;
        System.out.println(name + ": " + time);
    }
    public static void test(SingleLinkedList<Integer> type, int size, String name) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            type.put(i);
        }
        for (int i = 0; i < size; i++) {
            Assertions.assertEquals(i, type.get(i));
        }
        time = System.currentTimeMillis() - time;
        System.out.println(name + ": " + time);
    }

    public static void main(String[] args) {
        final int SIZE = 100_000;
        test(new HashMap<>(), SIZE, "HashMap");
        test(new ChainHashTable<>(), SIZE, "ChainHashTable");
        test(new DoubleHashTable<>(), SIZE, "DoubleHashTable");
        test(new SingleLinkedList<>(), SIZE, "SingleLinkedCycledList");
    }
}
