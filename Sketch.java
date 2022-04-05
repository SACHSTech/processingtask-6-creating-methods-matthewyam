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
	  
	drawFace();
     
  }

  private void drawFace(){

  //Outside of button
  fill(255,255,255);
  ellipse(50, 50, 80, 80); 

  //Left hole
  fill(0,0,0);
  ellipse(20, 50, 10, 10);

  //Right hole
  fill(0,0,0);
  ellipse(60, 50, 10, 10); 

  line(20,70,80,60);

  }
  
  // define other methods down here.
}