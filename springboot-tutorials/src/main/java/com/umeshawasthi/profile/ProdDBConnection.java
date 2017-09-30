package com.umeshawasthi.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by umesh on 7/24/17.
 */
@Service
@Profile("production")
public class ProdDBConnection implements DatabaseService {

    @Override
    public void getDBConnection() {

        System.out.println("Product DB connection establish");
    }
}
