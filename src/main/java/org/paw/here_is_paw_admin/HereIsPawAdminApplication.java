package org.paw.here_is_paw_admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class HereIsPawAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HereIsPawAdminApplication.class, args);
    }

}
