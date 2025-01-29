class StarPattern{

//pattern 1
static void patternOne(int size){

//upper //space plus newline
//___+\n
//__+++\n
//_+++++\n
//+++++++\n

for(int ln=1; ln<=size; ln++){
  //space
  for(int space=size-ln; space >0; space--){
    System.out.print("  ");
  }
  //plus
  for(int plus=(2*ln-1); plus>0; plus--){
  System.out.print("+ ");
  }
  //new line
  System.out.println();
}

//Lower
//_+++++\n
//__+++\n
//___+\n

for(int ln=size-1; ln >=1; ln--){
  //space
  for(int space = 1; space <= (size-ln); space++){
  System.out.print("  ");
  }
  //plus
  for(int plus=(2*ln-1); plus>0; plus--){
   System.out.print("+ ");
  }
  //new line
  System.out.println();
}
}

//pattern 2
static void patternTwo(int size){
//upper
//__+\n
//_+ +\n
//+ + +\n

  for(int ln=1; ln<= size; ln++){
    //space
    for(int space=size-ln; space>0; space--){
    System.out.print("  ");
    }
    //plus
    for(int plus=(2*ln-1); plus >0; plus--){
      if(plus % 2 == 1){
        System.out.print("+ ");
      }
      else{
        System.out.print("  ");
      }
    }
    //new line
    System.out.println();
  }
//Lower
//_+ +\n
//__+\n
for(int ln=(size-1); ln>0; ln--){
  //space
  for(int space=1; space<=(size-ln); space++){
    System.out.print("  ");
  }
  //star
  for(int star=(2*ln-1); star>0; star--){
   if(star%2 == 1){
    System.out.print("* ");
   }
   else{
    System.out.print("  ");
   }
  }
  //new line
  System.out.println();
}
}

//pattern 3
static void patternThree(int size){
//upper
//__*\n
//_+*+\n
//*+*+*\n

for(int ln=1;ln<=size;ln++){
  //space
  for(int space=(size-ln);space>0; space--){
   System.out.print("  ");
  }
  //symbol
  for(int symbol=(2*ln-1); symbol>0;symbol--){
   if((symbol+ln)%2!=1){
      System.out.print("* ");
    }
    else{
      System.out.print("+ ");
    }
  }
  System.out.println();
}

//Lower
//+*+*+\n
//_*+*\n
//__+\n

for(int ln=size;ln>0;ln--){
 //space
 for(int space=(size-ln); space>0; space--){
  System.out.print("  ");
 }
 //symbol
 for(int symbol=(2*ln-1); symbol >0; symbol--){
  if((symbol+ln)%2!=1){
  System.out.print("+ ");
  }
  else{
  System.out.print("* ");
  }
  }
  //new line
  System.out.println();

}
}

public static void main(String[] args){
System.out.println("Pattern 1:");
patternOne(4);
System.out.println("Pattern 2:");
patternTwo(4);
System.out.println("Pattern 3:");
patternThree(4);
}
}
