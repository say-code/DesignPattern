package main.behavior.alarmSystem;

import java.util.logging.Logger;

/**
 * @author 汪亦涵
 * @date 2022/11/6 14:02
 * @project DesignPattern
 * @Title CautionLight
 * @description 报警灯
 */
public class CautionLight implements AlarmListener{

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void alarm() {
        logger.info("2020144131汪亦涵：警示灯闪烁开启！");
    }
}
