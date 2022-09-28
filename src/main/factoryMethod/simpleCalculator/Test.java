package main.factoryMethod.simpleCalculator;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/28 14:58
 * project: DesignPattern
 * Title: Test
 * description: 计算器测试
 */
public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Test");
        int result;
        Operation opl = Calculator.createOperation('+');
        opl.setNumberA(10);
        opl.setNumberB(20);
        result = opl.getResult();
        logger.info("计算结果是"+result);
    }
}
