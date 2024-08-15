//package com.example.config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Collections;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        basePackages = "com.example.repository.product",
//        entityManagerFactoryRef = "productEntityManagerFactory",
//        transactionManagerRef = "productTransactionManager"
//)
//public class ProductDatabaseConfig {
//
//    @Bean(name = "productDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.product")
//    public HikariDataSource productDataSource() {
//        return DataSourceBuilder.create().type(HikariDataSource.class).build();
//    }
//
//    @Bean(name = "productEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean productEntityManagerFactory(
//            EntityManagerFactoryBuilder builder,
//            @Qualifier("productDataSource") DataSource productDatasource) {
//
//       return builder
//               .dataSource(productDatasource)
//               .packages("com.example.entity.product")
//              .persistenceUnit("product")
//               .build();
//
//    }
//
//    @Bean(name = "productTransactionManager")
//    public PlatformTransactionManager productTransactionManager(
//            @Qualifier("productEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
