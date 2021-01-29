package com.smallBase.craftWeb;

import com.github.pagehelper.PageInfo;
import com.smallBase.common.vo.BrandVO;
import com.smallBase.craftService.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/brand")
public class BrandWeb {

    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public PageInfo<BrandVO> list(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize",required = false,defaultValue = "10") Integer pageSize){
        return brandService.getAllBrand(pageNum, pageSize);
    }
}
