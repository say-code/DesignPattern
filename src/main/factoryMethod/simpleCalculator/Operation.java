package main.factoryMethod.simpleCalculator;

/**
 * @author sayCode
 * @date 2022/9/28 14:45
 * project: DesignPattern
 * Title: Operation
 * description: 操作类
 */
public abstract class Operation {
    //用作计算的数字A和B
    protected int numberA;
    protected int numberB;

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    /**
     * 计算结果
     * @return 结果数据
     */
    public abstract int getResult();

}
