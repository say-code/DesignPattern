package main.behavior.alarmSystem;

import java.util.logging.Logger;

/**
 * @author 汪亦涵
 * @date 2022/11/6 14:04
 * @project DesignPattern
 * @Title Annunciator
 * @description 报警器
 */
public class Annunciator implements AlarmListener{

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void alarm() {
        logger.info("2020144131汪亦涵：报警器正在呜哇呜哇！");
    }
}
