package com.example.Jan05_MultipleDBConn.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.autoconfigure.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "getMysqlLocalContainerEntityManagerFactoryBean",
transactionManagerRef = "getMysqlPlatformTransactionManager",
basePackages = "com.example.Jan05_MultipleDBConn.mysqlRepo")
public class MysqlConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.mysql.datasource")
    public DataSourceProperties getMysqlDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    public DataSource getMysqlDataSource(@Qualifier("getMysqlDataSourceProperties") DataSourceProperties dataSourceProperties){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(dataSourceProperties.getUrl());
        driverManagerDataSource.setUsername(dataSourceProperties.getUsername());
        driverManagerDataSource.setPassword(dataSourceProperties.getPassword());
        driverManagerDataSource.setDriverClassName(dataSourceProperties.getDriverClassName());

        return driverManagerDataSource;
    }

    @Bean
    public JpaVendorAdapter getMysqlJpaVendorAdapter(){
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setShowSql(true);

        return jpaVendorAdapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean getMysqlLocalContainerEntityManagerFactoryBean(@Qualifier("getMysqlDataSource") DataSource dataSource, @Qualifier("getMysqlJpaVendorAdapter") JpaVendorAdapter jpaVendorAdapter){

        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource);
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        localContainerEntityManagerFactoryBean.setPackagesToScan("com.example.Jan05_MultipleDBConn.mysqlEntity");

        return localContainerEntityManagerFactoryBean;
    }

    @Bean
    public PlatformTransactionManager getMysqlPlatformTransactionManager(@Qualifier("getMysqlLocalContainerEntityManagerFactoryBean") LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean){
        assert localContainerEntityManagerFactoryBean.getObject() != null;

        return new JpaTransactionManager(localContainerEntityManagerFactoryBean.getObject());
    }
}
