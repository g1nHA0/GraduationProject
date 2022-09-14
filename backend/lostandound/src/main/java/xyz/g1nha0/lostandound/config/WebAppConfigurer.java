package xyz.g1nha0.lostandound.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web项目配置类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-24 11:45
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/swiper/**").addResourceLocations("file:/Users/cuz2retr0/Desktop/GitHub/GraduationProject/pics/swiperImgs/");
        registry.addResourceHandler("/image/bigType/**").addResourceLocations("file:/Users/cuz2retr0/Desktop/GitHub/GraduationProject/pics/bigTypeImgs/");
        registry.addResourceHandler("/image/product/**").addResourceLocations("file:/Users/cuz2retr0/Desktop/GitHub/GraduationProject/pics/productImgs/");
    }
}
