package main.behavior.alarmSystem;

/**
 * @author 汪亦涵
 * @date 2022/11/6 14:06
 * @project DesignPattern
 * @Title ExitGate
 * @description 自动门抽象类
 */
public abstract class Gate {

    public void action(){
        open();
        close();
    }

    abstract void open();

    abstract void close();
}
