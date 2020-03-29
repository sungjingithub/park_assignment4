import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class DuplicateCounter {
	private Map<String, Integer> wordCounter;
	public void count(String dataFile) throws Exception{
		Map<String, Integer> wordMap = new HashMap<>();
		Scanner fileInput = new Scanner(new File(dataFile));  
		while(fileInput.hasNext()) {
			String word = fileInput.next();
			if (wordMap.containsKey(word)) {
				wordMap.put(word, (wordMap.get(word) + 1));
			} else {
				wordMap.put(word, 1);
			}
		}
		fileInput.close();

		Set<Entry<String, Integer>> wordEntries = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(wordEntries);
		wordCounter = new HashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			wordCounter.put(entry.getKey(), entry.getValue());
		}
	}

	public void write(String outputFile) throws Exception{
		FileWriter fw = new FileWriter(outputFile);
		for (Map.Entry<String, Integer> entry : new ArrayList<>(wordCounter.entrySet())) {
			fw.write(entry.getKey() + " => " + entry.getValue() + "\n");
		}
	    fw.close();
	}
}
