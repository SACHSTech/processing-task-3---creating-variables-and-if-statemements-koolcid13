import processing.core.PApplet;

/**
* A program Sketch.java that sketches a simple drawing which gets drawn at random locations for each run
* @author: Avin A.
*
*/

public class Sketch extends PApplet {
  
  // define variable for random x-coordinate of white guy's head
  float rndXwhite;
  // define boolean to determine the style
  boolean changeStyle = false;
  // define variables for current time
  int currHr = hour();
  int currMin = minute();
  int currSec = second();

  public void settings() {
    // uses preferred values for height and width of the screen
    size(400, 400);
    // generate a random x-coordinate for white guy's head
    rndXwhite = random ((float) (width * 0.125), (float) (width * 0.675));
    // choose program style according to the random x-coordinate
    if (rndXwhite % 1 > 0.2 && rndXwhite % 1 < 0.7)
    {
      changeStyle = true;
    }
  }

  public void setup() {
    // background colour determination according to style
    if (changeStyle)
    {
      background(170, 207, 235);
    }
    else
    {
      background(232, 130, 14);
    }
  }

  public void draw() {
    // print current time
    textSize(20);
    fill(19, 28, 21);
    text(currHr, (float) (width * 0.05), (float) (height * 0.93)); 
    text(":", (float) (width * 0.12), (float) (height * 0.93)); 
    text(currMin, (float) (width * 0.15), (float) (height * 0.93)); 
    text(":", (float) (width * 0.22), (float) (height * 0.93));
    text(currSec, (float) (width * 0.25), (float) (height * 0.93));

    // White Guy
    stroke(255);
    if (changeStyle)
    {
      fill(170, 207, 235);
    }
    else
    {
      fill(232, 130, 14);
    }
    // white guy head
    ellipse((int) rndXwhite, (int) (height * 0.075), (int) (width * 42.0 / 400.0), (int) (height * 42.0 / 400.0));
    // white guy body
    line((int) rndXwhite, (int) (height * 0.125), (int) (rndXwhite - width * 0.0625), (int) (height * 0.26));
    // white guy left arm
    line((int) (rndXwhite - width * 0.031), (int) (height * 74.0 / 400.0), (int) (rndXwhite - width * 0.1), 0);
    // white guy upper leg
    line((int) (rndXwhite - width * 0.0625), (int) (height * 0.26), (int) (rndXwhite - width * 0.1), (int) (height * 145.0 / 400.0));
    // white guy lower leg
    line((int) (rndXwhite - width * 0.0625), (int) (height * 0.26), (int) (rndXwhite - width * 0.0375), (int) (height * 150.0 / 400.0));
    // white guy left eye
    line((int) (rndXwhite - width * 0.02), (int) (height * 30.0 / 400.0), (int) (rndXwhite - width * 0.02), (int) (height * 20.0 / 400.0));
    // white guy right eye
    line((int) (rndXwhite + width * 0.02), (int) (height * 30.0 / 400.0), (int) (rndXwhite + width * 0.02), (int) (height * 20.0 / 400.0));
    // white guy left half of smile
    line((int) (rndXwhite), (int) (height * 44.0 / 400.0), (int) (rndXwhite - width * 0.03), (int) (height * 33.0 / 400.0));
    // white guy right half of smile
    line((int) (rndXwhite), (int) (height * 44.0 / 400.0), (int) (rndXwhite + width * 0.03), (int) (height * 35.0 / 400.0));
    // white guy right arm
    line((int) (rndXwhite - width * 0.031), (int) (height * 74.0 / 400.0), (int) (rndXwhite + width * 0.105), (int) (height * 0.26));

    // Gray Guy Head System
    stroke(120);
    if (changeStyle)
    {
      fill(170, 207, 235);
    }
    else
    {
      fill(232, 130, 14);
    }
    // gray guy head
    ellipse((int) (rndXwhite + width * 0.105), (int) (height * 102.0 / 400.0), (int) (width * 28.0 / 400.0), (int) (height * 28.0 / 400.0));
    // gray guy left eye
    line((int) (rndXwhite + width * 0.095), (int) (height * 100.0 / 400.0), (int) (rndXwhite + width * 0.095), (int) (height * 94.0 / 400.0));
    // gray guy right eye
    line((int) (rndXwhite + width * 0.115), (int) (height * 100.0 / 400.0), (int) (rndXwhite + width * 0.115), (int) (height * 94.0 / 400.0));
    // gray guy mouth
    line((int) (rndXwhite + width * 0.09), (int) (height * 106.0 / 400.0), (int) (rndXwhite + width * 0.12), (int) (height * 106.0 / 400.0));

    /*
    // Gray Guy Hat
    stroke(219, 15, 155);
    fill(201, 20, 145);
    // hat base
    triangle ((int) (width * 151.0 / 400.0), (int) (height * 87.0 / 400.0), (int) (width * 177.0 / 400.0), (int) (height * 87.0 / 400.0), (int) (width * 164.0 / 400.0), (int) (height * 57.0 / 400.0));
    // hat decor
    stroke(20, 201, 83);
    line((int) (width * 153.0 / 400.0), (int) (height * 82.0 / 400.0), (int) (width * 173.0 / 400.0), (int) (height * 78.0 / 400.0));
    line((int) (width * 158.0 / 400.0), (int) (height * 70.0 / 400.0), (int) (width * 169.0 / 400.0), (int) (height * 67.0 / 400.0));
    stroke(233, 237, 7);
    line((int) (width * 155.0 / 400.0), (int) (height * 76.0 / 400.0), (int) (width * 171.0 / 400.0), (int) (height * 72.0 / 400.0));
    // hat star
    stroke (233, 237, 7);
    line((int) (width * 164.0 / 400.0), (int) (height * 57.0 / 400.0), (int) (width * 164.0 / 400.0), (int) (height * 45.0 / 400.0));
    line((int) (width * 160.0 / 400.0), (int) (height * 54.0 / 400.0), (int) (width * 168.0 / 400.0), (int) (height * 48.0 / 400.0));
    line((int) (width * 160.0 / 400.0), (int) (height * 48.0 / 400.0), (int) (width * 168.0 / 400.0), (int) (height * 54.0 / 400.0));
    */

    // Stairs
    if (changeStyle)
    {
      stroke(153, 7, 237);
      fill (153, 7, 237);
    }
    else
    {
      stroke(8, 255, 119);
      fill (8, 255, 119);
    }
    rect((int) (width / 2), (int) (height * 370.0 / 400.0), (int) (width * 160.0 / 400.0), (int) (height * 30.0 / 400.0));
    rect((int) (width / 2), (int) (height * 340.0 / 400.0), (int) (width * 120.0 / 400.0), (int) (height * 30.0 / 400.0));
    rect((int) (width / 2), (int) (height * 310.0 / 400.0), (int) (width * 80.0 / 400.0), (int) (height * 30.0 / 400.0));
    rect((int) (width / 2), (int) (height * 280.0 / 400.0), (int) (width * 40.0 / 400.0), (int) (height * 30.0 / 400.0));

    // Gray Guy Lower Body
    stroke(120);
    // gray guy left leg
    line((int) (width * 201.0 / 400.0), (int) (height * 280.0 / 400.0), (int) (width * 214.0 / 400.0), (int) (height * 250.0 / 400.0));
    // gray guy right leg
    line((int) (width * 227.0 / 400.0), (int) (height * 280.0 / 400.0), (int) (width * 214.0 / 400.0), (int) (height * 250.0 / 400.0));
    // gray guy body
    line((int) (width * 214.0 / 400.0), (int) (height * 250.0 / 400.0), (int) (width * 214.0 / 400.0), (int) (height * 210.0 / 400.0));
    // gray guy hands based on where the white guy is located
    if (rndXwhite < width / 2)
    {
      line((int) (width * 0.535), (int) (height * 0.565), (int) (width * 0.485), (int) (height * 0.4875));
      line((int) (width * 0.535), (int) (height * 0.56), (int) (width * 0.495), (int) (height * 0.465));
    }
    else
    {
      line((int) (width * 0.535), (int) (height * 0.565), (int) (width * 0.585), (int) (height * 0.4875));
      line((int) (width * 0.535), (int) (height * 0.56), (int) (width * 0.575), (int) (height * 0.465));
    }

    /* 
    // Ladder
    stroke(115, 57, 25);
    line((int) (width * 350.0 / 400.0), (int) (height * 0.0 / 400.0), (int) (width * 320.0 / 400.0), (int) (height * 115.0 / 400.0));
    line((int) (width * 326.0 / 400.0), (int) (height * 0.0 / 400.0), (int) (width * 296.0 / 400.0), (int) (height *115.0 / 400.0));
    line((int) (width * 300.0 / 400.0), (int) (height * 94.0 / 400.0), (int) (width * 325.0 / 400.0), (int) (height * 92.0 / 400.0));
    line((int) (width * 305.0 / 400.0), (int) (height * 74.0 / 400.0), (int) (width * 330.0 / 400.0), (int) (height * 72.0 / 400.0));
    line((int) (width * 310.0 / 400.0), (int) (height * 54.0 / 400.0), (int) (width * 335.0 / 400.0), (int) (height * 52.0 / 400.0));
    line((int) (width * 315.0 / 400.0), (int) (height * 34.0 / 400.0), (int) (width * 340.0 / 400.0), (int) (height * 32.0 / 400.0));
    line((int) (width * 320.0 / 400.0), (int) (height * 14.0 / 400.0), (int) (width * 345.0 / 400.0), (int) (height * 12.0 / 400.0));
    */

    /*
    // Blue Guy
    stroke(57, 132, 212);
    // blue guy right leg
    line((int) (width * 280.0 / 400.0), (int) (height * 115.0 / 400.0), (int) (width * 272.0 / 400.0), (int) (height * 95.0 / 400.0));
    // blue guy left leg
    line((int) (width * 272.0 / 400.0), (int) (height * 95.0 / 400.0), (int) (width * 266.0 / 400.0), (int) (height * 115.0 / 400.0));
    // blue guy body
    line((int) (width * 272.0 / 400.0), (int) (height * 95.0 / 400.0), (int) (width * 272.0 / 400.0), (int) (height * 70.0 / 400.0));
    // blue guy left arm
    line((int) (width * 272.0 / 400.0), (int) (height * 79.0 / 400.0), (int) (width * 257.0 / 400.0), (int) (height * 63.0 / 400.0));
    // blue guy right bicep
    line((int) (width * 272.0 / 400.0), (int) (height * 79.0 / 400.0), (int) (width * 280.0 / 400.0), (int) (height * 85.0 / 400.0));
    // blue guy right forearm
    line((int) (width * 280.0 / 400.0), (int) (height * 85.0 / 400.0), (int) (width * 272.0 / 400.0), (int) (height * 93.0 / 400.0));
    // blue guy head
    fill(170, 200, 235);
    ellipse((int) (width * 272.0 / 400.0), (int) (height * 60.0 / 400.0), (int) (width * 20.0 / 400.0), (int) (height * 20.0 / 400.0));
    // blue guy eyes
    ellipse((int) (width * 269.0 / 400.0), (int) (height * 57.0 / 400.0), (int) (width * 1.0 / 400.0), (int) (height * 1.0 / 400.0));
    ellipse((int) (width * 275.0 / 400.0), (int) (height * 57.0 / 400.0), (int) (width * 1.0 / 400.0), (int) (height * 1.0 / 400.0));
    // blue guy smile
    line((int) (width * 272.0 / 400.0), (int) (height * 65.0 / 400.0), (int) (width * 266.0 / 400.0), (int) (height * 60.0 / 400.0));
    line((int) (width * 272.0 / 400.0), (int) (height * 65.0 / 400.0), (int) (width * 278.0 / 400.0), (int) (height * 60.0 / 400.0));
    */
  }
}