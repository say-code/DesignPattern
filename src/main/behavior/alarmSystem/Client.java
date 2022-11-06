package main.behavior.alarmSystem;

import org.junit.Test;

/**
 * @author 汪亦涵
 * @date 2022/11/6 14:01
 * @project DesignPattern
 * @Title Client
 * @description 用户端
 */
public class Client {

    public static void main(String[] args) {
        ThermoSensor thermoSensor;
        thermoSensor = new ThermoSensor();

        thermoSensor.register(new CautionLight());
        thermoSensor.register(new Annunciator());
        thermoSensor.register(new ExitGate());


        thermoSensor.trigger();
    }
}
