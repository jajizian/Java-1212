import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import java.awt.Color;
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
  
  //program 8 form textbook
  //not an assignment, but though we might need for future reference
  //making a sunset
  //by decreasing green and blue
  //like program 9, but 1 method instead of 3
  public void makeSunset()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    //loop through all the pixels in the array
    while (i < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //change blue value
      value = pixel.getBlue();
      pixel.setBlue((int)(value*0.7));
      
      //change green value
      value = pixel.getGreen();
      pixel.setGreen((int)(value*0.7));
      
      //increment index
      i++;
    }
  }
  
  //PROGRAM 9 FROM TEXTBOOK
  //"MAKING A SUNSET"
  //DECREASING AMOUNT OF GREEN IN PIC BY 30%
  public void decreaseGreen()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    //loop through all the pixels in the array
    while (i < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //get the value
      value = pixel.getGreen();
      
      //set the green value to be 70% of what it was originally
      pixel.setGreen((int)(value*0.7));
      
      //increment the index
      i++;
    }
  }
  
  //PROGRAM 9 PART 2
  //DECREASE BLUE IN PIC BY 30%
  public void decreaseBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    //loop thru all pixels in array
    while (i < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //get the value
      value = pixel.getBlue();
      
      //set the blue value to 70% of original
      pixel.setBlue((int)(value*0.7));
    }
  }
  
  //program 9 part 3
  //make pic look like it was taken at sunset
  //by reducing blue and green to make it more red
  public void makeSunset2()
  {
    decreaseGreen();
    decreaseBlue();
  }
  
  //PROGRAM 11 FROM TEXTBOOK
  //CHANGE ALL PIXEL COLORS BY PASSED AMOUNTS
  //redAmount, greenAmount, and blueAmount are variable names
  public void changeColors(double redAmount, double greenAmount, double blueAmount)
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    //loop thru all pixels in array
    while (i < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //change red value
      value = pixel.getRed();
      pixel.setRed((int)(redAmount * value));
      
      //change green value
      value = pixel.getGreen();
      pixel.setGreen((int)(redAmount * value));
      
      //change blue value
      value = pixel.getBlue();
      pixel.setBlue((int)(redAmount * value));
      
      //increcement the index i
      i++;
    }
  }
  
  //PROGRAM 13 FROM TEXTBOOK
  //LIGHTENING A PICTURE
  public void lighten()
  {
    Pixel[] pixelArray = this.getPixels();
    Color color = null;
    Pixel pixel = null;
    
    //loop thru all pixels
    for (int i = 0; i < pixelArray.length; i++)
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //get current color
      color = pixel.getColor();
      
      //get a lighter color
      color = color.brighter();
      
      //set the pixel color to the lighter color
      pixel.setColor(color);
    }
  }
  
  //PROGRAM 15 FROM TEXTBOOK
  //CREATING A NEGATIVE FROM ORIGINAL IMAGE
  public void negate()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int redValue, blueValue, greenValue = 0;
    
    //loop thru all pixels
    for (int i = 0; i < pixelArray.length; i++)
    {
      //get current pixel
      pixel = pixelArray[i];
      
      //get current red, green, and blue values
      redValue = pixel.getRed();
      greenValue = pixel.getGreen();
      blueValue = pixel.getBlue();
      
      //set the pixels color to the new color
      pixel.setColor(new Color(255 - redValue, 255 - greenValue, 255 - blueValue));
    }
  }
  
  //LAB 7 PART A 
  
  public void decreaseBlue(double percent)
  {
    
    
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    double param1 = percent;
    //  double param2 = true;
    
    if (percent <= 0.0)
    {
      System.out.println("Error! Parameter lass than or equal to zero.");
      return;
    }
    
    if (percent>1)
    {
      System.out.println("Error! Parameter greater than one.");
      return;
    }
    
    
    
    //loop for all pixels
    while (index < pixelArray.length)
    {
      //get current pixel
      pixel = pixelArray[index];
      
      //get the value
      value = pixel.getBlue();
      
      //decrease the blue value by passed parameter
      value = (int) (value * percent);
      
      //set the blue value of current pixel to new value
      pixel.setBlue(value);
      
      //increment index
      index = index + 1;
    }
  }
  
  //lab7 partB method
  public void modifyGreen(double percent, double size)
  {
    
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value=0;
    int index=0;
    
    
    if (percent <= 0.0)
    {
      System.out.println("Error! Parameter less than or equal to zero.");
      return;
    }
    
    if (percent >= 2.0)
    {
      System.out.println("Error! Parameter greater than two.");
      return;
    }
    
    if (size > 1)
    {
      System.out.println("Error! Portion size is greater than one.");
    }
    
    if (size < 0)
    {
      System.out.println("Error! Portion size is less than one.");
    }
    
    //loop for all pixels
    while (index < (int) (pixelArray.length*size))
    {
      //current pixel
      pixel = pixelArray[index];
      
      //get the value
      value = pixel.getGreen();
      
      //change green value by passed param
      value = (int) (percent);
      
      //set the green value of current pixel to new value
      pixel.setGreen(value);
      
      //increment index
      index = index + 1;
    }
    
    
    
  }
  
  
  
  public void modifyRed(double percent, double size1, double size2)
  {
    
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value=0;
    int index = ((int) (size1 * pixelArray.length));
    
    if (percent <= 0.0)
    {
      System.out.println("Error! Parameter less than or equal to zero.");
      return;
    }
    
    if (percent >= 2.0)
    {
      System.out.println("Error! Parameter greater than two.");
      return;
    }
    
    if (size1 > 1)
    {
      System.out.println("Error! Portion size is greater than one.");
    }
    
    if (size1 < 0)
    {
      System.out.println("Error! Portion size is less than one.");
    }
    
    
    //loop for all pixels
    while (index < (int) (pixelArray.length * size2))
    {
      //current pixel
      pixel = pixelArray[index];
      
      //get the value
      value = pixel.getRed();
      
      //change green value by passed param
      value = (int) (value *percent);
      
      //set the green value of current pixel to new value
      pixel.setRed(value);
      
      //increment index
      index = index + 1;
    }
    
    
    
  }
  
  //PROGRAM 18 FROM TEXTBOOK
  //LIGTHEN THE PICTURE USING NESTED LOOPS
  
  public void ligthen2()
  {
    Color color = null;
    Pixel pixel = null;
    
    //loop thru the columns (x direction)
    for (int x = 0; x < getWidth(); x++)
    {
      //loop thru the rows (y direction)
      for (int y = 0; y < getHeight(); y++)
      {
        //get pixel at the x and y location
        pixel = getPixel(x,y);
        
        //get the current color
        color = pixel.getColor();
        
        //get a lighter color
        color = color.brighter();
        
        //set the pixel color to the lighter color
        pixel.setColor(color);
      }
    }
  }
  
  //PROGRAM 19 FROM THE TEXTBOOK
  //MIRROR PIXELS IN A PICTURE ALONG A VERTICAL LINE
  
  public void mirrorVertical()
  {
    int width = this.getWidth();
    int mirrorPoint = width/2;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    //loop thru all the rows
    for (int y = 0; y < getHeight();  y++)
    {
      //loop from 0 to the middle (mirror point)
      for (int x = 0; x < mirrorPoint; x++)
      {
        leftPixel = getPixel(x,y);
        rightPixel = getPixel(width - 1 -x, y);
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  //PROGRAM 20 FROM THE TEXTBOOK
  //MIRROR PIXELS HORIZONTALLY, TOP-TO-BOTTOM
  //COPIES TOP TO THE BOTTOM
  
  public void mirrorHoriztonal()
  {
    int height = this.getHeight();
    int mirrorPoint = height / 2;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    //loop thru the columns
    for (int x = 0; x < getWidth(); x++)
    {
      //loop form 0 to just before the mirror point
      for (int y = 0; y < mirrorPoint; y++)
      {
        topPixel = getPixel(x,y);
        bottomPixel = getPixel(x, height - 1 - y);
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
  }
  
  //PROGRAM 21 FROM TEXTBOOK
  //MIGHT COME IN HANDY
  //MIRROR PIXELS HORIZONTALLY, COPIES BOTTOM TO THE TOP
  
  public void mirrorHorizontalBottomToTop()
  {
    int height = this.getHeight();
    int mirrorPoint = height / 2;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    //loop thru columns
    for (int x = 0; x < getWidth(); x++)
    {
      //loop from 0 to just before the mirror point
      for (int y = 0; y < mirrorPoint; y++)
      {
        topPixel = getPixel(x,y);
        bottomPixel = getPixel(x, height - 1 - y);
        topPixel.setColor(bottomPixel.getColor());
      }
    }
  }
  
  //PROGRAM 22 FROM THE TEXTBOOK
  //MIRROR PART OF A PICTURE VERTICALLY
  
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel=null;
    
    //loop thru the rows
    for (int y = 27; y < 97; y++)
    {
      //loop from 13 to just before the mirror point
      for (int x =13; x < mirrorPoint; x++)
      {
        leftPixel=getPixel(x,y);
        rightPixel = getPixel(mirrorPoint + (mirrorPoint - x),y);
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  
  //PROGRAM 23 FROM TEXTBOOK
  //COPYING A PICTURE TO THE CURRENT PICTURE
  
  public void copyKatie()
  {
    String sourceFile = FileChooser.getMediaPath("KatieFancy.jpg");
    Picture sourcePicture = new Picture(sourceFile);
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    //LOOP THRU COLUMNS
    for (int sourceX = 0, targetX =0;
         sourceX < sourcePicture.getWidth();
         sourceX++, targetX++)
    {
      //LOOP THRU THE ROWS
      for (int sourceY=0, targetY=0;
           sourceY < sourcePicture.getHeight();
           sourceY++, targetY++)
      {
        //SET THE TARGET PIXEL COLOR TO THE SOURCE PIXEL COLOR
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel= this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  
  //PROGRAM 25 FROM TEXTBOOK
  //COPYING A PICTURE ONTO A CANVAS
  
  public void copyKatiesFace()
  {
    String sourceFile = FileChooser.getMediaPath("KatieFancy.jpg");
    Picture sourcePicture = new Picture(sourceFile);
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    //LOOP THRU THE COLUMNS
    for (int sourceX = 70, targetX = 100;
         sourceX < 135; sourceX++, targetX++)
    {
      //LOOP THRU THE ROWS
      for (int sourceY = 3, targetY = 100;
           sourceY < 80; sourceY++, targetY++)
      {
        //SET THE TARGET PIXEL COLOR TO THE SOURCE PIXEL COLOR
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel= this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  //PROGRAM 27.1 FROM TEXTBOOK
  //GENERAL COPY METHOD
  
  public void copyPictureTo(Picture sourcePicture, int xStart)
  {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    //LOOP THRU THE COLUMNS
    for (int sourceX = 0, targetX = xStart;
         sourceX < sourcePicture.getWidth();
         sourceX++, targetX++)
    {
      //LOOP THRU THE ROWS
      for (int sourceY=0, targetY= this.getHeight() - sourcePicture.getHeight() - 5;
           sourceY < sourcePicture.getHeight();
           sourceY++, targetY++)
      {
        //SET THE TARGET PIXEL COLOR TO THE SOURCE PIXEL COLOR
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel= this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  //PROGRAM 27.2 FROM TEXTBOOK
  //BETTER FLOWERS METHOD
  
  public void copyFlowersBetter()
  {
    //create the flower picture
    Picture flower1Picture = new Picture(FileChooser.getMediaPath("flower1.jpg"));
    Picture flower2Picture = new Picture(FileChooser.getMediaPath("flower2.jpg"));
    
    //copy the first flower picture to near the bottom left corner of canvas
    this.copyPictureTo(flower1Picture, 0);
    
    //copy the flower2 pic starting with x=100 in canvas
    this.copyPictureTo(flower2Picture, 100);
    
    //copy the flower1 negated to x=200 in canvas
    flower1Picture.negate();
    this.copyPictureTo(flower1Picture,200);
    
    //clear the blue in flower2 pic and add at x=300 in canvas
    flower2Picture.clearBlue();
    this.copyPictureTo(flower2Picture,300);
    
    //copy the negated flower1 to x=400
    this.copyPictureTo(flower1Picture, 400);
  }
  
  //PROGRAM 28 FROM TEXTBOOK
  //BLENDING TWO PICTURES
  
  public void blendPictures()
  {
    //create the sister pictures
    Picture katiePicture = new Picture(FileChooser.getMediaPath("KatieFancy.jpg"));
    Picture jennyPicture = new Picture(FileChooser.getMediaPath("JenParty.jpg"));
    
    //declare the source and target pixel variables
    Pixel katiePixel = null;
    Pixel jennyPixel = null;
    Pixel targetPixel = null;
    
    //DECLARE THE TARGETX AND SOURCEX SINCE WE WILL NEED THE VALUES AFTER THE FOR LOOP
    int sourceX=0;
    int targetX=0;
    
    //COPY THE FIRST 150 PIXELS OF KATIE TO CANVAS
    for (; sourceX < 150; sourceX++, targetX++)
    {
      for (int sourceY=0, targetY=0;
           sourceY < katiePicture.getHeight();
           sourceY++, targetY++)
      {
        katiePixel = katiePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(katiePixel.getColor());
      }
    }
    
    //COPY 50% OF KATIE AND 50% OF JENNY TILL THE END OF KATIES WIDTH
    for (; sourceX < katiePicture.getWidth();
         sourceX++, targetX++)
    {
      for (int sourceY=0, targetY=0;
           sourceY < katiePicture.getHeight();
           sourceY++, targetY++)
      {
        katiePixel = katiePicture.getPixel(sourceX, sourceY);
        jennyPixel = jennyPicture.getPixel(sourceX - 150, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(
                             new Color ((int) (katiePixel.getRed() * 0.5 +
                                               jennyPixel.getRed() * 0.5),
                                        (int) (katiePixel.getGreen() * 0.5 +
                                               jennyPixel.getGreen() * 0.5),
                                        (int) (katiePixel.getBlue() * 0.5 +
                                               jennyPixel.getBlue() * 0.5)));
      }
    }
    //COPY THE REST OF JENNY
    sourceX = sourceX - 150;
    for (; sourceX < jennyPicture.getWidth();
         sourceX++, targetX++)
    {
      for (int sourceY=0, targetY=0;
           sourceY < jennyPicture.getHeight();
           sourceY++, targetY++)
      {
        jennyPixel = jennyPicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(jennyPixel.getColor());
      }
    }
  }
  
  //PROGRAM 29 FROM TEXTBOOK
  //ROTATING AN IMAGE 90 DEGREES
  
  public void copyKatieLeftRotation()
  {
    String sourceFile = FileChooser.getMediaPath("KatieFancy.jpg");
    Picture sourcePicture = new Picture(sourceFile);
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    //LOOP THRU THE COLUMNS
    for (int sourceX = 0;
         sourceX < sourcePicture.getWidth();
         sourceX++)
    {
      //LOOP THRU THE ROWS
      for (int sourceY = 0;
           sourceY < sourcePicture.getHeight();
           sourceY++)
      {
        //SET THE TARGET PIXEL COLOR TO THE SOURCE PIXEL COLOR
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(sourceY, sourcePicture.getWidth() - 1 - sourceX);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  //PROGRAM 30 FROM TEXTBOOK
  //SCALING DOWN AN IMAGE
  //NOT PART OF PROGRAMS TO SUBMIT, BUT THOUGHT IT WILL COME IN HANDY AT SOME POINT
  
  public void copyJakitaSmaller()
  {
    Picture jakitaPicture = new Picture(FileChooser.getMediaPath("jakita.jpg"));
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    //LOOP THRU THE COLUMNS
    for (int sourceX=0, targetX=0;
         sourceX < jakitaPicture.getWidth();
         sourceX+=2, targetX++)
    {
      //LOOP THRU THE ROWS
      for (int sourceY=0, targetY=0;
           sourceY < jakitaPicture.getHeight();
           sourceY+=2, targetY++)
      {
        sourcePixel = jakitaPicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
          
      }
    }
    
  }
  
  //PROGRAM 31 FROM TEXTBOOK
  //SCALING UP A PICTURE 
  
  public void copyFlowerLarger()
  {
    Picture flowerPicture=new Picture(FileChooser.getMediaPath("rose.jpg"));
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    //LOOP THRU THE COLUMNS
    for (double sourceX=0, targetX=0;
         sourceX < flowerPicture.getWidth();
         sourceX = sourceX + 0.5, targetX++)
    {
      //LOOP THRU THE ROWS
      for (double sourceY=0, targetY=0;
           sourceY < flowerPicture.getHeight();
           sourceY= sourceY + 0.5, targetY++)
      {
        sourcePixel = flowerPicture.getPixel((int) sourceX, (int) sourceY);
        targetPixel = this.getPixel((int) targetX, (int) targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
} // this } is the end of class Picture, put all new methods before this


  



