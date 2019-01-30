void setup(){
   String Lyric1 = " bottles of age apropriate beverage on the wall ";
   String Lyric2 = " bottles of age apropriate beverage, ";
   String Lyric3 = "\n Take one down and pass it around, ";
 for(int i = 99; i > 0; i--){
if(i > 2){
   print("\n "+i + Lyric1 + i + Lyric2 + Lyric3 + (i-1) + Lyric1 );
}
 else if(i == 2){
  print("\n "+i +Lyric1+i+Lyric2 + Lyric3+ "1 bottle of age apropriate beverage on the wall"); 
 }
 else if(i == 1){
  print("\n "+1+" bottle of age apropriate beverage on the wall 1 age apropriate beverage, "+Lyric3+"no more"+Lyric1); 
 }
 } 
}