package xyz.g1nha0.lostandound.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.g1nha0.lostandound.entity.Product;
import xyz.g1nha0.lostandound.mapper.ProductMapper;
import xyz.g1nha0.lostandound.service.IProductService;

/**
 * 商品Service实现类
 */
@Service("productService")
public class IProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;
}
