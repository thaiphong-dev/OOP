package com.restfull.chungkhoanapi.controller;

import com.restfull.chungkhoanapi.model.Payload;
import com.restfull.chungkhoanapi.model.PriceModel;
import com.restfull.chungkhoanapi.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@RestController
@RequestMapping("/")
public class PriceController {
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private PriceRepository priceRepository;

    @GetMapping("price")
    @ResponseBody
    public List<PriceModel> getAllCK() {

        List<PriceModel> x = priceRepository.findAll();
        return x;
    }

    @PostMapping("create")
    @CrossOrigin
    public int savePrice( @RequestBody Payload priceModel) {
        return priceRepository.savePrice(priceModel.getMa(),priceModel.getNgay(), priceModel.getLoai(), priceModel.getSL(), priceModel.getGia());
    }
//    public priceRepository<> createCK (@RequestBody PriceModel priceModel){
//        StoredProcedureQuery employees = entityManager.createNamedStoredProcedureQuery("sp_KhopLenhLienTuc")
//                .setParameter("maCoPhieu", priceModel.getMaCoPhieu());
//        return new priceRepository<>(employees, HttpStatus.OK);

}
