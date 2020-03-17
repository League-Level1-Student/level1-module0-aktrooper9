float y = random(400);
float x = random(400);
void setup(){
size(400, 400);
    background(00, 00, 00);

}
void draw(){
  makeMagical();
for(int i = 0; i<300;i++){
fill(500,0,0);
ellipse(x,y,10,10);
 y = getWormY(i);
 x = getWormX(i);
}
}
 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
