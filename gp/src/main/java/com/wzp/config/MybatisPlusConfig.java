package com.wzp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:wzp
 * @Description:MybatisPlus配置类
 * @Date:Created in 10:46 2020/1/20
 * @Version:1.0
 */
@Configuration
@MapperScan(value={"com.wzp.modules.**.mapper*"})
public class MybatisPlusConfig {
    /**
    *@Description 分页拦截器
    *@Date 14:07 2020/1/20
    *@Param []
    *@return com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
    **/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        // 设置sql的limit为无限制，默认是500
        return new PaginationInterceptor().setLimit(-1);
    }
}
