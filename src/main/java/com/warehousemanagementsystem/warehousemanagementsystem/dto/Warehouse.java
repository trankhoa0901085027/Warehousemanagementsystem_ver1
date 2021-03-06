package com.warehousemanagementsystem.warehousemanagementsystem.dto;

public class Warehouse {
    private String warehouseid;


    private String storeid;

    private String storename;


    private String name;


    private String address;


    private String status;

    private String datetimecreate;

    public Warehouse() {
    }
    public Warehouse(String warehouseid, String name, String address) {
        this.warehouseid = warehouseid;
        this.name = name;
        this.address = address;
    }
    public Warehouse(String warehouseid, String storeid, String storename, String name, String address, String status, String datetimecreate) {
        this.warehouseid = warehouseid;
        this.storeid = storeid;
        this.storename = storename;
        this.name = name;
        this.address = address;
        this.status = status;
        this.datetimecreate = datetimecreate;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDatetimecreate() {
        return datetimecreate;
    }

    public void setDatetimecreate(String datetimecreate) {
        this.datetimecreate = datetimecreate;
    }
}
