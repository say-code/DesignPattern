package main.principle.richterSubstitution;

/**
 * @author sayCode
 * @date 2022/9/17 15:35
 * project: DesignPattern
 * Title: VIPCustomer
 * description: VIP客户
 */
public class VIPCustomer extends Customer{
    @Override
    public String  getName(){
        return "VIP客户"+super.getName();
    }
}
