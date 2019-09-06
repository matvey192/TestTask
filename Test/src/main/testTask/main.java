import Calculator.CalculateFunc;
import CalculatorException.CalculatorException;

public class main {
   public static void main(String[] args) throws CalculatorException {
       CalculateFunc calc = new CalculateFunc();
       if(calc.getResult()==0){
           System.out.println(calc.getResultString());
       }else {
           System.out.println(calc.getResult());
       }
   }
}
