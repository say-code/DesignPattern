package main.behavior.alarmSystem;

import java.util.ArrayList;

/**
 * @author 汪亦涵
 * @date 2022/11/6 13:58
 * @project DesignPattern
 * @Title ThermoSensor
 * @description 被观察对象，警示发布器
 */
public class ThermoSensor {

    private ArrayList<AlarmListener> alarmListeners = new ArrayList<>();

    public void register(AlarmListener alarmListener){
        alarmListeners.add(alarmListener);
    }

    public void trigger(){
        alarmListeners.forEach(AlarmListener::alarm);
    }
}
