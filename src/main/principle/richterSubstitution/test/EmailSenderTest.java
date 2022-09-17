package main.principle.richterSubstitution.test;

import main.principle.richterSubstitution.CommonCustomer;
import main.principle.richterSubstitution.Customer;
import main.principle.richterSubstitution.EmailSender;
import main.principle.richterSubstitution.VIPCustomer;
import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/17 15:42
 * project: DesignPattern
 * Title: EmailSenderTest
 * description: 邮件发送功能测试
 */
public class EmailSenderTest {

    EmailSender emailSender = new EmailSender();

    @Test
    public void commonCustomerTest(){
        Customer customer = new CommonCustomer();
        customer.setName("汪亦涵");
        customer.setEmail("994914269@qq.com");
        emailSender.send(customer);
    }

    @Test
    public void VIPCustomerTest(){
        Customer customer = new VIPCustomer();
        customer.setName("张越");
        customer.setEmail("123456789@qq.com");
        emailSender.send(customer);
    }


}
