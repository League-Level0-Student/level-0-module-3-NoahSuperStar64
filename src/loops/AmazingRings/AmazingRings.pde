void setup(){
  noFill();
  size(700, 700);
  frameRate(30);
}
int x = 1;
int x2 = 699;
int x3 = 1;
void draw(){
 background(#0D0202);
 if(x > 699 ||x < 1){
  x3*=-1; 
 }
 
  x = x+x3;
  
for(int i = 0; i < 500; i=i+9){
  if(i%2==1){
   stroke(#E31515); 
  }
  else{
   stroke(#FFFFFF); 
  }
  ellipse(x, 350, i, i);
  }
  
  x2 = x2-x3;
  
  for(int i = 0; i < 500; i=i+9){
    if(i%2==0){
   stroke(#E31515); 
  }
  else{
   stroke(#FFFFFF); 
  }
  ellipse(x2, 350, i, i);
  }
}


  
  
  
  
  