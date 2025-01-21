import java.util.Scanner;

class Factorial {

static String FactorialUsingForLoop(int num){
  int value = num;
  int output = 1;
  //int fact= 1;
  
  if(value == 0){
  return "1";
  }
  else if(value < 0){
  return "Input is negative, for which factorial is Not Defined";
  }
  else{
  for(int i = value; i >= 1;i--){
    output = output * i;
    }
  }
  
  return Integer.toString(output);
  
  }
  
static String FactorialUsingWhileLoop(int num){
  int value = num;
  int output = 1;
  
   if(value == 0 || num==1 ){
  return "1";
  }
  else if(value < 0){
  return "Input is negative, for which factorial is Not Defined";
  }
  else{
  while(value >=1){
  output = output * value;
  value--;
  }
  }
  return Integer.toString(output);
  
  }

static int FactorialUsingRecursion(int num)
    {
        int output;
       if(num==0 || num==1)
         return 1;
       else if (num < 0)
         return -1;

       output = FactorialUsingRecursion(num-1) * num;
       return output;
    }
    
  
  public static void main(String [] args){
  
  Scanner s  = new Scanner(System.in);
  System.out.println("Enter the value to get Factorial : ");
  int value = s.nextInt();
  System.out.println("Enter \n 1. Factorial Using For loop \n 2. Factorial Using While Loop \n 3. Factorial Using Recursion.");
  int choice = s.nextInt();
  
  switch(choice){
  case 1 :   System.out.println("Factorial of "+value+" is : "+ FactorialUsingForLoop(value));
  break;
  case 2 :   System.out.println("Factorial of "+value+" is : "+ FactorialUsingWhileLoop(value));
  break;
  case 3 : System.out.println("Factorial of "+value+" is : "+ FactorialUsingRecursion(value));
  break;
  default :
  System.out.println("Invalid Choice!");
  break;
  }
 }
}
