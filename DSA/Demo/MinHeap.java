package Demo;

public class MinHeap {
	private int[] heap;
	private int size;
	MinHeap(int capacity) {
		heap = new int[capacity];
		size = 0;
	}
	void insert(int value) {
		if(size == heap.length) {
			System.out.println("Heap is full");
			return;
		}
		heap[size] = value;
		int current = size;
		size++;
		while(current > 0) {
			int parent = (current - 1) / 2;
			if(heap[parent] <= heap[current]) {
				break;
			}
			int temp = heap[parent];
			heap[parent] = heap[current];
			heap[current] = temp;
			current = parent;
		}
	}
	int peek() {
		if(size == 0) {
			throw new RuntimeException("Heap is empty");
		}
		return heap[0];
	}
	int deleteMin() {
		if(size == 0) {
			throw new RuntimeException("Heap is empty");
		}
		int min = heap[0];
		heap[0] = heap[size - 1];
		size--;
		int current = 0;
		while(true) {
			int left = 2 * current + 1;
			int right = 2 * current + 2;
			int smallest = current;
			if(left < size && heap[left] < heap[smallest]) {
				smallest = left;
			}
			if(right < size && heap[right] < heap[smallest]) {
				smallest = right;
			}
			if(smallest == current) {
				break;
			}
			int temp = heap[current];
			heap[current] = heap[smallest];
			heap[smallest] = heap[smallest];
			current = smallest;
		}
		return min;
	}
	void display() {
		for(int i = 0; i < size; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
}
public class MinHeap1 {
	public static void main(String[] args) {
		MinHeap1 heap = new MinHeap1(10);
		heap.insert(30);
		heap.insert(10);
		heap.insert(20);
		heap.insert(5);
		heap.insert(40);
		heap.display();
		System.out.println("Minimum = " + heap.peek());
		System.out.println("Delete = " + heap.deleteMin());
		heap.display();
	}

}
		}
		
	}

}
