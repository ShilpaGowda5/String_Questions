package Strings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LeastAndMostCount {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "def", "abc", "abc", "def", "fhg");
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Initialize variables to track most and least frequent strings
        String mostFrequentString = null;
        int mostFrequentCount = 0;
        String leastFrequentString = null;
        int leastFrequentCount = Integer.MAX_VALUE;


        // Count occurrences
        for (String s : input) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        //Takes one string like "abc" and then compares it with the above array to check if it has the
        //String and if it has it takes the count of how many it has and then adds 1 to it which it had taken
        //to compare the string in the first place.


        // Determine most and least frequent
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {   //entrySet()This set provides
            // a view of the map's entries.
            // The entrySet() method is useful when you need to iterate over
            // the map entries and perform operations on both the keys and the values.
            String key = entry.getKey();
            int count = entry.getValue();

            // Check for most frequent
            if (count > mostFrequentCount) {
                mostFrequentCount = count;
                mostFrequentString = key;
            }

            // Check for least frequent
            if (count < leastFrequentCount) {
                leastFrequentCount = count;
                leastFrequentString = key;
            }
        }

        // Print results
        System.out.println("Most frequent: " + mostFrequentString + " (occurs " + mostFrequentCount + " times)");
        System.out.println("Least frequent: " + leastFrequentString + " (occurs " + leastFrequentCount + " times)");
    }
}

//    Most frequent: abc (occurs 3 times)
//        Least frequent: fhg (occurs 1 times)

/*
* import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordFrequency {

	public static void main(String[] args) {

		String[] arr = {"ckm", "blr","mum", "ckm", "blr", "ckm"};


		Map<String, Integer> freqMap = new HashMap<>();

		for(String s : arr) {

			freqMap.put(s, freqMap.getOrDefault(s, 0)+1);

		}
		System.out.println(freqMap);

		 String mostFrequentString = null;
	        int mostFrequentCount = 0;
	        String leastFrequentString = null;
	        int leastFrequentCount = Integer.MAX_VALUE;

		for(Entry<String, Integer> entry:freqMap.entrySet()) {
			String key = entry.getKey();
			int count = entry.getValue();

			if(count>mostFrequentCount) {
				mostFrequentString=key;
				mostFrequentCount=count;
			}
			if(count<leastFrequentCount) {
				leastFrequentString=key;
				leastFrequentCount=count;
			}

		}

		System.out.println("Most frequent word "+mostFrequentString+ " occurs "+mostFrequentCount+" times");
		System.out.println("Least frequent word "+leastFrequentString+ " occurs "+leastFrequentCount+" times");

	}

}
* */