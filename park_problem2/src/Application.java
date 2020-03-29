public class Application{
	public static void main(String[] args) {
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		try {
			duplicateCounter.count("problem2.txt");
			duplicateCounter.write("unique_word_counts.txt");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
