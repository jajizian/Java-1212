import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import java.awt.Color;

public class FaceCaptions
{
  
  public static void main(String[] args)
  {
    //appendix 1 code for assignment 2
    String filename;   
    if (args.length > 0) 
    {       
// got a filename passed into program as a runtime parameter
      filename = args[0];             
      System.out.println("Filename passed in: " + filename);  
    }  
    else 
    {       
// ask user for a picture     
      filename = FileChooser.pickAFile();    
      System.out.println("User picked file: " + filename);   
    }  
// use the filename to create the picture object   
    Picture pic = new Picture(filename);
    Turtle tom = new Turtle(pic);
    
//have turtle draw thick red box around face
    //pen up, bring turtle to starting position(bottom right)
    tom.penUp();
    tom.moveTo(142,426); 
    //set a thick pen width, change pen color to red
    tom.setPenWidth(8);
    tom.setPenColor(Color.red);
    //place pen down, draw outline starting from bottom left and going clockwise
    tom.penDown();
    tom.turn(315);
    tom.forward(60);
    tom.turn(10);
    tom.forward(20);
    tom.turn(7);
    tom.forward(15);
    tom.turn(5);
    tom.forward(20);
    tom.turn(10);
    tom.forward(10);
    tom.turn(5);
    tom.forward(50);
    tom.turn(5);
    tom.forward(80);
    tom.turn(10);
    tom.forward(50);
    tom.turn(8);
    tom.forward(40);
    tom.turn(15);
    tom.forward(30);
    tom.turn(25);
    tom.forward(50);
    tom.turn(25);
    tom.forward(40);
    tom.turn(5);
    tom.forward(30);
    tom.turn(10);
    tom.forward(50);
    tom.turn(30);
    tom.forward(50);
    tom.turn(30);
    tom.forward(60);
    tom.turn(25);
    tom.forward(60);
    tom.turn(4);
    tom.forward(100);
    tom.turn(10);
    tom.forward(40);
    tom.turn(10);
    tom.forward(70);
    tom.turn(20);
    tom.forward(40);
    tom.turn(30);
    tom.forward(50);
    tom.turn(15);
    tom.forward(30);
    tom.turn(25);
    tom.forward(28);
    
    
    //call mustache method from turtle.java file
    tom.drawMustache(213, 324, Color.black);
    //call eyeglasses method from turtle.java file
    tom.drawEyeglasses(86, 230, Color.blue);
    
    //call draw phrase 1 method from below
    drawPhrase1(tom);
    //call draw phrase 2 method from below
    drawPhrase2(tom);
    pic.explore();    
  }
  
  //draw phrase 1 method "super"
  public static void drawPhrase1(Turtle tom)
  {
    //pen up, move to starting position
    tom.penUp();
    tom.moveTo(26,123);
    tom.turn(270);
    
    //draw word "super"
    TurtleAlphabet.drawSBoldSize(tom, Color.green, true, 1);
    TurtleAlphabet.drawUBoldSize(tom, Color.cyan, true, 1);
    TurtleAlphabet.drawPBoldSize(tom, Color.magenta, true, 1);
    TurtleAlphabet.drawEBoldSize(tom, Color.green, true, 1);
    TurtleAlphabet.drawRBoldSize(tom, Color.cyan, true, 1);
  }
  
  //draw phrase 2 method "duder"
  public static void drawPhrase2(Turtle tom)
  {
    //pen up, move turtle to starting position
    tom.penUp();
    tom.moveTo(3,470);
    
    //draw word "duder"
    //move turtle between letters to ensure the word fits right
    TurtleAlphabet.drawDBoldSize(tom, Color.green, true, 1);
    tom.moveTo(77,470);
    TurtleAlphabet.drawUBoldSize(tom, Color.magenta, true, 1);
    tom.moveTo(153,470);
    TurtleAlphabet.drawDBoldSize(tom, Color.cyan, true, 1);
    tom.moveTo(227,470);
    TurtleAlphabet.drawEBoldSize(tom, Color.green, true, 1);
    tom.moveTo(303,470);
    TurtleAlphabet.drawRBoldSize(tom, Color.cyan, true, 1);
  } 
}





