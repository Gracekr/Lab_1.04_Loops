import java.util.Arrays;

public class Lab1 {
           public static void main(String[] args)
    /*Este es el method para hacer mi archivo ejecutable*/
     {
         System.out.println("Lab 1.04 Loops and Version Control");
         System.out.println("Task 1");


         //Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.



       int [] myArray ={20,35,47,124,5,63,14,7};
         Arrays.sort(myArray);
         System.out.println(myArray.length-1);
             int subtract=myArray[7]-myArray[0];
         System.out.println("The difference between the largest and smallest values is: "+subtract);


         System.out.println("\n");
         System.out.println("Task 2");

//Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.

     int [] otherArray={16,20,30,50,45,60,70,3,80};
         Arrays.sort(otherArray);

    int smallValue = otherArray[0];
    int secondSmallValue=otherArray[1];
         System.out.println(smallValue);
         System.out.println(secondSmallValue);



         System.out.println("\n");
         System.out.println("Task 3");
//Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code
double x=1;
double y=2;

         double ec=((x*x)+Math.pow(((((4*y)/5)-x)),2));
         System.out.println("El resultado de evaluar X=1 y Y=2 en la ecuación, es: "+ec);


}
}
