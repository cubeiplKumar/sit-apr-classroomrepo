// importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }

  #feature302 changes by Shyam -Module-Reports-Apr2022
  public static void sampleMethod(int a, int b) throws ArithmeticException{
        System.out.println("Hello, this is sample method");
        int c = a/b; //  int c = 4/2 which gets calculated as 2 
        System.out.println("c:"+c); // c: 2
   }


  #feature301 changes by Sourav -Module -Services on Apr2022
  // reads all data from input.txt
      sourceFile.read(array);

      // writes all data to newFile
 //Demo for git fetch command
      
}
