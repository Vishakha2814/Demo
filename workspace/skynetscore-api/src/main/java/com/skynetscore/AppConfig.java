package com.skynetscore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import javax.sql.DataSource;
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSource;

@Configuration
@EnableTransactionManagement
public class AppConfig {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setPackagesToScan("com.skynetscore");
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		hibernateProperties.put("hibernate.show_sql", false);
		hibernateProperties.put("hibernate.hbm2ddl.auto", "validate");

		hibernateProperties.put("hibernate.c3p0.min_size", "5");
		hibernateProperties.put("hibernate.c3p0.max_size", "500");
		hibernateProperties.put("hibernate.c3p0.timeout", "20000");
		hibernateProperties.put("hibernate.c3p0.max_statements", "50");
		hibernateProperties.put("hibernate.c3p0.idle_test_period", "3000");
		sessionFactoryBean.setHibernateProperties(hibernateProperties);

		return sessionFactoryBean;
	}

	@Bean
	public DataSource getDataSource() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/skynetscore";
		String username = "root";
		String password = "vishakha@123";
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

}
