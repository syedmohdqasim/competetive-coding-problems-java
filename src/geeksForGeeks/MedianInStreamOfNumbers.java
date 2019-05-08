package geeksForGeeks;

import java.util.Comparator;

// an Online Algorithm to find median of a stream of incoming numbers.
//using min and max heaps.
class MedianInStreamOfNumbers {
    private int median;
    Heap minHeap;
    Heap maxHeap;

    MedianInStreamOfNumbers() {
        this.minHeap = new Heap(new Comparator() {
            @Override
            public int compare(Object o2, Object o1) {
                return (Integer) o1 - (Integer) o2;
            }
        });
        this.maxHeap = new Heap(new Comparator() {
            @Override
            public int compare(Object o2, Object o1) {
                return (Integer) o2 - (Integer) o1;
            }
        });
        median = Integer.MIN_VALUE;

    }

    int streamMedian(int num) {
        if (minHeap.getHeapSize() == maxHeap.getHeapSize()) {
            if (num > median) {
                maxHeap.insert(num);
                return median = maxHeap.getTop();
            } else {
                minHeap.insert(num);
                return median = minHeap.getTop();
            }
        } else if (minHeap.getHeapSize() < maxHeap.getHeapSize()) {
            if (num > median) {
                minHeap.insert(maxHeap.pop());
                maxHeap.insert(num);
                return median = ((maxHeap.getTop() + minHeap.getTop()) / 2);
            } else {
                minHeap.insert(num);
                return median = ((maxHeap.getTop() + minHeap.getTop()) / 2);
            }
        } else {
            if (num > median) {
                maxHeap.insert(num);
                return median = ((maxHeap.getTop() + minHeap.getTop()) / 2);
            } else {
                maxHeap.insert(minHeap.pop());
                minHeap.insert(num);
                return median = ((maxHeap.getTop() + minHeap.getTop()) / 2);
            }
        }


    }
}
