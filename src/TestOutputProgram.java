import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestOutputProgram {

	public static void main(String[] args) throws IOException {
		   
	    FileOutputStream fos = new FileOutputStream("d:\\java\\data.txt"); 
	    PrintStream fout = new PrintStream(fos);
	    
	    int kor1 = 30;
	    fout.printf("kor1 = %d", kor1);
		
	
	    
	    fout.close();
	    fos.close();

	}

}
