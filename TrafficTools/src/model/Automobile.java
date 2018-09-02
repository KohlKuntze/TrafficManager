package model;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Automobile {

    @NonNull
    private final String vehicleID;
}
