package com.umeshawasthi;

import com.umeshawasthi.profile.DatabaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootTutorialsApplication implements CommandLineRunner{

	@Autowired
    DatabaseService databaseService;

    public static void main(String[] args) {

		SpringApplication.run(SpringbootTutorialsApplication.class, args);
	}

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        databaseService.getDBConnection();
    }
}
