int y = 0;
      int x = (int) random(width);
      int score= 0;
void setup(){
size(500,500);
background(30,800,10000);
}
void draw(){
      background(20,800,10000);
      fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
 
  fill(3000,70,0);
  rect(mouseX,450,30,40);
   fill(0, 0, 500);
    stroke(0, 0, 100);
    ellipse(x, y, 15, 100);
    y+=4;
    if(y==500){
       checkCatch(x);
  
    y-=500;
     x= (int) random(width);
    }
}
  void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
