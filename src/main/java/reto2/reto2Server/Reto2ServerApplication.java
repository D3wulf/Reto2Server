package reto2.reto2Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Reto2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto2ServerApplication.class, args);
	}

}
