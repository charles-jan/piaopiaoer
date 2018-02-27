package com.mrxia.piaopiaoer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

/**
 * 票票儿应用
 * @author xiazijian
 */
@EntityScan(basePackageClasses = { PiaopiaoerApplication.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class PiaopiaoerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiaopiaoerApplication.class, args);
	}
}
