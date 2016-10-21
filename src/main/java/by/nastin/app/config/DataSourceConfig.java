package by.nastin.app.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


@Configuration
@EnableJpaRepositories(basePackages = "by.nastin.app.repository")
public class DataSourceConfig {

    @Value("${dataSource.hikari.driverClassName}")
    private String driver;
    @Value("${dataSource.hikari.url}")
    private String url;
    @Value("${dataSource.hikari.username}")
    private String username;
    @Value("${dataSource.hikari.password}")
    private String password;
    @Value("${hibernate.dialect}")
    private String dialect;
    @Value("${hibernate.hbm2ddl.auto}")
    private String hbm2ddlAuto;
    @Value("${datasource.hikari.maximum-pool-size}")
    private Integer poolSize;
    @Value("${datasource.hikari.pool-name}")
    private String poolName;


    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driver);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setMaximumPoolSize(poolSize);
        hikariConfig.setPoolName(poolName);
//        hikariConfig.addDataSourceProperty("dataSource.cachePrepStmts", "true");
//        hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSize", "250");
//        hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSqlLimit", "2048");
//        hikariConfig.addDataSourceProperty("dataSource.useServerPrepStmts", "true");
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }
}
