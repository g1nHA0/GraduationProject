package xyz.g1nha0.lostandound.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.g1nha0.lostandound.entity.Product;
import xyz.g1nha0.lostandound.entity.R;
import xyz.g1nha0.lostandound.service.IProductService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品Controller
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    /**
     * 查询轮播商品
     * @return
     */
    @GetMapping("/findSwiper")
    public R findSwiper(){
        List<Product> swiperProductList = productService.list(new QueryWrapper<Product>().eq("isSwiper", true).orderByAsc("swiperSort"));
        Map<String,Object> map=new HashMap<>();
        map.put("message",swiperProductList);
        return R.ok(map);
    }

    @GetMapping("/findHot")
    public R findHot(){
        Page<Product> page = new Page<>(0,8);
        Page<Product> pageProduct = productService.page(page, new QueryWrapper<Product>().eq("isHot", true).orderByAsc("hotDateTime"));
        List<Product> hotProductList =pageProduct.getRecords();
        Map<String,Object> map=new HashMap<>();
        map.put("message",hotProductList);
        return R.ok(map);
    }
}
