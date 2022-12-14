package replit;

import java.util.Scanner;

public class Water_tax {

    public static double waterTax(double units){
        //WRITE YOUR CODE BELOW:

        if (units <= 50) return units * 0.60;
        else if (units > 50 && units <100) return units*0.90;
        else if (units >100 && units < 150) return units*0.90+50;
        else return units*0.90+100;




    }//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }

}

