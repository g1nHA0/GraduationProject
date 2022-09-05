package xyz.g1nha0.lostandound;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.g1nha0.lostandound.mapper")
public class LostandoundApplication {

	public static void main(String[] args) {
		SpringApplication.run(LostandoundApplication.class, args);
	}

}
