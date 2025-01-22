import java.util.Scanner;

class AdditionOfArrayElements{
static int output = 0;
static int AdditionUsingFor(int arr[]){
int output =0;
for(int  i = 0; i<=arr.length-1; i++){
output = output+ arr[i];
}
return output;
}

static int AdditionUsingWhile(int arr[]){
int output = 0;
int i=0;
while(i<=arr.length-1){
output += arr[i];
i++;
}
return output;
}

static int AdditionUsingRecursion(int arr[],int index){

if(index <=0 )
{
return arr[index];
}
else{
output =  arr[index] + AdditionUsingRecursion(arr, index-1);
return output;
}


}

public static void main(String [] args){
int output = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter a length of array: ");
int length = s.nextInt();
int [] arr = new int[length];
for(int i=0;i<length;i++){
System.out.println("Enter element "+(i+1)+" :");
arr[i]=s.nextInt();
}
 int index = length-1;
System.out.println("Enter 1. Addition Using For loop \n 2. Addition Using While loop \n 3. Addition Using Recursion :");
int choice= s.nextInt();

switch(choice){
case 1: output =  AdditionUsingFor(arr);
break;
case 2:output = AdditionUsingWhile(arr);
break;
case 3:output = AdditionUsingRecursion(arr,index);
break;
default:
System.out.println("Enter valid choice!");
break;
}
System.out.println("Output is :" + output);

}
}
