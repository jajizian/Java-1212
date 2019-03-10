import java.util.*;
import java.awt.*;
import java.awt.Color;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
    * draw on
    * @param x the starting x position
    * @param y the starting y position
    * @param picture the picture to draw on
    */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
    * display to draw it on
    * @param x the starting x position
    * @param y the starting y position
    * @param modelDisplayer the thing that displays the model
    */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
    * @param modelDisplay the thing that displays the model
    */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  
  
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }
  
  public void drawT() { 
    this.forward(100); 
    this.turnLeft(); 
    this.penUp(); 
    this.forward(40); 
    this.turn(180); 
    this.penDown(); 
    this.forward(80); 
    this.hide();
    
  }
  //MYSELF ADDING SQUARE DRAWING METHOD BELOW:
  
  public void drawSquare()
  {
    this.turnRight();
    this.forward(30);
    this.turnRight();
    this.forward(30);
    this.turnRight();
    this.forward(30);
    this.turnRight();
    this.forward(30);
  }
  
  //MYSELF ADDING ANOTHER SQUARE DRAWING METHOD WITH VARIABLE WIDTH TO CHANGE SIZE IF NEEDED:
  
  public void drawSquare2()
  {
    int width = 30;
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
  
  //MYSELF ADDING DRAWSQUARE METHOD WITH PARAMETERS:
  
  //method to draw a square with a width and height of some passed ammount
  //@param width the width and height to use
  
  public void drawSquare(int width)
  {
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
  
  
  //Assignment 1 appendix code
  //first is question mark
  
  public void drawQuestionMark(Color c) {    
    // assumes we begin facing up (North) with penUp,    
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    // first move over while pen is up   
    this.turnRight();    
    this.forward(38);    
// now put pen down, set color   
    this.setPenColor(c);    
    this.penDown();    
// draw vertical part of bottom of question mark   
    this.forward(4);    
    this.turnLeft();    
    this.forward(4);   
    this.turnLeft();   
    this.forward(4);    
    this.turnLeft();   
    this.forward(4);   
    this.turn(180);
    
    // move up a bit   
    this.penUp();   
    this.forward(10);   
    // draw stick below curve    
    this.penDown();    
    this.forward(20);     
// draw round part of question mark   
    int angle = -40;   
    int dist = 15;    
    this.turnRight();    
    this.forward(5);   
    this.turn(angle);    
    this.forward(dist); 
    this.turn(angle);  
    this.forward(dist);   
    this.turn(angle); 
    this.forward(dist);
    this.turn(angle);   
    this.forward(dist);   
    this.turn(angle);   
    this.forward(dist);
    
    // move to bottom right of letter area   
    this.penUp();  
    this.turnLeft();   
    this.forward(40); 
    this.turn(20); 
    this.forward(30);    
// move to next letter position`   
    this.turnLeft();   
    this.forward(35);   
    this.turnLeft();    
  } // end of question mark method
  
  
  //exclamation point method
  public void drawExclamationMark(Color c) {   
    // assumes we begin facing up (North) with penUp,    
    // and that we are at the bottom-left of where the letter is supposed to appear   
    // first move over while pen is up   
    this.turnRight();   
    this.forward(38);  
    
    // now put pen down, set color   
    
    this.setPenColor(c);    
    this.penDown();  
    
    // draw bottom of exclamation mark   
    this.forward(4);   
    this.turnLeft();   
    this.forward(4);    
    this.turnLeft();  
    this.forward(4);   
    this.turnLeft();  
    this.forward(4);  
    this.turn(180);   
    
    // move up a bit   
    this.penUp();    
    this.forward(10);    
    
// move right a bit  
    this.turnRight();
    this.forward(2);    
    this.turnLeft();    
    
// draw top of exclamation mrk  
    this.penDown();   
    this.forward(65);    
    
    // move to bottom right of letter area    
    this.penUp();  
    this.turn(180);   
    this.forward(75); 
    this.turnLeft();    
    this.forward(25);  
    
    // move to next letter position` 
    this.turnLeft();   
    this.forward(35);   
    this.turnLeft();   
  }
  // end of exclamation mark method
  
  
  //ASSIGNMENT 1 PART 1
  //FIRST LETTER METHOD: A
  public void drawA(Color c)
  {
    //MAINTAINING PEN WIDTH FOR SIMPLE DRAW METHOD
    this.setPenWidth(1);
    
    //PLACE INPUT FROM USER TO ASK STARTING LOCATION OF LETTER?
    
    //turtle facing north with pen up
    //turn while pen is up
    this.turn(30);
    
    //set pen color, place pen down, and begin drawing open face triangle of the A
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    this.turn(120);
    this.forward(50);
    
    //pen up to not retrace line
    this.penUp();
    
    //move turtle to middle-right of A framework, place pen down
    this.turn(180);
    this.forward(22);
    this.turn(300);
    this.penDown();
    
    //close off letter A with middle line
    this.forward(25);
    
    //bring pen up and hide turtle at the end
    this.penUp();
    this.hide();
    
    //move turtle to next starting position, make it face north
    this.turn(180);
    this.forward(43);
    this.turn(90);
    this.forward(18);
    this.turn(180);
    
  }
  
  //SECOND LETTER METHOD: J
  public void drawJ(Color c)
  {
    //MAINTAINING PEN WIDTH FOR SIMPLE DRAW METHOD
    this.setPenWidth(1);
    
    //turtle facing north with pen up
    //turn turtle to face horizontal
    this.turn(90);
    
    //set pen color, place pen down, start horizontal bottom line
    this.penDown();
    this.setPenColor(c);
    this.forward(30);
    
    //turn to face north
    this.turn(270);
    
    //begin drawing up
    this.forward(43);
    
    //draw left upper J line
    this.turn(270);
    this.forward(25);
    
    //pen up and retrace
    this.penUp();
    this.turn(180);
    this.forward(25);
    
    //pen down and finish upper right J line
    this.penDown();
    this.forward(23);
    
    //pen up, move to next starting position, turn to face north, hide turtle
    this.penUp();
    this.forward(4);
    this.turn(90);
    this.forward(43);
    this.turn(180);
    this.hide();
  }
  
  //THIRD LETTER METHOD: I
  public void drawI(Color c)
  {
    //MAINTAINING PEN WIDTH FOR SIMPLE DRAW METHOD
    this.setPenWidth(1);
    
    //facing north with pen up, turn horizontal for bottom of I
    this.turn(90);
    
    //set pen color, place pen down, begin bottom line
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    
    //pen up, retrace to middle of bottom line
    this.penUp();
    this.turn(180);
    this.forward(25);
    
    //pen down, turn to face north, begin line up for middle of I
    this.penDown();
    this.turn(90);
    this.forward(43);
    
    //draw first branch of upper I
    this.turn(270);
    this.forward(25);
    
    //pen up, turn and retrace to middle of I
    this.penUp();
    this.turn(180);
    this.forward(25);
    
    //pen down, finish top of I
    this.penDown();
    this.forward(25);
    
    //pen up, move to next starting position, hide turtle
    this.penUp();
    this.forward(3);
    this.turn(90);
    this.forward(43);
    this.turn(180);
    this.hide();
  }
  
  //FOURTH LETTER METHOD: Z
  public void drawZ(Color c)
  {
    //MAINTAINING PEN WIDTH FOR SIMPLE DRAW METHOD
    this.setPenWidth(1);
    
    //facing north, pen up, turn horizontal for bottom of Z
    this.turn(90);
    
    //set pen color, place it down, begin bottom line
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    
    //pen up, turn and retrace to start of bottom line
    this.penUp();
    this.turn(180);
    this.forward(50);
    
    //pen down, turn line angle, draw line up for middle of Z
    this.penDown();
    this.turn(135);
    this.forward(62);
    
    //turn turtle, complete top of Z
    this.turn(225);
    this.forward(43);
    
    //pen up, bring turtle to bottom right (facing north) of Z for next letter, hide turtle
    this.penUp();
    this.turn(180);
    this.forward(53);
    this.turn(90);
    this.forward(43);
    this.turn(180);
    this.hide();
  }
  //END OF ASSIGNMENT 1 PART 1
  //EXTRA METHOD FOR FULL LAST NAME
  //LETTER METHOD N:
  public void drawN(Color c)
  {
    //MAINTAINING PEN WIDTH FOR SIMPLE DRAW METHOD
    this.setPenWidth(1);
    
    //facing north, pen up
    //set pen color, place it down, begin left line going up
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    
    //turn line angle, draw line up for middle of N
    
    this.turn(135);
    this.forward(70);
    
    //turn turtle north, complete right side of N
    this.turn(225);
    this.forward(50);
    
    //pen up, bring turtle to bottom right (facing north) of N for next letter, hide turtle
    this.penUp();
    this.turn(180);
    this.forward(50);
    this.turn(270);
    this.forward(5);
    this.turn(270);
    this.hide(); 
  }
  
  //ASSIGNMENT 1 PART 2
  //METHODS WITH BOLD OPTIONS
  
  //FIRST BOLD LETTER METHOD: A
  public void drawABold(Color c, boolean bold)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    
    //turtle facing north with pen up
    //turn while pen is up
    this.turn(30);
    
    //set pen color, place pen down, and begin drawing open face triangle of the A
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    this.turn(120);
    this.forward(50);
    
    //pen up to not retrace line
    this.penUp();
    
    //move turtle to middle-right of A framework, place pen down
    this.turn(180);
    this.forward(22);
    this.turn(300);
    this.penDown();
    
    //close off letter A with middle line
    this.forward(25);
    
    //bring pen up and hide turtle at the end
    this.penUp();
    this.hide();
    
    //move turtle to next starting position, make it face north
    this.turn(180);
    this.forward(43);
    this.turn(90);
    this.forward(18);
    this.turn(180);
    
  }
  
  //SECOND BOLD LETTER METHOD: J
  public void drawJBold(Color c, boolean bold)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    //turtle facing north with pen up
    //turn turtle to face horizontal
    this.turn(90);
    
    //set pen color, place pen down, start horizontal bottom line
    this.penDown();
    this.setPenColor(c);
    this.forward(30);
    
    //turn to face north
    this.turn(270);
    
    //begin drawing up
    this.forward(43);
    
    //draw left upper J line
    this.turn(270);
    this.forward(25);
    
    //pen up and retrace
    this.penUp();
    this.turn(180);
    this.forward(25);
    
    //pen down and finish upper right J line
    this.penDown();
    this.forward(23);
    
    //pen up, move to next starting position, turn to face north, hide turtle
    this.penUp();
    this.forward(4);
    this.turn(90);
    this.forward(43);
    this.turn(180);
    this.hide();
  }
  
  //THIRD BOLD LETTER METHOD: I
  public void drawIBold(Color c, boolean bold)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    //facing north with pen up, turn horizontal for bottom of I
    this.turn(90);
    
    //set pen color, place pen down, begin bottom line
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    
    //pen up, retrace to middle of bottom line
    this.penUp();
    this.turn(180);
    this.forward(25);
    
    //pen down, turn to face north, begin line up for middle of I
    this.penDown();
    this.turn(90);
    this.forward(43);
    
    //draw first branch of upper I
    this.turn(270);
    this.forward(25);
    
    //pen up, turn and retrace to middle of I
    this.penUp();
    this.turn(180);
    this.forward(25);
    
    //pen down, finish top of I
    this.penDown();
    this.forward(25);
    
    //pen up, move to next starting position, hide turtle
    this.penUp();
    this.forward(3);
    this.turn(90);
    this.forward(43);
    this.turn(180);
    this.hide();
  }
  
  //FOURTH BOLD LETTER METHOD: Z
  public void drawZBold(Color c, boolean bold)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    //facing north, pen up, turn horizontal for bottom of Z
    this.turn(90);
    
    //set pen color, place it down, begin bottom line
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    
    //pen up, turn and retrace to start of bottom line
    this.penUp();
    this.turn(180);
    this.forward(50);
    
    //pen down, turn line angle, draw line up for middle of Z
    this.penDown();
    this.turn(135);
    this.forward(62);
    
    //turn turtle, complete top of Z
    this.turn(225); 
    this.forward(43);
    
    //pen up, bring turtle to bottom right (facing north) of Z for next letter, hide turtle
    this.penUp();
    this.turn(180);
    this.forward(53);
    this.turn(90);
    this.forward(43);
    this.turn(180);
    this.hide();
  }
  //END OF ASSIGNMENT 1 PART 2 (BOLD LETTER METHODS)
  //EXTRA METHOD FOR FULL LAST NAME
  //BOLD METHOD FOR N:
  public void drawNBold(Color c, boolean bold)
  {
    //if/else to control pen width for boolean
    if (bold)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1);
    }
    
    //facing north, pen up
    //set pen color, place it down, begin left line going up
    this.setPenColor(c);
    this.penDown();
    this.forward(50);
    
    //turn line angle, draw line up for middle of N
    
    this.turn(135);
    this.forward(70);
    
    //turn turtle north, complete right side of N
    this.turn(225);
    this.forward(50);
    
    //pen up, bring turtle to bottom right (facing north) of N for next letter, hide turtle
    this.penUp();
    this.turn(180);
    this.forward(50);
    this.turn(270);
    this.forward(5);
    this.turn(270);
    this.hide(); 
  }
  
  
  
  
  //ASSIGNMENT 1 PART 3
  //LETTER METHODS WITH VARIABLE SIZING
  
  //FIRST SIZE LETTER METHOD: A
  //add *size into all forward expressions
  public void drawABoldSize(Color c, boolean bold, int size)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    
    
    //turtle facing north with pen up
    //turn while pen is up
    this.turn(30);
    
    //set pen color, place pen down, and begin drawing open face triangle of the A
    this.setPenColor(c);
    this.penDown();
    this.forward(50*size);
    this.turn(120);
    this.forward(50*size);
    
    //pen up to not retrace line
    this.penUp();
    
    //move turtle to middle-right of A framework, place pen down
    this.turn(180);
    this.forward(24*size);
    this.turn(300);
    this.penDown();
    
    //close off letter A with middle line
    this.forward(25*size);
    
    //bring pen up and hide turtle at the end
    this.penUp();
    this.hide();
    
    //move turtle to next starting position, make it face north
    this.turn(180);
    this.forward(43*size);
    this.turn(90);
    this.forward(18*size);
    this.turn(180);
    
  }
  
  //SECOND SIZE LETTER METHOD: J
  //add *size into all forward expressions
  public void drawJBoldSize(Color c, boolean bold, int size)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    //turtle facing north with pen up
    //turn turtle to face horizontal
    this.turn(90);
    
    //set pen color, place pen down, start horizontal bottom line
    this.penDown();
    this.setPenColor(c);
    this.forward(30*size);
    
    //turn to face north
    this.turn(270);
    
    //begin drawing up
    this.forward(43*size);
    
    //draw left upper J line
    this.turn(270);
    this.forward(25*size);
    
    //pen up and retrace
    this.penUp();
    this.turn(180);
    this.forward(25*size);
    
    //pen down and finish upper right J line
    this.penDown();
    this.forward(23*size);
    
    //pen up, move to next starting position, turn to face north, hide turtle
    this.penUp();
    this.forward(4*size);
    this.turn(90);
    this.forward(43*size);
    this.turn(180);
    this.hide();
  }
  
  //THIRD SIZE LETTER METHOD: I
  //add *size into all forward expressions
  public void drawIBoldSize(Color c, boolean bold, int size)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    //facing north with pen up, turn horizontal for bottom of I
    this.turn(90);
    
    //set pen color, place pen down, begin bottom line
    this.setPenColor(c);
    this.penDown();
    this.forward(50*size);
    
    //pen up, retrace to middle of bottom line
    this.penUp();
    this.turn(180);
    this.forward(25*size);
    
    //pen down, turn to face north, begin line up for middle of I
    this.penDown();
    this.turn(90);
    this.forward(43*size);
    
    //draw first branch of upper I
    this.turn(270);
    this.forward(25*size);
    
    //pen up, turn and retrace to middle of I
    this.penUp();
    this.turn(180);
    this.forward(25*size);
    
    //pen down, finish top of I
    this.penDown();
    this.forward(25*size);
    
    //pen up, move to next starting position, hide turtle
    this.penUp();
    this.forward(3*size);
    this.turn(90);
    this.forward(43*size);
    this.turn(180);
    this.hide();
  }
  
  //FOURTH SIZE LETTER METHOD: Z
  //add *size into all forward expressions
  public void drawZBoldSize(Color c, boolean bold, int size)
  {
    //if/else statement to control pen width
    if (bold)
    {
      this.setPenWidth(4);
    }
    else 
    {
      this.setPenWidth(1);
    }
    
    //facing north, pen up, turn horizontal for bottom of Z
    this.turn(90);
    
    //set pen color, place it down, begin bottom line
    this.setPenColor(c);
    this.penDown();
    this.forward(50*size);
    
    //pen up, turn and retrace to start of bottom line
    this.penUp();
    this.turn(180);
    this.forward(50*size);
    
    //pen down, turn line angle, draw line up for middle of Z
    this.penDown();
    this.turn(135);
    this.forward(62*size);
    
    //turn turtle, complete top of Z
    this.turn(225); 
    this.forward(43*size);
    
    //pen up, bring turtle to bottom right (facing north) of Z for next letter, hide turtle
    this.penUp();
    this.turn(180);
    this.forward(53*size);
    this.turn(90);
    this.forward(43*size);
    this.turn(180);
    this.hide();
  }
  //END OF ASSIGNMENT 1 PART 3
  
  //EXTRA METHOD FOR FULL LAST NAME
  //SIZABLE METHOD FOR N:
  public void drawNBoldSize(Color c, boolean bold, int size)
  {
    //if/else to control pen width for boolean
    if (bold)
    {
      this.setPenWidth(4);
    }
    else
    {
      this.setPenWidth(1);
    }
    
    //facing north, pen up
    //set pen color, place it down, begin left line going up
    this.setPenColor(c);
    this.penDown();
    this.forward(50*size);
    
    //turn line angle, draw line up for middle of N
    
    this.turn(135);
    this.forward(70*size);
    
    //turn turtle north, complete right side of N
    this.turn(225);
    this.forward(50*size);
    
    //pen up, bring turtle to bottom right (facing north) of N for next letter, hide turtle
    this.penUp();
    this.turn(180);
    this.forward(50*size);
    this.turn(270);
    this.forward(5*size);
    this.turn(270);
    this.hide(); 
  }
  
  
  
} // this } is the end of class Turtle, put all new methods before this