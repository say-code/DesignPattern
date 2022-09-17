package main.principle.richterSubstitution;

/**
 * @author sayCode
 * @date 2022/9/17 15:32
 * project: DesignPattern
 * Title: CommonCustomer
 * description: 普通用户
 */
public class CommonCustomer extends Customer{
    @Override
    public String getName(){
        return "普通客户"+super.getName();
    }
}
