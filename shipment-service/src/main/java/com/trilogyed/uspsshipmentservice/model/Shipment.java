package com.trilogyed.uspsshipmentservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "shipment")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shipmentId;
    private String name;
    private String trackingNumber;

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipment shipment = (Shipment) o;
        return getShipmentId() == shipment.getShipmentId() &&
                Objects.equals(getName(), shipment.getName()) &&
                Objects.equals(getTrackingNumber(), shipment.getTrackingNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShipmentId(), getName(), getTrackingNumber());
    }
}
