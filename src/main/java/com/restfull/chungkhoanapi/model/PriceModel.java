package com.restfull.chungkhoanapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;


@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "BangGiaTrucTuyen")

public class PriceModel {

    private int id;
    private String maCoPhieu;
    private String giaMua3;
    private String giaMua2;
    private String giaMua1;
    private String SLmua3;
    private String SLmua2;
    private String SLmua1;
    private String giaBan3;
    private String giaBan2;
    private String giaBan1;
    private String SLban3;
    private String SLban2;
    private String SLban1;
    private String giaKhop;
    private String SLKhop;
    private String tongSo;

    public PriceModel() {
    }

    public PriceModel(int id, String maCoPhieu, String giaMua3, String giaMua2, String giaMua1, String SLmua3, String SLmua2, String SLmua1, String giaBan3, String giaBan2, String giaBan1, String SLban3, String SLban2, String SLban1, String giaKhop, String SLKhop, String tongSo) {
        this.id = id;
        this.maCoPhieu = maCoPhieu;
        this.giaMua3 = giaMua3;
        this.SLmua3 = SLmua3;
        this.giaMua2 = giaMua2;
        this.SLmua2 = SLmua2;
        this.giaMua1 = giaMua1;
        this.SLmua1 = SLmua1;
        this.giaBan3 = giaBan3;
        this.SLban3 = SLban3;
        this.giaBan2 = giaBan2;
        this.SLban2 = SLban2;
        this.giaBan1 = giaBan1;
        this.SLban1 = SLban1;
        this.giaKhop = giaKhop;
        this.SLKhop = SLKhop;
        this.tongSo = tongSo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "GiaKhop", nullable = true)
    public String getGiaKhop() {
        return giaKhop;
    }
    public void setGiaKhop(String GiaKhop) {
        this.giaKhop = GiaKhop;
    }

    @Column(name = "SoLuongKhop", nullable = true)
    public String getSLKhop() {
        return SLKhop;
    }
    public void setSLKhop(String SoLuongKhop) {
        this.SLKhop = SoLuongKhop;
    }

    @Column(name = "TongSo", nullable = true)
    public String getTongSo() {
        return tongSo;
    }
    public void setTongSo(String TongSo) {
        this.tongSo = TongSo;
    }
    @Column(name = "MaCoPhieu", nullable = true)
    public String getMaCoPhieu() {
        return maCoPhieu;
    }
    public void setMaCoPhieu(String MaCoPhieu) {
        this.maCoPhieu = MaCoPhieu;
    }

    @Column(name = "GiaMua3", nullable = true)
    public String getGiaMua3() {
        return giaMua3;
    }
    public void setGiaMua3(String GiaMua3) {
            this.giaMua3 = GiaMua3;
    }

    @Column(name = "SoLuongMua3", nullable = true)
    public String getSLmua3() {
        return SLmua3;
    }
    public void setSLmua3(String SoLuongMua3) {
    this.SLmua3 = SoLuongMua3;
    }

    @Column(name = "GiaMua2", nullable = true)
    public String getGiaMua2() {
        return giaMua2;
    }
    public void setGiaMua2(String GiaMua2) {
        this.giaMua2 = GiaMua2;
    }

    @Column(name = "SoLuongMua2", nullable = true)
    public String getSLmua2() {
        return SLmua2;
    }
    public void setSLmua2(String SoLuongMua2) {
        this.SLmua2 = SoLuongMua2;
    }

    @Column(name = "GiaMua1", nullable = true)
    public String getGiaMua1() {
        return giaMua1;
    }
    public void setGiaMua1(String GiaMua1) {
        this.giaMua1 = GiaMua1;
    }

    @Column(name = "SoLuongMua1", nullable = true)
    public String getSLmua1() {
        return SLmua1;
    }

    public void setSLmua1(String SoLuongMua1) {
            this.SLmua1 = SoLuongMua1;
    }

    @Column(name = "GiaBan1", nullable = true)
    public String getGiaBan1() {
        return giaBan1;
    }
    public void setGiaBan1(String GiaBan1) {
        this.giaBan1 = GiaBan1;
    }

    @Column(name = "SoLuongBan1", nullable = true)
    public String getSLban1() {
        return SLban1;
    }

    public void setSLban1(String SoLuongBan1) {
        this.SLban1 = SoLuongBan1;
    }

    @Column(name = "GiaBan2", nullable = true)
    public String getGiaBan2() {
        return giaBan2;
    }
    public void setGiaBan2(String GiaBan2) {
        this.giaBan2 = GiaBan2;
    }

    @Column(name = "SoLuongBan2", nullable = true)
    public String getSLban2() {
        return SLban2;
    }

    public void setSLban2(String SoLuongBan2) {
        this.SLban2 = SoLuongBan2;
    }

    @Column(name = "GiaBan3", nullable = true)
    public String getGiaBan3() {
        return giaBan3;
    }
    public void setGiaBan3(String GiaBan3) {
        this.giaBan3 = GiaBan3;
    }

    @Column(name = "SoLuongBan3", nullable = true)
    public String getSLban3() {
        return SLban3;
    }

    public void setSLban3(String SoLuongBan3) {
        this.SLban3 = SoLuongBan3;
    }


//    @Override
//    public String toString() {
//        return "Price [id=" + id + ", MaCoPhieu=" + maCoPhieu + ", GiaMua3=" + giaMua3 + ", SoLuongMua3=" + SLmua3 + ", GiaMua2=" + giaMua2 + ", SoLuongMua2=" + SLmua2 + ", GiaMua1=" + giaMua1 + ", SoLuongMua1=" + SLmua1 + ", GiaBan1=" + giaBan1 + ", SoLuongBan1=" + SLban1 + ", GiaBan2=" + giaBan2 + ", SoLuongBan2=" + SLban2 + ", GiaBan3=" + giaBan3 + ", SoLuongBan3=" + SLban3  + ", TongSo=" + tongSo
//                + "]";
//    }
}
