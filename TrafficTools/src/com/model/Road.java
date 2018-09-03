package com.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

@Builder
@Getter
public class Road {

    @NonNull
    private final List<Automobile> inQueue;

    @NonNull
    private final List<Automobile> outQueue;

    @NonNull
    private Double speedLimit;

    private void setSpeedLimit(double newSpeedLimit) {
        speedLimit = newSpeedLimit;
    }
}
