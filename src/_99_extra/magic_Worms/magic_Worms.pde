float y = random(400);
float x = random(400);
void setup(){
size(400, 400);
    background(00, 00, 00);

}
void draw(){
for(int i = 0; i<300;i++){
fill(500,0,0);
ellipse(x,y,10,10);
 y = random(400);
 x = random(400);
}
}
