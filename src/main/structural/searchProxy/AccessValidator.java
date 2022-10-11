package main.structural.searchProxy;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 14:00
 * @project DesignPattern
 * @Title AccessValidator
 * @description 认证
 */
public class AccessValidator {

    Logger logger = Logger.getLogger("AccessValidator");

    public boolean validate(){
        logger.info("2020144131汪亦涵：认证成功!");
        return true;
    }
}
