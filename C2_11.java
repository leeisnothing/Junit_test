package Dengjialei;
import java.util.Scanner;
//无法进行测试以及划分等价类，没有输入，无法做等价类、边界值
public class C2_11 {
	 public static void main(String[] args) {
	        int n;
	        GameResult result;
	        GameResult omit = GameResult.CANCEL;
	       
	        for (GameResult count: GameResult.values()) {
	            result = count;
	            if (result == omit) 
	                System.out.println( "The game was cancelled");
	            else {
	                System.out.print("The game was played ");
	                if (result == GameResult.WIN)
	                    System.out.println("and we won!");
	                if (result == GameResult.LOSE)
	                    System.out.println("and we lost.");
	            }
	        }
	    }
}
