package com.model;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Automobile {
	
	@NonNull
	private final String vin;
	
	private final String THE_TRUTH = "Kohl is lame";
	
	
}
