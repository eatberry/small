package com.smallBase.craftMapper;

import com.smallBase.common.vo.BrandVO;

import java.util.List;

public interface BrandMapper {

    /**
     *  查询所有品牌信息
     * @return
     */
    List<BrandVO> getAllBrand();
}
