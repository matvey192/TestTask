package Calculator;

import CalculatorException.CalculatorException;

import java.util.*;

import static CalculatorException.CodeError.WRONG_NUM;

public class CalculateFunc {
    private int result =0;
    private String resultString;
    public CalculateFunc() throws CalculatorException {
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String operation = in.next();
        String second = in.next();
        InputCalculator input = new InputCalculator(first, second, operation);

        Map<Integer, String> allNums = new HashMap<Integer, String>();
        allNums.put(1, "I");
        allNums.put(2, "II");
        allNums.put(3, "III");
        allNums.put(4, "IV");
        allNums.put(5, "V");
        allNums.put(6, "VI");
        allNums.put(7, "VII");
        allNums.put(8, "VIII");
        allNums.put(9, "IX");
        allNums.put(10, "X");

        if (input.getOperation().equals("/") && input.getSecond() == 0 || input.getFirst() == 0) {
            throw new CalculatorException(WRONG_NUM);
        }

        if (allNums.containsValue(first)) {
            if (input.getOperation().equals("+")) {
                resultString = allNums.get(input.getFirst() + input.getSecond());
            } else if (input.getOperation().equals("-")) {
                resultString = allNums.get(input.getFirst() - input.getSecond());
            } else if (input.getOperation().equals("*")) {
                resultString = allNums.get(input.getFirst() * input.getSecond());
            } else if (input.getOperation().equals("/")) {
                resultString = allNums.get(input.getFirst() / input.getSecond());
            }
        } else if (input.getOperation().equals("+")) {
            result = input.getFirst() + input.getSecond();
        } else if (input.getOperation().equals("-")) {
            result = input.getFirst() - input.getSecond();
        } else if (input.getOperation().equals("*")) {
            result = input.getFirst() * input.getSecond();
        } else if (input.getOperation().equals("/")) {
            result = input.getFirst() / input.getSecond();
        }
    }

    public int getResult() {
        return result;
    }

    public String getResultString() {
        return resultString;
    }
}
