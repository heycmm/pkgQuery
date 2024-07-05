package cc.orcl.pkgquery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cc.orcl.pkgquery.dao")
public class PkgQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PkgQueryApplication.class, args);
    }

}
