public class Application{
	public static void main(String[] args) {
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		try {
			duplicateRemover.remove("problem1.txt");
			duplicateRemover.write("unique_words.txt");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}