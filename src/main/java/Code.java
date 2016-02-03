import java.io.*;

public class Code {
    public static void main(String[] args) {
        String fileName = "text.txt";  
	System.out.println("Welcome to My File Reader!");

	if (args.length > 0) {
	    fileName = args[0];
	}
	    

	System.out.println("I am reading file: ["+fileName+"]");

        String line = null;   

        try {
           
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(">> "+line);
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
           
        }
    }
}
