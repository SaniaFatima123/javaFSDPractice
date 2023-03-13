package com.example.bookms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

public class CustomMongoConfig extends AbstractMongoClientConfiguration {
    @Value("${spring.data.mongo.database}")
    private String databaseName;
    @Override
    protected String getDatabaseName() {
        return databaseName;
    }
}
