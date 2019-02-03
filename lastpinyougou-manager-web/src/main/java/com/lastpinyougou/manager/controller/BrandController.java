package com.lastpinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lastpinyougou.sellergoods.service.BrandService;
import com.lastpinyougou.pojo.TbBrand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;
    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }
    @RequestMapping("/findOne")
    public String findOne(){
        return "caonima";
    }
}
