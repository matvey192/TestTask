package CalculatorException;

public class CalculatorException extends Exception {
    private CodeError error;

    public CalculatorException(CodeError error){
        this.error =error;
    }

    public CodeError getError() {
        return error;
    }

    public void setError(CodeError error) {
        this.error = error;
    }
}
