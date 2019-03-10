import java.awt.Color;

public class LetterCollage {  
  public static void main(String [] args)  
  {   
    //increased world size to fit full name
    World w = new World(1300,900);
    /* Create a turtle named t */    
    Turtle t = new Turtle(100, 100, w);   
    t.penUp();    
    
    t.moveTo(10, 600);    
    
    writeName(t, Color.red, true, 2);
  }
  
  //writeName method below
  public static void writeName(Turtle t, Color c, boolean bold, int size)
  {
    //collage'd A letter
    t.drawABoldSize(Color.blue, true, 1);
    t.moveTo(32,560);
    t.drawABoldSize(Color.blue, true, 1);
    t.moveTo(54,520);
    t.drawABoldSize(Color.blue, true, 1);
    t.moveTo(75,480);
    t.drawABoldSize(Color.blue, true, 1);
    t.moveTo(97,520);
    t.drawABoldSize(Color.blue, true, 1);
    t.moveTo(75,560);
    t.drawABoldSize(Color.blue, true, 1);
    t.moveTo(118,560);
    t.drawABoldSize(Color.blue, true, 1);
    t.moveTo(140,600);
    t.drawABoldSize(Color.blue, true, 1);
    
    //collage'd J letter
    t.moveTo(200,600);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(240,600);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(280,600);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(280,557);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(280,514);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(280,471);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(240,471);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(200,471);
    t.drawJBoldSize(Color.red, true, 1);
    t.moveTo(320,471);
    t.drawJBoldSize(Color.red, true, 1);
    
    //collage'd I
    t.moveTo(370,600);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(390,600);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(410,600);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(430,600);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(450,600);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(410,557);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(410,514);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(410,471);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(370,471);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(390,471);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(430,471);
    t.drawIBoldSize(Color.black, true, 1);
    t.moveTo(450,471);
    t.drawIBoldSize(Color.black, true, 1);
    
    //collage'd Z
    t.moveTo(510,600);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(540,600);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(570,600);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(600,600);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(530,555);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(560,512);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(590,471);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(565,471);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(540,471);
    t.drawZBoldSize(Color.orange, true, 1);
    t.moveTo(515,471);
    t.drawZBoldSize(Color.orange, true, 1);
    
    //collage'd I
    t.moveTo(650,600);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(670,600);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(690,600);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(710,600);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(730,600);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(690,557);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(690,514);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(730,471);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(650,471);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(670,471);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(690,471);
    t.drawIBoldSize(Color.cyan, true, 1);
    t.moveTo(710,471);
    t.drawIBoldSize(Color.cyan, true, 1);
    
    //collage'd A letter
    t.moveTo(780,600);
    t.drawABoldSize(Color.magenta, true, 1);
    t.moveTo(802,560);
    t.drawABoldSize(Color.magenta, true, 1);
    t.moveTo(824,520);
    t.drawABoldSize(Color.magenta, true, 1);
    t.moveTo(846,480);
    t.drawABoldSize(Color.magenta, true, 1);
    t.moveTo(869,520);
    t.drawABoldSize(Color.magenta, true, 1);
    t.moveTo(889,560);
    t.drawABoldSize(Color.magenta, true, 1);
    t.moveTo(847,560);
    t.drawABoldSize(Color.magenta, true, 1);
    t.moveTo(909,600);
    t.drawABoldSize(Color.magenta, true, 1);
    
    //collage'd N
    t.moveTo(970,600);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(970,560);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(970,520);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(970,480);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(1016,500);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(1065,550);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(1115,600);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(1115,560);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(1115,520);
    t.drawNBoldSize(Color.green, true, 1);
    t.moveTo(1115,480);
    t.drawNBoldSize(Color.green, true, 1);
    //end of name collage
    
    
    //clear and concise full last name
    t.moveTo(250,800);
    t.drawABoldSize(Color.blue, true, 2);
    t.drawJBoldSize(Color.red, true, 2);
    t.drawIBoldSize(Color.black, true, 2);
    t.drawZBoldSize(Color.orange, true, 2);
    t.drawIBoldSize(Color.cyan, true, 2);
    t.drawABoldSize(Color.magenta, true, 2);
    t.backward(5);
    t.drawNBoldSize(Color.green, true, 2);
    
    t.moveTo(250,250);
    t.drawABoldSize(Color.blue, true, 2);
    t.drawJBoldSize(Color.red, true, 2);
    t.drawIBoldSize(Color.black, true, 2);
    t.drawZBoldSize(Color.orange, true, 2);
    t.drawIBoldSize(Color.cyan, true, 2);
    t.drawABoldSize(Color.magenta, true, 2);
    t.backward(5);
    t.drawNBoldSize(Color.green, true, 2);
    
  }
  
}