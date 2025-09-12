package com;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.net.URI;

public class DayThirtyFourDynamoDBConnection {
    private static DynamoDbClient dynamoDb;
    private DayThirtyFourDynamoDBConnection() {}
    public static synchronized DynamoDbClient getInstance() {
        if (dynamoDb == null) {
            dynamoDb = DynamoDbClient.builder()
                    .endpointOverride(URI.create("http://localhost:8000"))
                    .region(Region.AP_SOUTH_1)
                    .credentialsProvider(StaticCredentialsProvider.create(
                            AwsBasicCredentials.create("dummy","dummy")
                    ))
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

