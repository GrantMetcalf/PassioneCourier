package com.PassioneCourier.group2.Entity.unlabeled;

import java.time.LocalDate;

public class CourierHistory {

    private char name;
    private int from_location_ID, to_location_ID, driverID, helperID, days, product_id;
    private LocalDate dispatchTime, deliverTime;
    private float price;

    private CourierHistory(Builder builder) {
        this.name = builder.name;
        this.from_location_ID = builder.from_location_ID;
        this.to_location_ID = builder.to_location_ID;
        this.driverID = builder.driverID;
        this.helperID = builder.helperID;
        this.days = builder.days;
        this.product_id = builder.product_id;
        this.dispatchTime = builder.dispatchTime;
        this.deliverTime = builder.deliverTime;
        this.price = builder.price;
    }

    public char getName() {
        return name;
    }

    public int getFrom_location_ID() {
        return from_location_ID;
    }

    public int getTo_location_ID() {
        return to_location_ID;
    }

    public int getDriverID() {
        return driverID;
    }

    public int getHelperID() {
        return helperID;
    }

    public int getDays() {
        return days;
    }

    public int getProduct_id() {
        return product_id;
    }

    public LocalDate getDispatchTime() {
        return dispatchTime;
    }

    public LocalDate getDeliverTime() {
        return deliverTime;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CourierHistory{" +
                "name=" + name +
                ", from_location_ID=" + from_location_ID +
                ", to_location_ID=" + to_location_ID +
                ", driverID=" + driverID +
                ", helperID=" + helperID +
                ", days=" + days +
                ", product_id=" + product_id +
                ", dispatchTime=" + dispatchTime +
                ", deliverTime=" + deliverTime +
                ", price=" + price +
                '}';
    }

    public static class Builder {

        private char name;
        private int from_location_ID, to_location_ID, driverID, helperID, days, product_id;
        private LocalDate dispatchTime, deliverTime;
        private float price;

        public Builder setName(char name) {
            this.name = name;
            return this;
        }

        public Builder setFrom_location_ID(int from_location_ID) {
            this.from_location_ID = from_location_ID;
            return this;
        }

        public Builder setTo_location_ID(int to_location_ID) {
            this.to_location_ID = to_location_ID;
            return this;
        }

        public Builder setDriverID(int driverID) {
            this.driverID = driverID;
            return this;
        }

        public Builder setHelperID(int helperID) {
            this.helperID = helperID;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder setProduct_id(int product_id) {
            this.product_id = product_id;
            return this;
        }

        public Builder setDispatchTime(LocalDate dispatchTime) {
            this.dispatchTime = dispatchTime;
            return this;
        }

        public Builder setDeliverTime(LocalDate deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }

        public Builder setPrice(float price) {
            this.price = price;
            return this;
        }

        public Builder copy(CourierHistory courierHistory) {
            this.name = courierHistory.name;
            this.from_location_ID = courierHistory.from_location_ID;
            this.to_location_ID = courierHistory.to_location_ID;
            this.driverID = courierHistory.driverID;
            this.helperID = courierHistory.helperID;
            this.days = courierHistory.days;
            this.product_id = courierHistory.product_id;
            this.dispatchTime = courierHistory.dispatchTime;
            this.deliverTime = courierHistory.deliverTime;
            this.price = courierHistory.price;
            return this;
        }

        public CourierHistory build() {
            return new CourierHistory(this);
        }
    }
}
