package com.restfull.chungkhoanapi.model;


import java.util.Date;

public class Payload {
    private String ma;
    private Date ngay;
    private Float gia;
    private Integer SL;
    private String loai;

    public Payload() {
    }

    public Payload(String ma, Date ngay, Float gia, Integer SL, String loai) {
        this.ma = ma;
        this.ngay = ngay;
        this.gia = gia;
        this.SL = SL;
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Integer getSL() {
        return SL;
    }

    public void setSL(Integer SL) {
        this.SL = SL;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
