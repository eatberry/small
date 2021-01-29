package com.smallBase.craftService.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smallBase.common.vo.BrandVO;
import com.smallBase.craftMapper.BrandMapper;
import com.smallBase.craftService.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    Logger logger = LoggerFactory.getLogger(BrandService.class);

    @Autowired(required = false)
    private BrandMapper brandMapper;


    public PageInfo<BrandVO> getAllBrand(Integer pageNum,Integer pageSize) {
        // 静态分页
        PageHelper.startPage(pageNum,pageSize);
        // 集合数据
        List<BrandVO> brandlList = null;
        try {
            brandlList = brandMapper.getAllBrand();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return new PageInfo<BrandVO>(brandlList);
    }
}
