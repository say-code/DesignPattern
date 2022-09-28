package main.factoryMethod.simpleCalculator;

/**
 * @author sayCode
 * @date 2022/9/28 14:48
 * project: DesignPattern
 * Title: AddOperation
 * description: 加法操作
 */
public class AddOperation extends Operation{
    @Override
    public int getResult() {
        return numberA+numberB;
    }
}
