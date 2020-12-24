package com.github.niu.u.config;

import com.github.niu.u.interceptor.ApiAccessInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 3:42 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 3:42 下午
 * @updateRemark:
 * @version: 1.0
 **/
@Component
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private ApiAccessInterceptor apiAccessInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加api权限拦截器拦截所有api
        registry.addInterceptor(apiAccessInterceptor).addPathPatterns("/api/v1/**");
    }
}
