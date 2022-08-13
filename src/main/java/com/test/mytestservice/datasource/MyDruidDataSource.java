//package com.test.mytestservice.datasource;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import com.test.mytestservice.config.DataSourceConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import java.sql.SQLException;
//
////@Component
//public class MyDruidDataSource {
//    @Autowired
//    private DataSourceConfig dataSourceConfig;
//
//    @Bean
//    public DruidDataSource DruidDataSource() {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        //数据源连接参数配置
//        druidDataSource.setDriverClassName(dataSourceConfig.getDriverClassName());
//        druidDataSource.setUrl(dataSourceConfig.getUrl());
//        druidDataSource.setUsername(dataSourceConfig.getUsername());
//        druidDataSource.setPassword(dataSourceConfig.getPassword());
//        //连接池参数设置
//        /*druidDataSource.setInitialSize(dataSourceConfig.getInitialSize());
//        druidDataSource.setMinIdle(dataSourceConfig.getMinIdle());
//        druidDataSource.setMaxActive(dataSourceConfig.getMaxActive());
//        druidDataSource.setTimeBetweenConnectErrorMillis(dataSourceConfig.getTimeBetweenEvictionRunsMillis());
//        druidDataSource.setMinEvictableIdleTimeMillis(dataSourceConfig.getMinEvictableIdleTimeMillis());
//        druidDataSource.setValidationQuery(dataSourceConfig.getValidationQuery());
//        druidDataSource.setTestWhileIdle(dataSourceConfig.getTestWhileIdle());
//        druidDataSource.setTestOnBorrow(dataSourceConfig.getTestOnBorrow());
//        druidDataSource.setTestOnReturn(dataSourceConfig.getTestOnReturn());
//        druidDataSource.setPoolPreparedStatements(dataSourceConfig.getPoolPreparedStatements());
//        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(dataSourceConfig.getMaxPoolPreparedStatementPerConnectionSize());*/
//        try {
//            druidDataSource.setFilters(dataSourceConfig.getFilters());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        druidDataSource.setConnectProperties(dataSourceConfig.getConnectionProperties());
//        return druidDataSource;
//    }
//
//    /**
//     * Druid监控servlet配置
//     */
//    /*@Bean
//    public ServletRegistrationBean statViewServlet() {
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), dataSourceConfig.getStatViewServletUrlPattern());
//        //urlPattern-访问路径设置
//        //IP配置
//        servletRegistrationBean.addInitParameter("allow", dataSourceConfig.getStatViewServletAllow());//IP白名单
//        servletRegistrationBean.addInitParameter("deny", dataSourceConfig.getStatViewServletDeny());//IP黑名单
//        //登陆账户配置
//        servletRegistrationBean.addInitParameter("loginUsername", dataSourceConfig.getStatViewServletLoginUsername());
//        servletRegistrationBean.addInitParameter("loginPassword", dataSourceConfig.getStatViewServletLoginPassword());
//        //是否允许Reset All-计数器清零操作
//        servletRegistrationBean.addInitParameter("resetEnable", dataSourceConfig.getStatViewServletResetEnable());
//        return servletRegistrationBean;
//    }*/
//
//
//    /**
//     * Druid监控过滤器配置
//     *
//     * @return
//     */
//    /*@Bean
//    public FilterRegistrationBean webStatFilter() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        //设置过滤器
//        filterRegistrationBean.addUrlPatterns(dataSourceConfig.getWebStatFilterUrlPattern());//url过滤规则
//        filterRegistrationBean.addInitParameter("enabled", dataSourceConfig.getWebStatFilterEnabled());//是否开启过滤功能
//        filterRegistrationBean.addInitParameter("exclusions", dataSourceConfig.getWebStatFilterExclusions());//忽略
//        return filterRegistrationBean;
//    }*/
//}
//
