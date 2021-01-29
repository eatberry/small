package com.smallBase.craftService;

import com.github.pagehelper.PageInfo;
import com.smallBase.common.vo.BrandVO;

public interface BrandService {

    PageInfo<BrandVO> getAllBrand(Integer pageNum,Integer pageSize);
}
