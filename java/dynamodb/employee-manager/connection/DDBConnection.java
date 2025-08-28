package com.dynamodb.connection;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.net.URI;

public class DDBConnection {

    private static DynamoDbClient dynamoDb;

    private DDBConnection() {
    }

    public static synchronized DynamoDbClient getConnection() {
        if (dynamoDb == null) {
            AwsBasicCredentials awsCreds = AwsBasicCredentials.create("dummy", "dummy");
            dynamoDb = DynamoDbClient.builder()
                    .endpointOverride(URI.create("http://localhost:8000"))
                    .region(Region.AP_SOUTH_1)
                    .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                    .build();
        }
        return dynamoDb;
    }

    public static void closeConnection() {
        if (dynamoDb != null) {
            dynamoDb.close();
            dynamoDb = null;
        }
    }
}
