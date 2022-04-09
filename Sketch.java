

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	drawFace(200,40);
  drawFace2(100,50, 56, 255);
  getLocation(width/2, height/2);
     
  }

 /**
  * Parameters to draw the face
  * @param x Determines the value for the x axis
  * @param y Determines the value for the y axis
  */
  private void drawFace(int x, int y){

  //face
  fill(255,255,255);
  ellipse(x, y, width/5, height/5); 

  //Left hole
  fill(0,0,0);
  ellipse(x-20,y-20, width/40, height/40);

  //Right hole
  fill(0,0,0);
  ellipse(x+20, y-20, width/40, height/40); 
  
  stroke(0,0,0);
  line(x-20,y+10,x+20,y+15);

  }
  /**
   * Parameters for the second face
   * @param x2 Determines the value for the x axis of the second face
   * @param y2 Determines the value for the y axis of the second face
   * @param faceColour Determines the colour of the face
   * @param eye Determines the colour of the eye and mouth
   */
  private void drawFace2(int x2, int y2, int faceColour, int eye){
  //face
  fill(faceColour,faceColour,faceColour);
  ellipse(x2, y2, width/5, height/5); 
  
  //Left hole
  fill(eye,eye,eye);
  ellipse(x2-20,y2-20, width/40, height/40);
  
  //Right hole
  fill(eye,eye,eye);
  ellipse(x2+20, y2-20, width/40, height/40); 
  
  stroke(eye,eye,eye);
  line(x2-10,y2+20,x2+15,y2+20);
  
  }

  /**
   * Parameters for the red circle
   * @param placeX Get the location of the X Value
   * @param placeY Gets the location of the Y value
   * @return returns X and Y value
   */
  private int getLocation(int placeX, int placeY){  
  
    fill(255,0,0);
    ellipse(placeX, placeY, 100, 100);

    return placeX + placeY;

  }

  // define other methods down here.
}