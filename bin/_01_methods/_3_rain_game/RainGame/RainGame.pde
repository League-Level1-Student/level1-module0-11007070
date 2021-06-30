/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
 
/** This program makes a game where the user has to catch rain drops in a bucket
 */


int score = 0;
int bucketWidth = 120;
int bucketHeight = 50;
PImage bucket;
int y = 50;
int x = 100;

// The setup method is run once when the program starts
void setup() {

  //Set your canvas size
  size(600,600);
  
  
  //If you are using an image for the bucket, load it and resize it here.
  // A bucket image -  bucket.png - has been provided if you want to use it.
}

// The draw method runs continuously (in a loop) until the program ends
void draw() {
  // Set a background color
  background(189,189,189);
  fill(193,251,252);
  stroke(141,247,248);
  ellipse(x,y,50,50);
  y += 10;
  
  if (y == 600) {
    fill(193,251,252);
    stroke(141,247,248);
    y = 0;
    x = (int) random(width);
    ellipse(x,y,50,50);
  }
  fill(165,165,165);
  stroke(119,118,119);
  rect(mouseX, 550, 120, 50);
  
  if (y == 550) {
  checkCatch(x);
  }
  
  
  // Draw a raindrop (ellipse) at the top of the screen
  
  
  
  // Make the rain fall down the screen.
  // Hint: make a variable for the raindrop's Y position and change it after you
  // draw the raindrop
  
  
  // When the rain falls off the bottom of the canvas, 
  // start a new rain drop falling from the top.
  // Each new drop should start at a random position (X position) at the top. 
  // Hint: This code will give you a random number between 0 and the width of your sketch.
  
  
  // Draw a bucket (rectangle or image) at the bottom of the screen. 
  // The bucket's width needs to be stored in the bucketWidth variable.
  
  
  // Make the bucket move side-to-side with the mouse. Hint: use mouseX
  
  
  // When the rain drop has fallen to the bucket, call the checkCatch method
  //  to see if the rain drop is in the bucket.
  
 
 //This code will display the score on the screen. 
 // Change the color if it does not show up on your background.
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}


// DO NOT CHANGE THIS METHOD - CALL IT FROM THE DRAW METHOD 
    void checkCatch(int xx){
         if (xx > mouseX && xx < mouseX+120) {
            score++;
         }
         else if (score > 0){
            score--;
         }
        println("Your score is now: " + score);
    }
