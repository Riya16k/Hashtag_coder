import java.util.Scanner;

class Test{
public static void main(String[] args){
Scanner = new Scanner(System.in);
System.out.println("Please insert any number");
int num = sc.nextInt();
boolean isPrime = true;
for(int i = 2;i<num;i++){
if(num%i==0){
isPrime = false;
break;
}
}
if(isPrime){
System.out.println(num+"is prime number");
}else{
System.out.println(num+"is not a prime number");
}
}
}
