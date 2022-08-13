//package com.test.mytestservice.config;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import java.util.Properties;
//
////@Configuration
//@PropertySource({"classpath:druid.properties"})
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class DataSourceConfig {
//    @Value("${spring.datasource.type}")
//    private String type;
//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClassName;
//    @Value("${spring.datasource.url}")
//    private String url;
//    @Value("${spring.datasource.username}")
//    private String username;
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    //连接池信息
//    private Integer initialSize;
//    private Integer minIdle;
//    private Integer maxActive;
//    private Integer maxWait;
//    private Integer timeBetweenEvictionRunsMillis;
//    private Integer minEvictableIdleTimeMillis;
//    private String validationQuery;
//    private Boolean testWhileIdle;
//    private Boolean testOnBorrow;
//    private Boolean testOnReturn;
//    private Boolean poolPreparedStatements;
//    private Integer maxPoolPreparedStatementPerConnectionSize;
//    private String filters;
//    private Properties connectionProperties;
//
//    //wrap Properties for webStatFilter and statViewServlet
//    private Properties webStatFilter;
//    private Properties statViewServlet;
//
//    private String webStatFilterEnabled;
//    private String webStatFilterUrlPattern;
//    private String webStatFilterExclusions;
//
//    private String statViewServletUrlPattern;
//    private String statViewServletAllow;
//    private String statViewServletDeny;
//    private String statViewServletResetEnable;
//    private String statViewServletLoginUsername;
//    private String statViewServletLoginPassword;
//
//    public String getWebStatFilterEnabled() {
//        return webStatFilter.getProperty("enabled");
//    }
//
//    public String getWebStatFilterUrlPattern() {
//        return webStatFilter.getProperty("url-pattern");
//    }
//
//    public String getWebStatFilterExclusions() {
//        return webStatFilter.getProperty("exclusions");
//    }
//
//    public String getStatViewServletUrlPattern() {
//        return statViewServlet.getProperty("url-pattern");
//    }
//
//    public String getStatViewServletAllow() {
//        return statViewServlet.getProperty("allow");
//    }
//
//    public String getStatViewServletDeny() {
//        return statViewServlet.getProperty("deny");
//    }
//
//    public String getStatViewServletResetEnable() {
//        return statViewServlet.getProperty("reset-enable");
//    }
//
//    public String getStatViewServletLoginUsername() {
//        return statViewServlet.getProperty("login-username");
//    }
//
//    public String getStatViewServletLoginPassword() {
//        return statViewServlet.getProperty("login-password");
//    }
//}
//
