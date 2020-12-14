package linear_equation;
import java.util.Scanner;

public class linear_eq {

    public void solver(int a, int b){
        if(b == 0){
            System.out.println("There are infinite solutions");
        }
        else{
            double x = -b/a;
            System.out.println("The solution is " + x);
        }
    }




}
