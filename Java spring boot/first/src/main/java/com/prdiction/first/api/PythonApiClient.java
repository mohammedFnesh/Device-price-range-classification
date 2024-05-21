package com.prdiction.first.api;


import com.prdiction.first.Models.Device;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PythonApiClient {
    private final WebClient webClient;

    public PythonApiClient( ) {
        this.webClient = WebClient.builder().baseUrl("http://127.0.0.1:8000").build();
    }

    public Mono<Double> predictDevicePrice(Device device) {
        return webClient.post()
                .uri("/predict")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(device))
                .retrieve()
                .bodyToMono(PredictionResponse.class)
                .map(PredictionResponse::getPrediction);
    }
}