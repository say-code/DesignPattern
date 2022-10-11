package main.factoryMethod.simpleCalculator;

/**
 * @author sayCode
 * @date 2022/9/28 14:51
 * project: DesignPattern
 * Title: SubOperation
 * description: 减法操作
 */
public class SubOperation extends Operation{
    @Override
    public int getResult() {
        return numberA-numberB;
    }
}
