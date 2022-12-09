package com.lagou.edu.ad.controller;


import com.lagou.edu.ad.entity.PromotionSpace;
import com.lagou.edu.ad.service.IPromotionSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author daxu
 * @since 2022-12-09
 */
@RestController
@RequestMapping("/ad/space")
public class PromotionSpaceController {

    @Autowired
    private IPromotionSpaceService promotionSpaceService;


    @RequestMapping("getAllSpace")
    public List<PromotionSpace> getAllSpace() {
        List<PromotionSpace> list = promotionSpaceService.list();
        return list;
    }


}
