package com.PassioneCourier.group2.Entity.tool;

import java.io.Serializable;

public class Device implements Serializable {

    //instance variables
    private int device_ID;
    private String type;

    private Device(){}

    //constructor
    private Device(DeviceBuilder builder) {
        this.device_ID = builder.device_ID;
        this.type = builder.type;

    }

    //getters
    public int getDevice_ID() {
        return device_ID;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Device{" +
                "device_ID=" + device_ID +
                ", type='" + type + '\'' +
                '}';
    }

    public void submitLog() {

    }


    //builder
    public static class DeviceBuilder {

        //instances
        private int device_ID;
        private String type;

        public DeviceBuilder setDeviceID(int devID) {
            this.device_ID = devID;
            return this;
        }

        public DeviceBuilder setDeviceType(String typ) {
            this.type = typ;
            return this;
        }

        public DeviceBuilder() {

        }


        public DeviceBuilder(int devID, String typ) {
            this.device_ID = devID;
            this.type = typ;
        }

        public DeviceBuilder copy(Device myDevice) {
            this.device_ID = myDevice.device_ID;
            this.type = myDevice.type;
            return this;
        }

        public Device build() {
            return new Device(this);
        }
    }
}