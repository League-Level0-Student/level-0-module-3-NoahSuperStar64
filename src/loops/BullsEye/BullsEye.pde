void setup(){
  noFill();
  size(700, 700);
}
void draw(){
for(int i = 0; i < 500; i=i+40){
ellipse(350, 350, i+50, i+50);
}
}