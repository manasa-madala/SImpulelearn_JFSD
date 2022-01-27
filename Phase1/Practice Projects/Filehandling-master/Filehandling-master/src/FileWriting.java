import java.io.FileWriter;
import java.io.IOException;
public class FileWriting {

	public static void main(String[] args) {
		//Writing to a file:
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\38975\\Desktop\\Coding2\\FileHandling\\text2.txt");
			myWriter.write("Java is the beswt programming language!");
			myWriter.close();
			System.out.println("Succesfully wrote to file!");
		}
		catch(IOException e) {
			System.out.println("Error has occured!");
			e.printStackTrace();
		}

	}

}