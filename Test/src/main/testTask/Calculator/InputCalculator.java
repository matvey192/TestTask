package Calculator;

import CalculatorException.CalculatorException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static CalculatorException.CodeError.*;

public class InputCalculator {
    private int first, second;
    private String operation;

    public InputCalculator(String first, String second, String operation) throws CalculatorException {
        Map<String, Integer> allNums = new HashMap<String, Integer>();
        allNums.put("I", 1);
        allNums.put("II", 2);
        allNums.put("III", 3);
        allNums.put("IV", 4);
        allNums.put("V", 5);
        allNums.put("VI", 6);
        allNums.put("VII", 7);
        allNums.put("VIII", 8);
        allNums.put("IX", 9);
        allNums.put("X", 10);

        List<String> operations = new ArrayList<String>();
        operations.add("*");
        operations.add("+");
        operations.add("-");
        operations.add("/");
        try {
            if (!operations.contains(operation)) {
                throw new CalculatorException(WRONG_OPERATION);
            } else if (allNums.containsKey(first) && allNums.containsKey(second)) {
                setFirst(allNums.get(first));
                setSecond(allNums.get(second));
                setOperation(operation);

            } else if ((allNums.containsKey(first) || allNums.containsKey(second)) &&
                    (allNums.containsValue(Integer.parseInt(first)) || allNums.containsValue(Integer.parseInt(second)))) {
                throw new CalculatorException(DIFFERENT_TYPES_OF_NUMS);
            } else if (allNums.containsValue(Integer.parseInt(first)) && allNums.containsValue(Integer.parseInt(second))) {
                List<Integer> all = new ArrayList<Integer>();
                all.add(1);
                all.add(2);
                all.add(3);
                all.add(4);
                all.add(5);
                all.add(6);
                all.add(7);
                all.add(8);
                all.add(9);
                all.add(10);

                setFirst(Integer.parseInt(first));
                setSecond(Integer.parseInt(second));
                setOperation(operation);

            } else {
                throw new CalculatorException(WRONG_NUM);
            }
        }catch (NumberFormatException e){
            throw new CalculatorException(DIFFERENT_TYPES_OF_NUMS);
        }

    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
