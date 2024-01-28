package pack;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {
    private final List<Integer> elements;

    public BinaryHeap() {
        this.elements = new ArrayList<>();
        this.elements.add(null); // 0 인덱스는 사용 x
    }

    public void insert(final int value) {
        elements.add(value); // 1. 하위레벨의 가장 마지막 부분에 삽입한다.
        percolateUp(); // 2~3. 위치를 변경한다., 계속 반복한다.
    }

    private void percolateUp() {
        int index = elements.size() - 1;

        int parentIndex = index / 2;

        while (parentIndex > 0) {
            if (elements.get(index) < elements.get(parentIndex)) {
                swap(index, parentIndex);
            }

            index = parentIndex;
            parentIndex = index / 2;

        }
    }

    private void swap(int index, int parentIndex) {
        int temp = elements.get(index);
        elements.set(index, elements.get(parentIndex));
        elements.set(parentIndex, temp);
    }

    public void minHeapify(final int i) {
        int left = i * 2;
        int right = i * 2 + 1;

        int smallIndex = i;

        if (left <= elements.size() - 1 && elements.get(left) < elements.get(smallIndex)) {
            smallIndex = left;
        }

        if (right <= elements.size() - 1 && elements.get(right) < elements.get(smallIndex)) {
            smallIndex = right;
        }

        if (smallIndex != i) {
            swap(smallIndex, i);
            minHeapify(smallIndex);
        }
    }

    public int extract() {
        int minValue = elements.get(1);

        elements.set(1, elements.get(elements.size() - 1));
        elements.remove(elements.size() - 1); //가장 첫번째로 옮겼기에 뒤에 있던 값은 제거함
        minHeapify(1);

        return minValue;
    }

}
