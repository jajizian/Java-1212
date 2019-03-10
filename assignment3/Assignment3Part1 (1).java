/* Assignment 3, Part 1 - Go Psychedelic! */

public class Assignment3Part1 
{ 
//
  public static void main(String [] args) throws InterruptedException
  {
    String filename; 
    if (args.length > 0) {
      // got a filename passed into program as a parameter
      // don't change this part of the code needed by TA for grading
      filename = args[0];      
      System.out.println("Filename passed in: " + filename);
      
    } else {
      // ask user for a picture
      filename = FileChooser.getMediaPath("myHeadShot.jpg");
      System.out.println("User picked file: " + filename);
    }
    Picture pic = new Picture(filename);   // Picture to modify
    //
    pic.show();             // Show the original picture
    Thread.sleep(2000);     //  Pause for 1 second.  You can pause for less if you like
    
    //METHOD CALL 1
    pic.tintRed();
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(2000);     //  Pause for 1 second
    
    //METHOD CALL 2
    pic.tintGreen();
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(2000);     //  Pause for 1 second
    
    //METHOD CALL 3
    pic.tintBlue();
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(2000);     //  Pause for 1 second
  
    
  }  // End of main method
  
}  // End of class