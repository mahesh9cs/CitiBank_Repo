
public class ForExample {  
public static void main(String[] args) {  
    //Code of Java for loop  
    for(int i=1;i<=10;i++){  
        System.out.println(i);  
    }  
}  
}

public class SwitchExample {  
public static void main(String[] args) {  
    //Declaring a variable for switch expression  
    int number=20;  
    //Switch expression  
    switch(number){  
    //Case statements  
    case 10: System.out.println("10");  
    break;  
    case 20: System.out.println("20");  
    break;  
    case 30: System.out.println("30");  
    break;  
    //Default case statement  
    default:System.out.println("Not in 10, 20 or 30");  
    }  
}  
} 
public class MultiplicationTable {

    public static void main(String[] args) {

        int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
