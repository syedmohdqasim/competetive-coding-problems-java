package geeksForGeeks;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;


public class HeapTest {


    public class MaxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public class MinHeapComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    @Test
    public void testMaxHeap() {
        Heap heap = new Heap(new MaxHeapComparator());
        heap.insert(5);
        heap.insert(10);
        heap.insert(6);
        heap.insert(5);

        assertEquals(10, (heap.pop()));
        assertEquals(6, (heap.pop()));
        assertEquals(5, (heap.pop()));
        assertEquals(5, (heap.pop()));
    }


    @Test
    public void testMinHeap() {
        Heap heap = new Heap(new MinHeapComparator());
        heap.insert(5);
        heap.insert(10);
        heap.insert(6);
        heap.insert(5);

        assertEquals(5, (heap.pop()));
        assertEquals(5, (heap.pop()));
        assertEquals(6, (heap.pop()));
        assertEquals(10, (heap.pop()));
    }
}