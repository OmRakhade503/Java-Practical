class pattern{

static void stars(int num){
if(num > 0){
System.out.print("* ");
stars(num-1);
}
}

static void plus(int num){
if(num > 0){

System.out.print("+ ");
plus(num-1);
}
}
static void printPlus(int num, int length){
if(num<=length){
space(1,4);
System.out.print("+");
System.out.println();
printPlus(num+1,length);
}
}
static void dash(int num){
if(num > 0){
System.out.print("/ ");
dash(num-1);
}
}


static void space(int num, int length){
if((length-num)>0){
System.out.print("  ");
space(num, length-1);
}
}

static void space2(int num, int length){
if((length-num)>0){
System.out.print("  ");
space2(num, length-2);
}
}
static void pattern1(int num, int length){
if(num<=length+1){
stars(num);
System.out.println();

pattern1(num+1,length);

if(num != length+1){
stars(num);
System.out.println();
}
}

}

static void pattern2(int num, int length){
if(num<= length+1){
if(num != length+1){
space(num,length+1);
stars(num);
System.out.println();
}
pattern2(num+1,length);

if(num == length+1){
plus(num);
System.out.println();
}

if(num != length+1){
space(num,length+1);
dash(num);
System.out.println();
}
}

}

static void pattern3(int num, int length){

if(num<=length+1){
space2(num,length+1);
stars(num);
System.out.println();
pattern3(num+2,length);

if(num != length){
space2(num,length+1);
stars(num);
System.out.println();

}
}
}

static void printStarLine(int num,int length){
if(num<=length){
space(num,length);
plus(num);
System.out.println();
}

}

public static void main(String [] args){
System.out.println("pattern 1 :\n");
pattern1(1,3);
System.out.println("pattern 2 :\n");
pattern2(1,3);
System.out.println("pattern 3 :\n");
pattern3(1,5);
printPlus(1,5);
}

}
