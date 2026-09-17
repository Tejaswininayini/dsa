package Demo;

public class TopKFrequent {
	
	static int[] topKFrequent(int[] nums, int k) {
		
		Map<Integer, Integer> frequency = new HashMap<> ();
		
		
		//Count frequency
		for (int num : nums) {
			
			frequency.put (
					num,
					frequency.getOrDefault(num, 0) + 1
					);
			
			
		}
		//Min heap based on freqency
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(
				
				
				
				
				)
	}

}
