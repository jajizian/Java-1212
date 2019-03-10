import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class Assignment3Part4
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
    
    
    Pixel[] pixelArray = pic.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    
    
    pic.show();             // Show the original picture
    Thread.sleep(2000);     //  Pause for 1 second.  You can pause for less if you like
    
    
    //TINTING METHODS
    //METHOD TINT 1
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
    
    pic.repaint();
    
    //DUTCH METHODS
    //orange method
    
    pic.repaint();
    
    
    
    
    while (i < (0.333333 * pixelArray.length))
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //get the value
      value = pixel.getGreen();
      //set green value 
      
      pixel.setGreen((int)(value*.7));
      
      
      
      //set red value
      value = pixel.getRed();
      
      pixel.setRed((int)(value*5));
      
      
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
      
      pixel.setGreen((int)(value*1.5));
      
      //set red value
      value = pixel.getRed();
      
      pixel.setRed((int)(value*5));
      
      //set blue value
      value=pixel.getBlue();
      
      pixel.setBlue((int)(value*1)); 
      
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
    
    for (int z = 0; z < 20; z++)
    {
      //pause to see blurring better
      Thread.sleep(1500);
      //blur method call
      pic.averagePixelsHorizontally();
      //repaint to show the blur changing incrementally 
      pic.repaint();
      
    }
    
    
    
  }
}