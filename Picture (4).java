import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  public static void main(String[] args) 
  {
    String fileName = FileChooser.pickAFile();
    Picture pictObj = new Picture(fileName);
    pictObj.explore();
  }
  
  
  //NEW METHODS FOR PICTURE.JAVA
  //PROGRAM 5 FROM TEXTBOOK:
  //METHOD TO DECREASE RED VALUES BY HALF IN CURRENT PICTURE
  public void decreaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value=0;
    int index=0;
    
    //LOOP THROUGH ALL THE PIXELS
    while (index < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[index];
      
      //get the value
      value = pixel.getRed();
      
      //decrease the red value by half
      value = (int) (value * 0.5);
      
      //set the red value of the current pixel to the new value
      pixel.setRed(value);
      
      //increment the index
      index = index + 1;
    }
  }
  
  
  //PROGRAM 6 FROM TEXTBOOK
  //INCREASE RED BY 30%
  
  public void increaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    //LOOP THROUGH ALL PIXELS
    while(index < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[index];
      
      //get the value
      value = pixel.getRed();
      
      //change value to 1.3 times what it was
      value = (int) (value * 1.3);
      
      //set the red value to 1.3 times original
      pixel.setRed(value);
      
      //increment the index
      index++;
    }
  }
  
  
  //PROGRAM 7 FROM TEXTBOOK
  //CLEAR BLUE COMPONENT FROM PICTURE
  
  public void clearBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int index=0;
    
    //LOOP THROUGH ALL PIXELS
    while (index<pixelArray.length)
    {
      //get the current pixel
      pixel = pixelArray[index];
      
      //set the blue on the pixel to 0
      pixel.setBlue(0);
      
      //increment the index
      index++;
      
    }
  }
} // this } is the end of class Picture, put all new methods before this






