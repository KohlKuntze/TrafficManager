package com.model;

import lombok.Builder;
import lombok.NonNull;

import java.util.List;

@Builder
public class Road {

    @NonNull
    private final List<Automobile> inQueue;

    @NonNull
    private final List<Automobile> outQueue;

}
