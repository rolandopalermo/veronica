package com.rolandopalermo.facturacion.ec.dto.v1_0;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VeronicaResponseDTO<T> {

	private boolean success;
	private T result;
	
}