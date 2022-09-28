package main.factoryMethod.simpleCalculator;

/**
 * @author sayCode
 * @date 2022/9/28 14:52
 * project: DesignPattern
 * Title: Calculator
 * description: 工厂类
 */
public class Calculator {
    public static Operation createOperation(char operator){
        Operation op = null;
        switch (operator){
            case '+':
                op = new AddOperation();
                break;
            case '-':
                op = new SubOperation();
                break;
            default:break;
        }
        return op;
    }
}
