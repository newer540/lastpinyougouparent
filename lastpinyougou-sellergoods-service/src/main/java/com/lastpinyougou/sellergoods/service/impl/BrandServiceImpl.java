package com.lastpinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lastpinyougou.mapper.TbBrandMapper;
import com.lastpinyougou.sellergoods.service.BrandService;
import com.lastpinyougou.pojo.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class BrandServiceImpl  implements BrandService {
    @Autowired
    private TbBrandMapper brandMapper;
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }
}
