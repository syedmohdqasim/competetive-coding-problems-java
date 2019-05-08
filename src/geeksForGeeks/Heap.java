package geeksForGeeks;

import java.util.ArrayList;
import java.util.Comparator;


//min or max heap based on the comaprator.
public class Heap {
    ArrayList<Integer> heap;
    Comparator comparator;

    Heap(Comparator comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    void insert(int number) {
        heap.add(number);
        heapify(heap.size() - 1, 0);
    }

    int pop() {
        if (heap.size() > 0) {
            swap(0, heap.size() - 1);
            Integer remove = heap.remove(heap.size() - 1);
            heapify(heap.size() - 1, 0);
            return remove;
        }
        return -1;
    }

    private void heapify(int size, int root) {
        Integer largest = root;
        int child1 = root * 2 + 1;
        int child2 = root * 2 + 2;
        if (child1 <= size && comparator.compare(heap.get(largest), heap.get(child1)) > 0) {
            largest = child1;
        }
        if (child2 <= size && comparator.compare(heap.get(largest), heap.get(child2)) > 0) {
            largest = child2;
        }
        if (largest != root) {
            swap(root, largest);
            heapify(size, largest);
        }
    }

    private void swap(int p1, int p2) {
        int temp = heap.get(p1);
        heap.set(p1, heap.get(p2));
        heap.set(p2, temp);
    }

    int getHeapSize() {
        return heap.size();
    }

    int getTop() {
        return heap.get(0);
    }

}
