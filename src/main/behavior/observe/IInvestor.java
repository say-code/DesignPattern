package main.behavior.observe;

/**
 * @author 汪亦涵
 * @date 2022/11/6 12:41
 * @project DesignPattern
 * @Title IInvestor
 * @description 订阅者抽象接口
 */
public interface IInvestor {

    void response(Stock stock);
}
