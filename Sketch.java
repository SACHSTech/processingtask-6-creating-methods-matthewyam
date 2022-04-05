import java.nio.channels.ReadPendingException;

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
     
  }

  private void drawFace(int a, int b){

  //face
  fill(255,255,255);
  ellipse(a, b, width/5, height/5); 

  //Left hole
  fill(0,0,0);
  ellipse(a-20,b-20, width/40, height/40);

  //Right hole
  fill(0,0,0);
  ellipse(a+20, b-20, width/40, height/40); 

  line(a-20,b+10,a+20,b+15);

  }
  
  // define other methods down here.
}