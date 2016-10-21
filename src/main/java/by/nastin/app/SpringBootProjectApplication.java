package by.nastin.app;

import by.nastin.app.config.DataSourceConfig;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@SpringBootApplication
@Import(DataSourceConfig.class)
public class SpringBootProjectApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(SpringBootProjectApplication.class, args);
		HibernateEntityManagerFactory entityManagerFactory = (HibernateEntityManagerFactory) applicationContext.getBean("entityManagerFactory");
		System.out.println(entityManagerFactory.getProperties().get("hibernate.connection.datasource"));
		for (String s : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(s);
		}
	}
}
