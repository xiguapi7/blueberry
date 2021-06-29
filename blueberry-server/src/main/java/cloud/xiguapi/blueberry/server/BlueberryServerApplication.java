package cloud.xiguapi.blueberry.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BlueberryServerApplication {

    public static void main(String[] args) {
        log.info("Blueberry Server running...");
        SpringApplication.run(BlueberryServerApplication.class, args);
    }

}
