package main.principle.richterSubstitution;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 15:37
 * project: DesignPattern
 * Title: EmailSender
 * description: 发送邮件
 */
public class EmailSender {

    Logger emailSender = Logger.getLogger("EmailSender");

    /**
     * 向客户发送信息
     * @param customer 客户信息
     */
    public void send(Customer customer){
        String emailAddress = customer.getEmail();
        String customerName  = customer.getName();
        emailSender.info("2020144131汪亦涵:尊敬的"+customerName+",邮件已发送至"+emailAddress+",请注意查收！");
    }
}
