package com.umeshawasthi.java9.example.http2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class SampleHTTP2 {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("www.travellingrants.com")).build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandler.asString());

        System.out.println(response.statusCode());
        System.out.println(response.body());

    }
}
