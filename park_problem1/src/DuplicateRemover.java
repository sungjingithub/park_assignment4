import java.io.*;
import java.util.*;

public class DuplicateRemover {
	HashSet<String> hs = new HashSet<String>();
	public void remove(String dataFile){
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(new File(dataFile));  
			while(fileInput.hasNext()) {
				hs.add(fileInput.next());
			}
		}catch(Exception ex) {
			System.err.println("There is a problem to read data from a file.");
			ex.printStackTrace();
		}finally {
			if(fileInput != null) {
				try {
					fileInput.close();
				}catch(Exception e) {
					System.err.println("Can't close a file.");
					e.printStackTrace();
				}
			}
		}

		fileInput.close();
	}
	public void write(String outputFile){
		FileWriter fw = null;
		try {
			fw = new FileWriter(outputFile);
			for(String word : hs) {
				fw.write(word + "\n");
			}
		}catch(Exception ex) {
			System.err.println("There is a problem to write data to a file.");
			ex.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(Exception e) {
					System.err.println("Can't close a file.");
					e.printStackTrace();
				}
			}
		}
	}
}