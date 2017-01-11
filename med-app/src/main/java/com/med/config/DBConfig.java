package com.med.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author: Administrator
 * @date : 2017/1/5 0005
 * @Description:
 */
@Configuration
//@ConfigurationProperties(locations = {"db.properties"})
public class DBConfig {
//    @Value("${db.driverClassName}")
//    private String driverName;
//
//    @Value("${db.url}")
//    private String url;
//
//    @Value("${db.username}")
//    private String username;
//
//    @Value("${db.password}")
//    private String password;
//
//    @Value("${db.initialSize}")
//    private int initialSize;
//
//    @Value("${db.maxTotal}")
//    private int maxTotal;
//
//    @Value("${db.maxIdle}")
//    private int maxIdle;
//
//    @Value("${db.minIdle}")
//    private int minIdle;
//
//    @Value("${db.maxWaitMillis}")
//    private long maxWaitMillis;
//
//    @Value("${mybatis.mybatis.config-location}")
//    private String myBaitsConfig;
//
//    @Value("${mybatis.mapper-locations}")
//    private String mapperConfigs;


    private String driverName = "com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://42.96.144.163:3306/springdemo";
    private String username="root";
    private String password="meddkim";

    private int initialSize=2;

    private int maxTotal=20;

    private int maxIdle=5;

    private int minIdle=1;

    private long maxWaitMillis=60000;


//    @Value("${mybatis.type-aliases-package}")

    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxTotal(maxTotal);
        dataSource.setMaxIdle(maxIdle);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxWaitMillis(maxWaitMillis);

        return dataSource;
    }

    @Bean
//    @ConditionalOnMissingBean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
//        bean.setConfigLocation(myBaitsConfig);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource configXml = resolver.getResource("classpath:mybatis/mybatis-config.xml");
        Resource[] mapperXmls = resolver.getResources("classpath:mybatis/mapper/*.xml");
        bean.setConfigLocation(configXml);
        bean.setMapperLocations(mapperXmls);

        try {
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
//    @ConditionalOnMissingBean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
