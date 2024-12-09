package com.ldy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.ldy.service", "com.ldy.config", "com.ldy.mapper"})
@Import(MybatisConfig.class)
@MapperScan("com.ldy.mapper")
public class SpringConfig {
    // 移除这里的 SqlSessionFactoryBean 配置，因为已经在 MybatisConfig 中配置了
}
