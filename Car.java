/*public class Main{
public static void main (String[] args){
    String studentName="Ancy";
    int studentID=15;
    float fee= 256.99f;
    char isPresent= 'T';

 System.out.println("Hello World");
System.out.println(3+9);
System.out.println("Adrin");
System.out.println("Student:"+ studentName);
System.out.println("Student ID:"+ studentID);
System.out.println("Student fee :"+ fee);
System.out.println("Present:"+ isPresent);
}
}*/

// public class Main {
//     public static void main(String[] args) {
//       // Create variables of different data types
//       int items = 50;
//       float costPerItem = 9.99f;
//       float totalCost = items * costPerItem;
//       char currency = '$';
  
//       // Print variables
//       System.out.println("Number of items: " + items);
//       System.out.println("Cost per item: " + costPerItem + currency);
//       System.out.println("Total cost = " + totalCost + currency);
//       System.out.println(Math.min(5,4));
//       if(((costPerItem/totalCost)*100)<=10){
//         System.out.println("Can buy the item");
//       }
//       else{
//         System.out.println("Can't buy the item");
//       }

//       int countDown=3;
//       while(countDown>-1){
        
//         if(countDown==0){
// System.out.println("Happy New Year!");
//         }
//         else{
//           System.out.println(countDown);
//         }
//       countDown--;
//       }
      
//   }
// }
  
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

public class Car{
    public static void main(String[] args){
        // Create an array of cars
        TreeSet <String> cars= new TreeSet<String>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("BMW");
        Iterator <String> i  = cars.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

        
    } 
}