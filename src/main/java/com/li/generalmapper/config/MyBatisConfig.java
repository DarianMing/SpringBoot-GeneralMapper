package com.li.generalmapper.config;

import com.li.generalmapper.mapper.UserMapper;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;

import java.util.Properties;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
@AutoConfigureAfter(MybatisAutoConfiguration.class)
public class MyBatisConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer () {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.li.generalmapper.mapper");
        Properties properties = new Properties();
        properties.setProperty("mappers" , UserMapper.class.getName());
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        properties.setProperty("ORDER","BEFORE");
        properties.setProperty("logImpl" , "STDOUT_LOGGING");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
