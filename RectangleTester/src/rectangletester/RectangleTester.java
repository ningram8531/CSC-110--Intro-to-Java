
package rectangletester;

import java.util.ArrayList;

public class RectangleTester {


    public static void main(String[] args) {
        
        Rectangle box = new Rectangle();
        
        Rectangle box2 = new Rectangle(15.75 , 23.125);
        
        SomeMath mathStuff = new SomeMath();
        
        ArrayList<String> nameList = new ArrayList<>();
        
        nameList.add("James");
        nameList.add("Katie");
        nameList.add("Bill");
        
        box.setLength(10);
        box.setWidth(20);
        
        System.out.println("Area of box 2 is " + box2.getArea());
        
        System.out.println("Width of the cool box is " + box.getWidth());
        System.out.println("Area of the super cool box is " + box.getArea());
        
        int sum = mathStuff.add(200 , 150);
        
        System.out.println("sum: " + sum);
        
        double sum2 = mathStuff.add(250.058, 604.256);
        System.out.println("sum: " + sum2);
        
        double sum3 = mathStuff.add(2.58 , 6.24 , 5);
        System.out.println("sum: " + sum3);
        
        System.out.println(nameList.get(1));
        
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i)); 
        }
        
        nameList.remove(0);
        System.out.println(nameList.size());
        System.out.println(nameList);
        
        System.out.println("add Mary at 1");
        nameList.add(1, "Becky");
        System.out.println(nameList);
        
        
        
        
        
}
}