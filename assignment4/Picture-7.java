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
  
  //LAB 9 PART A
  public void quatrefoil()
  {
    this.mirrorVertical();
    this.mirrorHoriztonal();
  }
  
  //LAB 9 PART B
  public void verticalShutters()
  {
    Pixel pixel = null;
    
    //loop through columns
    for(int x = 0; x < getWidth() - 1; x++)
    {
      for (int y = 0; y < getHeight(); y++)
      {
        if((x/10)%2 == 0) //set pixel to black
        {
          pixel = getPixel(x,y);
          pixel.setColor(Color.black);
        }
      }
    }
  }
  
  //LAB 9 PART C
  public void horizontalShutters()
  {
    Pixel pixel = null;
    
    //loop through columns
    for(int x = 0; x < getWidth() - 1; x++)
    {
      for (int y = 0; y < getHeight(); y++)
      {
        if((y/10)%2 == 0) //set pixel to black
        {
          pixel = getPixel(x,y);
          pixel.setColor(Color.black);
        }
        else
        {
          pixel=getPixel(x,y);
          pixel.setColor(pixel.getColor().brighter());
        }
      }
    }
  }
  
  //LAB 9 BONUS 1
  public Picture tile()
  {
    Picture newPic = new Picture(this.getWidth()*2, this.getHeight()*2);
    Pixel srcPixel = null;
    Pixel destPixel = null;
    
    for(int x = 0; x < getWidth(); x++)
    {
      for(int y = 0; y < getHeight(); y++)
      {
        srcPixel = getPixel(x,y);
        //top left
        destPixel = newPic.getPixel(x,y);
        destPixel.setColor(srcPixel.getColor());
        //top right
        destPixel = newPic.getPixel(x + getWidth(),y);
        destPixel.setColor(srcPixel.getColor());
        //bottom left
        destPixel = newPic.getPixel(x,getHeight() + y);
        destPixel.setColor(srcPixel.getColor());
        //bottom right
        destPixel = newPic.getPixel(x + getWidth(),y + getHeight());
        destPixel.setColor(srcPixel.getColor());
      }
    }
    return newPic;
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
  
  //LAB 10 PART A
  private boolean isSameSize(Picture source)
  {
    if(source.getWidth()==this.getWidth())
    {
      if(source.getHeight() == this.getHeight())
        return true;
    }
    return false;
  }//end isSameSize
  
  //LAB 10 PART B
  private void copyPixel(Picture srcPic, int srcX, int srcY, Picture dstPic, int dstX, int dstY)
  {
    Pixel srcPixel= null;
    Pixel dstPixel = null;
    
    
    srcPixel = srcPic.getPixel((int) srcX,(int) srcY);
    dstPixel = dstPic.getPixel((int) dstX,(int) dstY);
    dstPixel.setColor(srcPixel.getColor());
  }
  
  //LAB 10 PART B
  public void copyPixel(Picture srcPic)
  {
    Pixel srcPixel= null;
    Pixel dstPixel = null;
    
    for(int x=0; x<this.getWidth();x++)
    {
      for(int y=0;y<this.getHeight();y++)
      {
        srcPixel = srcPic.getPixel(x,y);
        int red = srcPixel.getRed();
        int green = srcPixel.getGreen();
        int blue = srcPixel.getBlue();
        dstPixel = this.getPixel(x,y);
        Color color = new Color(red,green,blue);
        dstPixel.setColor(color);
      }
    }
  }
  
  //LAB 10 PART B
  public void simpleCopyFromSource(Picture source)
  {
    //check that both are same size
    if (!this.isSameSize(source))
    {
      System.out.println("Error! the source and target images are not the same size");
      return;
    }
    //iterate through the rows and columns in source copying each pixel to the target
    for(int x=0; x<this.getWidth();x++)
    {
      for(int y=0; y<this.getHeight();y++)
        copyPixel(source,x,y,this,x,y);
    }
  }
  
  //LAB 10 PART C
  public void addPic(Picture newPic, int xPos, int yPos)
  {
    if(newPic.getWidth() > this.getWidth() || newPic.getHeight() > this.getHeight()){
      System.out.println("Error! The passed in picture is larger than this picture");
      return;
    }
    
    int newWidth = newPic.getWidth();
    int newHeight = newPic.getHeight();
    
    //iterate through each column and row
    for(int x = 0; x< newWidth; x++){
      for(int y = 0; y < newHeight; y++){
        if( ((x + xPos) < getWidth()) && ((y + yPos) < getHeight())){
          //TODO: call our private copyPixel method
          this.copyPixel(newPic, x, y, this, x+xPos,y+yPos);
        }
      }
    }
  }
  
  //LAB 10 PART D
  public void crop(int xPos, int yPos, int width, int height){
    if(xPos>this.getWidth() || yPos>this.getHeight())
    {
      System.out.println("Picture out of bounds retry");
      return;
    }
    for(int x = 0; x<this.getWidth();x++)
      for(int y = 0; y<this.getHeight();y++)
    {
      if(x >= xPos && x <=xPos+width && y>=yPos && y <=yPos+height){
        
      }
      else
      {
        Pixel whitePixel = this.getPixel(x,y);
        whitePixel.setColor(Color.white);
      }
    }
  }
  
  //LAB 10 PART E
  public void crop(int xPos, int yPos, int width, int height, Picture sourcePic){
    if(xPos>width || yPos>height)
    {
      System.out.println("Picture out of bounds retry");
      return;
    }
    
    
    Picture pic = new Picture(width,height);
    int xc =0;
    int yc =0;
    for(int x = xPos; x<width;x++){
      for(int y = yPos; y<height;y++)
      {
        if(x+xPos<getWidth() && y + yPos<getHeight())
          copyPixel(sourcePic,x,y,pic,x-xPos,y-yPos);
      }
    }
  }
  
  //ASSIGNMENT 3 PART 1 METHODS
  //METHOD 1, PART 1
  //TINT PICTURE RED 
  public void tintRed()
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
      value = pixel.getRed();
      
      //set the red value to be 150% original
      pixel.setRed((int)(value*1.5));
      
      //increment
      i++;
    }
  }
  
  //ASSIGNMENT 3 PART 1
  //METHOD 2 PART 1
  //TINT GREEN
  public void tintGreen()
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
      //get value of pixel
      value = pixel.getRed();
      //set red value to be 10% of original
      pixel.setRed((int)(value*0.1));
      //increment index
      i++; 
    }
  }
  
  //ASSIGNMENT 3 PART 1
  //METHOD 3 PART 1
  //TINT BLUE
  public void tintBlue()
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
      
      //set green value to be 50% of original
      pixel.setGreen((int)(value*0.5));
      
      //increment the index
      i++;
    }
  }
  
  //ASSIGNMENT 3 PART 3
  //BLUR METHOD
  
  // TODO: copy this method into your Picture.java file and work on it there.
  public void averagePixelsHorizontally() 
  {    
// To get you started, these are the local variables you will need for this method    
    Pixel[] pixelArray = this.getPixels();   
    Pixel this_pixel = null;    
    Pixel prev_pixel = null;   
    Pixel next_pixel = null;    
    int index = 0;    
    int red;   
    int green;  
    int blue;   
    
    
    while (index < pixelArray.length) 
    {     
      if (index == 0) 
      {        
// special case, first pixel, no prev_pixel to average       
        System.out.println("special case, first pixel");       
        //TODO: put code here to average first pixel (index) with second pixel (index + 1) 
        
        //ASSIGN PIXELS
        this_pixel = pixelArray[index];
        next_pixel = pixelArray[index+1];
        
        //AVERAGE RED PIXELS
        red = (this_pixel.getRed() + next_pixel.getRed())/2;
        this_pixel.setRed(red);
        
        //AVERAGE GREEN PIXELS
        green = (this_pixel.getGreen() + next_pixel.getGreen())/2;
        this_pixel.setGreen(green);
        
        //AVERAGE BLUE PIXELS
        blue = (this_pixel.getBlue() + next_pixel.getBlue())/2;
        this_pixel.setBlue(blue);
      } 
      else if (index == pixelArray.length - 1) 
      {        
// special case, last pixel, no next_pixel to average       
        System.out.println("special case, last pixel");       
// TODO: put code here to average last pixel (index) with second-last pixel (index – 1)  
        
        //ASSIGN PIXELS
        prev_pixel = pixelArray[index - 1];
        this_pixel = pixelArray[index];
        
        //AVERAGE RED PIXELS
        red = (prev_pixel.getRed() + this_pixel.getRed())/2;
        this_pixel.setRed(red);
        
        //AVERAGE GREEN PIXELS
        green = (prev_pixel.getGreen() + this_pixel.getGreen())/2;
        this_pixel.setGreen(green);
        
        //AVERAGE BLUE PIXELS
        blue = (prev_pixel.getBlue() + this_pixel.getBlue())/2;
        this_pixel.setBlue(blue);
      } 
      else 
      {       
        // standard case
        prev_pixel = pixelArray[index - 1];       
        this_pixel = pixelArray[index];        
        next_pixel = pixelArray[index + 1];    
        
        // red pixel averaging        
        red = (prev_pixel.getRed() + this_pixel.getRed() + next_pixel.getRed())/3;        
        this_pixel.setRed(red);    
        
        // green pixel averaging        
        green = (prev_pixel.getGreen() + this_pixel.getGreen() + next_pixel.getGreen())/3;       
        this_pixel.setGreen(green);   
        
        // blue pixel averaging        
        blue = (prev_pixel.getBlue() + this_pixel.getBlue() + next_pixel.getBlue())/3;      
        this_pixel.setBlue(blue);     
        
      } 
// end else     
      index++;    
    } 
// end while 
  }
// end method
  
//PROGRAM 33 FROM TEXTBOOK
//COLOR REPLACEMENT: BROWN TO RED
  public void turnBrownIntoRed()
  {
    Color brown = new Color(42,25,15);
    Pixel[] pixels = this.getPixels();
    Pixel pixel = null;
    
    //LOOP THRU THE PIXELS
    for (int i=0; i<pixels.length; i++)
    {
      //GET CURRENT PIXEL
      pixel = pixels[i];
      
      //CHECK IF DISTANCE TO BROWN AND IF SO, DOUBLE THE RED
      if (pixel.colorDistance(brown) < 50.0)
      {
        pixel.setColor(new Color((int)(pixel.getRed()*2.0),
                                 pixel.getGreen(),
                                 pixel.getBlue()));
      }
    }
  }
  
  //PROGRAM 34 FROM TEXTBOOK
  //COLOR REPLACEMENT IN RECTANGULAR AREA
  
  public void turnBrownIntoRedInRectangle()
  {
    Color brown = new Color(42,25,15);
    Pixel pixel = null;
    
    //LOOP THRU X VALUES
    for (int x = 63; x < 125; x++)
    {
      //LOOP THRU Y VALUES
      for (int y=6; y < 76; y++)
      {
        //GET CURRENT PIXEL
        pixel = this.getPixel(x,y);
        
        //CHECK IF IN DIST TO BROWN AND IF SO, DOUBLE THE RED
        if (pixel.colorDistance(brown) < 50.0)
          
          pixel.setColor(new Color((int)(pixel.getRed() * 2.0),
                                   pixel.getGreen(),
                                   pixel.getBlue()));
        
        
      }
    }
  }
  
  //PROGRAM 35 FROM TEXTBOOK
  //COLOR REPLACEMENT WITH PASSING IN THE RANGE
  //method to turn brown to red in a rectangular area specified
  
  public void turnBrownToRedInRectangle(int startX, int endX,
                                        int startY, int endY,
                                        double distance)
  {
    Color brown = new Color(42,25,15);
    Pixel pixel = null;
    
    //LOOP THRU X VALUES
    for (int x = startX; x < endX; x++)
    {
      //loop thru y values
      for (int y=startY; y<endY; y++)
      {
        //get current pixel
        pixel = this.getPixel(x,y);
        
        //check if in distance to brown is less than
        //the passed distance and if so, double the red
        if (pixel.colorDistance(brown) < distance)
          pixel.setColor(new Color((int)(pixel.getRed() * 2.0),
                                   pixel.getGreen(),
                                   pixel.getBlue()));
      }
    }
  }
  
  //PROGRAM 36 FROM TEXTBOOK
  //REMOVE RED EYE
  
  public void removeRedEye (int startX, int startY, int endX,
                            int endY, Color newColor)
  {
    Pixel pixel = null;
    
    //LOOP THRU PIXELS IN RECTANGE DEFINED BY THE STARTX,STARTY,ENDX AND ENDY
    for (int x=startX; x < endX; x++)
    {
      for (int y=startY; y <endY; y++)
      {
        //get current pixel
        pixel = getPixel(x,y);
        
        //if the color is near red then change it
        if (pixel.colorDistance(Color.red) < 167)
          pixel.setColor(newColor);
      }
    }
  }
  
  //PROGRAM 37 FROM TEXTBOOK
  //EDGE DETECTION
  
  public void edgeDetection(double amount)
  {
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    double topAverage = 0.0;
    double bottomAverage = 0.0;
    int endY = this.getHeight() - 1;
    
    //LOOP THRU Y VALUES FROM 0 TO HEIGHT-1
    for (int y=0; y < endY; y++)
    {
      //LOOP THRU X VALUES FROM 0 TO WIDTH
      for (int x =0; x < this.getWidth(); x++)
      {
        //get top and bottom pixels
        topPixel=this.getPixel(x,y);
        bottomPixel=this.getPixel(x, y+1);
        
        //get the color averages for the 2 pixels
        topAverage=topPixel.getAverage();
        bottomAverage=bottomPixel.getAverage();
        
        //check if the absolute value of the difference is less than the amount
        if (Math.abs(topAverage - bottomAverage) < amount)
        {
          topPixel.setColor(Color.WHITE);
        }
        else
        {
          topPixel.setColor(Color.BLACK);
        }
      }
    }
  }
  
  //PROGRAM 39 FROM THE TEXTBOOK
  //POSTERIZE A PICTURE (reduce # of colors)
  
  public void posterize()
  {
    Pixel pixel = null;
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    
    //LOOP THRU THE PIXELS
    for (int x = 0; x < this.getWidth(); x++)
    {
      for (int y=0; y < this.getHeight(); y++)
      {
        //get current pixel and colors
        pixel=this.getPixel(x,y);
        redValue=pixel.getRed();
        greenValue=pixel.getGreen();
        blueValue=pixel.getBlue();
        
        //CHECK FOR RED RANGE AND CHANGE COLOR
        if (redValue < 64)
          redValue = 31;
        else if (redValue < 128)
          redValue=95;
        else if (redValue < 192)
          redValue=159;
        else 
          redValue=223;
        
        //check for green range
        if (greenValue < 64)
          greenValue = 31;
        else if (greenValue < 128)
          greenValue=95;
        else if (greenValue < 192)
          greenValue=159;
        else 
          greenValue=223;
        
        //check for blue range
        if (blueValue < 64)
          blueValue = 31;
        else if (blueValue < 128)
          blueValue=95;
        else if (blueValue < 192)
          blueValue=159;
        else 
          blueValue=223;
        
        //SET THE COLORS
        pixel.setRed(redValue);
        pixel.setGreen(greenValue);
        pixel.setBlue(blueValue); 
      }
    }
  }
  
  
  
  //LAB 11 PART B
  
  public void blurPixel(int x, int y, int size) {
    // blurs the passed in (x,y) pixel by averaging the colors of the surrounding
    // pixels size is how far out to go, so if size is 2, we will blur based on two
    // columns to the left, two to the right, two rows above and two below, in a
    // square
    
    Pixel tempPixel = null;
    Pixel pixel = null; 
    
    int sumR = 0;
    int sumG = 0;
    int sumB = 0;
    int divisor = 0;
    
    // iterate over the size x size pixels in this area to add up the RGBs
    for (int subx = x-size; subx < x+size + 1; subx++) {
      for (int suby = y-size; suby < y+size + 1; suby++) {
        // check if this pixel is in the range of this image
        if (subx < this.getWidth() && suby < this.getHeight() && (subx >= 0)  && (suby >=0) ){
          //System.out.println("Blurring now");
          // in range, so get this pixel, add it's colors to running average
          tempPixel = this.getPixel(subx, suby);
          sumR += tempPixel.getRed();
          sumG += tempPixel.getGreen();
          sumB += tempPixel.getBlue();
          // incease divisor
          divisor += 1;
        }
      }
    }
    // done adding up all the colors from surrounding pixels so
    // get this pixel and then set it's color to the average RGBs
    // making sure to divide by the divisor (num colors added in)
    pixel = this.getPixel(x,y);
    pixel.setRed((int)(sumR/divisor));
    pixel.setGreen((int)(sumG/divisor));
    pixel.setBlue((int)(sumB/divisor));
  }
  
  //11partb 
  //blur area
  
  public void blurArea(int startX, int startY, int endX, int endY, int level)
  {
    if (startX > this.getWidth() || endX > this.getWidth())
    {
      System.out.println("X value out of range");
      return;
    }
    else if(startY > this.getHeight() || endY > this.getHeight())
    {
      System.out.println("Y value out of range");
      return; 
    }
    
    
    
    Pixel pixel = null;
    // loop through the x values
    for (int x=0; x < this.getWidth(); x++)
    {
      for (int y=0; y < this.getHeight(); y++)
      {
        // get the current pixel
        pixel = this.getPixel(x,y);
        if (x > startX && x < endX){
          if (y > startY && y<endY){
            this.blurPixel(x,y,level);
          }
        }
      }
    }
  }
  
  //LAB 11 PART C
  //COLORFUL EDGE DETECTION
  
  public void colorfulEdgeDetection(double amount, double threshold) {
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    double topAverage = 0.0;
    double bottomAverage = 0.0;
    int endY = this.getHeight() - 1;
    /* loop through y values from 0 to height - 1
     * (since compare to below pixel) */
    for (int y = 0; y < endY; y++) {
      // loop through the x values from 0 to width
      for (int x = 0; x < this.getWidth(); x++) {
        // get the top and bottom pixels
        topPixel = this.getPixel(x,y);
        bottomPixel = this.getPixel(x,y+1);
        // get the color averages for the two pixels
        topAverage = topPixel.getAverage();
        bottomAverage = bottomPixel.getAverage();
        /* check if the absolute value of the difference
         * is less than the amount */
        if(topAverage>threshold)
        {
          if (Math.abs(topAverage - bottomAverage) < amount) {
            topPixel.setColor(Color.WHITE);
          } 
          else
          {
            
          }
        }
      }
    }
  }
  
  public void colorfulEdgeDetection(double amount, double threshold, Picture hidden) {
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    double topAverage = 0.0;
    double bottomAverage = 0.0;
    int endY = this.getHeight() - 1;
    /* loop through y values from 0 to height - 1
     * (since compare to below pixel) */
    for (int y = 0; y < endY; y++) {
      // loop through the x values from 0 to width
      for (int x = 0; x < this.getWidth(); x++) {
        // get the top and bottom pixels
        topPixel = hidden.getPixel(x,y);
        Pixel topPixel2 = this.getPixel(x,y);
        bottomPixel = hidden.getPixel(x,y+1);
        // get the color averages for the two pixels
        topAverage = topPixel.getAverage();
        bottomAverage = bottomPixel.getAverage();
        /* check if the absolute value of the difference
         * is less than the amount */
        if(topAverage>threshold)
        {
          if (Math.abs(topAverage - bottomAverage) < amount) {
            topPixel2.setColor(Color.WHITE);
          } 
          else
          {
            
          }
        }
      }
    }
  }
  
  //PROGRAM 40 FROM TEXTBOOK
  //POSTERIZE BY LEVELS VIA PARAMATER
  
  public void posterize(int numLevels)
  {
    Pixel pixel = null;
    int redValue=0;
    int greenValue=0;
    int blueValue=0;
    int increment = (int) (256.0 / numLevels);
    int bottomValue, topValue, middleValue = 0;
    
    //LOOP THRU PIXELS
    for (int x = 0; x < this.getWidth(); x++)
    {
      for (int y=0; y < this.getHeight(); y++)
      {
        //GET CURRENT PIXELS AND COLORS
        pixel = this.getPixel(x,y);
        redValue = pixel.getRed();
        greenValue = pixel.getGreen();
        blueValue = pixel.getBlue();
        
        //LOOP THRU NUMBER OF LEVELS
        for (int i=0; i < numLevels; i++)
        {
          //compute the bottom, top, middle values
          bottomValue = i * increment;
          topValue = (i+1) * increment;
          middleValue = (int) ((bottomValue + topValue - 1) / 2.0);
          
          //CHECK IF CURRENT VALUES ARE IN CURRENT RANGE AND IF SO SET TO MIDDLE VALUE
          if (bottomValue <= redValue &&
              redValue < topValue)
            pixel.setRed(middleValue);
          if (bottomValue <= greenValue &&
              greenValue < topValue)
            pixel.setGreen(middleValue);
          if(bottomValue <= blueValue &&
             blueValue < topValue)
            pixel.setBlue(middleValue);
          
        }
      }
    }
  }
  
  //PROGRAM 41 FROM TEXTBOOK
  //HIGHLIGHT EXTREMES
  
  public void highlightLightAndDark(double amount, Color replacementColor)
  {
    Pixel pixel = null;
    
    //loop thru all pixels in x & y direction
    for (int x=0; x<getWidth(); x++)
    {
      for (int y=0; y<getHeight();y++)
      {
        //get current pixel
        pixel = getPixel(x,y);
        
        //if distance from white or black is less than passed amount, use replace color
        if(pixel.colorDistance(Color.white) < amount ||
           pixel.colorDistance(Color.black) < amount)
        {
          pixel.setColor(replacementColor);
        }
      }
    }
  }
  
  //PROGRAM 42 FROM TEXTBOOK
  //SIMPLE BLUR
  
  public void blur(int numPixels)
  {
    Pixel pixel = null;
    Pixel samplePixel = null;
    int redValue=0;
    int greenValue=0;
    int blueValue=0;
    int count = 0;
    
    //loop thru pixels
    for (int x=0; x<getWidth(); x++)
    {
      for (int y=0; y<getHeight();y++)
      {
        //get current pixel
        pixel=this.getPixel(x,y);
        
        //reset count and rgb values
        count =0;
        redValue = greenValue = blueValue = 0;
        
        //loop thru pixel numPixels before x to numPixels after x
        for (int xSample = x - numPixels;
             xSample <= x + numPixels;
             xSample++)
        {
          for (int ySample = y -numPixels;
               ySample <= y + numPixels;
               ySample++)
          {
            //check that were in range of acceptable pixels
            if (xSample >= 0 && xSample < this.getWidth() &&
                ySample >= 0 && ySample < this.getHeight())
            {
              samplePixel = this.getPixel(xSample,ySample);
              redValue = redValue + samplePixel.getRed();
              greenValue = greenValue + samplePixel.getGreen();
              blueValue = blueValue + samplePixel.getBlue();
              count = count + 1;
            }
          }
        }
        //use average color of surrounding pixels
        Color newColor = new Color(redValue / count,
                                   greenValue / count,
                                   blueValue / count);
        pixel.setColor(newColor);
      }
    }
    
  }
  
  //PROGRAM 43 FROM TEXTBOOK
  //SUBTRACT BACKGROUND, REPLACE WITH NEW ONE
  
  public void swapBackground(Picture oldBackground, Picture newBackground)
  {
    Pixel currPixel=null;
    Pixel oldPixel=null;
    Pixel newPixel=null;
    
    //loop thru columns/rows
    for (int x=0; x<getWidth(); x++)
    {
      for (int y=0; y<getHeight();y++)
      {
        //get current pixel and old background pixel
        currPixel=this.getPixel(x,y);
        oldPixel=oldBackground.getPixel(x,y);
        
        //if distance btwn currpixel color and old background pixel color is less than the 15 then swap in new pixel
        if(currPixel.colorDistance(oldPixel.getColor()) < 15.0)
        {
          newPixel=newBackground.getPixel(x,y);
          currPixel.setColor(newPixel.getColor());
        }
      }
    }
  }
  
  //PROGRAM 44 FROM TEXTBOOK
  //BETTER SWAP BACKGROUND
  
  public void swapBackground(Picture oldBackground,
                             Picture newBackground,
                             double threshold)
  {
    Pixel currPixel=null;
    Pixel oldPixel=null;
    Pixel newPixel=null;
    
    //loop thru columns/rows
    for (int x=0; x<getWidth(); x++)
    {
      for (int y=0; y<getHeight();y++)
      {
        //get current pixel and old background pixel
        currPixel=this.getPixel(x,y);
        oldPixel=oldBackground.getPixel(x,y);
        
        //if distance btwn currpixel color and old background pixel color is less than the threshold then swap in new pixel
        if(currPixel.colorDistance(oldPixel.getColor()) < threshold)
        {
          newPixel=newBackground.getPixel(x,y);
          currPixel.setColor(newPixel.getColor());
        }
      }
    }
  }
  
  //PROGRAM 45 FROM TEXTBOOK
  //CHROMAKEY: REPLACE ALL BLUE WITH NEW BACKGROUND
  
  public void chromakey(Picture newBg)
  {
    Pixel currPixel=null;
    Pixel newPixel=null;
    
    //loop thru columns/rows
    for (int x=0; x<getWidth(); x++)
    {
      for (int y=0; y<getHeight();y++)
      {
        currPixel=this.getPixel(x,y);
        
        //if the color at currPixel is mostly blue ( > than R/G combined), then use new background color
        if(currPixel.getRed() + currPixel.getGreen() < currPixel.getBlue())
        {
          newPixel = newBg.getPixel(x,y);
          currPixel.setColor(newPixel.getColor());
        }
      }
    }
  }
  
  //PROGRAM 46 FROM TEXTBOOK
  //SHORTER CHROMAKEY
  
  public void chromakeyBlue(Picture newBg)
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel currPixel=null;
    Pixel newPixel=null;
    
    //loop thru pixels
    for (int i=0; i < pixelArray.length; i++)
    {
      //get current pixel
      currPixel = pixelArray[i];
      
      //if the color at currPixel is mostly blue ( > than R/G combined), then use new background color
      if(currPixel.getRed() + currPixel.getGreen() < currPixel.getBlue())
      {
        newPixel = newBg.getPixel(currPixel.getX(), currPixel.getY());
        currPixel.setColor(newPixel.getColor());
      }
      
    }
  }
  
  //ASSIGNMENT 4 PART 1
  //SHRINK METHOD
  public Picture shrink (int factor)
  {
    //create new pic and add 1 pixel to width/height
    //divide width/height by factor to ensure picture size is correct
    Picture pic = new Picture((this.getWidth()/factor)+1, 
                              (this.getHeight()/factor)+1); 
    Pixel srcPixel = null;
    Pixel dstPixel = null;
    
    //precondition factor range check
    if (factor < 2 || factor > 4)
    {
      System.out.println("Error!  The parameter (factor) must be between 2 and 4.");
      return this;
      
    }
    
    //loop through all rows and columns
    //skip x and y values based on factor passed in
    for (int srcX=0, dstX =0;
         srcX < this.getWidth();
         srcX += factor, dstX++)
    {
      for (int srcY=0, dstY=0;
           srcY < this.getHeight();
           srcY += factor, dstY++)
      {
          //set dst pixels to source pixels
        srcPixel = this.getPixel(srcX, srcY);
        dstPixel = pic.getPixel(dstX, dstY);
        dstPixel.setColor(srcPixel.getColor());   
      }
    }
    //return new pic object
    return pic;
  }
  
  //ASSIGNMENT 4 PART 2
  //REVEAL METHOD
  public void reveal (Picture underPic, double division_height)
  {
    Pixel srcPixel = null;
    Pixel dstPixel = null;
    
    //precondition to check that both images are the same size
    //using lab 10 part A method
    if (!isSameSize(underPic))
    {
      System.out.println("Error! The two pictures you chose are not the same size.");
      return;
    }
    
    //precondition to ensure passed in division_height is between 0.0 and 1.0
    if (division_height < 0.0 || division_height > 1.0)
    {
      System.out.println("Error! Your second parameter (division_height) must be between 0.0 and 1.0");
      return;
    }
    
    //divider line variable 
    int divider = (int)(this.getHeight()*division_height);
    
    //loop through columns
    for (int srcX=0, dstX =0;
         srcX < this.getWidth();
         srcX++, dstX++)
    {
      //loop through rows
      for (int srcY=0, dstY=0;
           srcY < this.getHeight();
           srcY++, dstY++)
      {
        //set divider location
        if(srcY < divider)
        {
          //get pixel at x and y location, add 3 for divider size
          dstPixel = getPixel(dstX, (dstY + 3));
          //change divider color to black
          dstPixel.setColor(Color.black);
          
          //set dst pixels to src pixels
          srcPixel = underPic.getPixel(srcX, srcY);
          dstPixel = this.getPixel(dstX, dstY);
          dstPixel.setColor(srcPixel.getColor());
        }  
      }
    }
  }
  
  //ASSIGNMENT 4 PART 3
  //CHECKERBOARD METHOD
  public void checkerboard (int width, Color c)
  {
    Pixel pixel = null; 
    
    //precondition to ensure passed in width is less than half of width of picture object
    if (width > (this.getWidth()/2))
    {
      System.out.println("Error! Your width parameter is too large! \nWidth parameter must be less than half the width of the picture.");
      return;
    }
    
    //loop through all columns and rows
    for (int x=0; x < this.getWidth(); x++)
    {
      for (int y=0; y < this.getHeight(); y++)
      {
        //place checker every other width, for all ODD and EVEN columns/rows
        if (((x/width)%2==1 && (y/width)%2==1) || ((x/width)%2==0 && (y/width)%2==0))
        {
          //get pixel at x and y location
          pixel = getPixel(x,y);
          //set pixel color to passed in parameter
          pixel.setColor(c);
        }
      }
    }
  }
  
  //ASSIGNMENT 4 PART 4
  //ALPHA CHECKERBOARD
  public void checkerboard (int width, int alpha)
  {
    Pixel pixel = null;
    
    //precondition to ensure passed in width is less than half the width of picture object
    if (width > (this.getWidth()/2))
    {
      System.out.println("Error! Your width parameter is too large! \nWidth parameter must be less than half the width of the picture.");
      return;
    }
    
    //precondition to ensure alpha parameter is between 0 and 255
    if (alpha < 0 || alpha > 255)
    {
      System.out.println("Error! Your second parameter (alpha) must be set between 0 and 255.");
      return;
    }
    
    //loop through all columns/rows
    for (int x=0; x < this.getWidth(); x++)
    {
      for (int y=0; y < this.getHeight(); y++)
      {
        //place checker every other width, for all ODD and EVEN columns/rows
        if (((x/width)%2==1 && (y/width)%2==1) || ((x/width)%2==0 && (y/width)%2==0))
        {
          //get pixel at x and y location
          pixel = getPixel(x,y);
          //set pixel alpha to passed in parameter
          pixel.setAlpha(alpha);
        }
      }
    }
  }
    
  //ASSIGNMENT 4 PART 5 
  //DUAL PICTURE CHECKERBOARD
  public void checkerboard (int width, Picture pic)
  {
    //precondition to ensure both images are same size
    //using Lab10PartA method
    if (!isSameSize(pic))
    {
      System.out.println("Error!  The two pictures you have chosen are not the same size.");
      return;
    }
    
    //precondition to ensure passed in width is less than half the width of the picture object
    if (width > (this.getWidth()/2))
    {
      System.out.println("Error! Your width parameter is too large! \nWidth parameter must be less than half the width of the picture.");
      return;
    }
    
    //loop through columns
    for (int srcX=0, dstX=0;
         srcX < this.getWidth();
         srcX++, dstX++)
    {
      //loop through rows
      for (int srcY=0, dstY=0;
           srcY < this.getHeight();
           srcY++, dstY++)
      {
        //place checker every other width, for all ODD and EVEN columns/rows
        if (((dstX/width)%2==1 && (dstY/width)%2==1) || ((dstX/width)%2==0 && (dstY/width)%2==0))
        {
          //set dst pixels to src pixels using copyPixel method (Lab10PartB)
          copyPixel(pic, srcX, srcY, this, dstX, dstY);
        }
      }
    }
  }
  
  
  
  }// this } is the end of class Picture, put all new methods before this








