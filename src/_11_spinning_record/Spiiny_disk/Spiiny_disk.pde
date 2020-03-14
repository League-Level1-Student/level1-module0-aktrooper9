import ddf.minim.Minim;
import ddf.minim.AudioPlayer;
PImage pictureOfRecord; 
int angle = 10;
Minim minim;
AudioPlayer song;
void setup(){
        size(600,600);    
        pictureOfRecord= loadImage("record.png"); 
        pictureOfRecord.resize(height,width);
      Minim minim = new Minim(this);
        song = minim.loadFile("music.mp3");
}
void draw(){
 if(mousePressed){
   rotateImage(pictureOfRecord ,angle);
   song.play();
}
angle+=5;
song.pause();
image(pictureOfRecord, 0, 0);
}
   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
       
    }
    
