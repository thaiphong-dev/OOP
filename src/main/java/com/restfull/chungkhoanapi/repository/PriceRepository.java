package com.restfull.chungkhoanapi.repository;

import com.restfull.chungkhoanapi.model.PriceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
@Transactional
public interface PriceRepository extends JpaRepository<PriceModel, Long> {
    @Modifying
    @Query(value = "Execute sp_KhopLenhLienTuc :InputMaCoPhieu , :InputNgay , :InputLoaiGiaoDich, :InputSoLuong, :InputGiaDat", nativeQuery = true)
    public int savePrice(@Param("InputMaCoPhieu") String maCoPhieu, @Param("InputNgay") Date today, @Param("InputLoaiGiaoDich") String loaiGiaoDich, @Param("InputSoLuong") int soLuong,@Param("InputGiaDat") float giaDat );
}
