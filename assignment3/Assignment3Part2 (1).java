/* Assignment 3, Part 2 - Go Dutch! */

public class Assignment3Part2
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
    Thread.sleep(1000);     //  Pause for 1 second.  You can pause for less if you like
    
    Pixel[] pixelArray = pic.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    
    //orange method
    while (i < (0.333333 * pixelArray.length))
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //get the value
      value = pixel.getGreen();
      //set green value 
      pixel.setGreen((int)(value*0.64));
      
      //set red value
      value = pixel.getRed();
      pixel.setRed((int)(value*1.5));
      
      //set blue value
      value=pixel.getBlue();
      pixel.setBlue(0);
      
      //increment the index
      i++;
    }
    
    //white method
    while (i < (0.666666 * pixelArray.length))
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //get the value
      value = pixel.getGreen();
      //set green value
      pixel.setGreen((int)(value*1.7));
      
      //set red value
      value = pixel.getRed();
      pixel.setRed((int)(value*1.7));
      
      //set blue value
      value=pixel.getBlue();
      pixel.setBlue((int)(value*1.7)); 
      
      //increment the index
      i++;
    }
    
    //green method
    while (i < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //set green value
      value = pixel.getGreen();
      pixel.setGreen((int)(value*2)); 
      
      //set red value
      value = pixel.getRed();
      pixel.setRed((int)(value*0));
      
      //set blue value
      value=pixel.getBlue();
      pixel.setBlue((int)(value*0));
      
      //increment the index
      i++;
    }
    
    
    pic.repaint();
  }  // End of main
}  // End of Class