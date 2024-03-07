package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));
		fw.write("너무 복잡해요");
		fw.newLine();
		fw.write("어려워요");
		fw.newLine();
		fw.write("집으로...!");
		fw.flush();
		fw.close();
	}
}
