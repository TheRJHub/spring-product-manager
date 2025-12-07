package com.productmanagementsystem.util;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private int statusCode;
	
	private T data;
	
	private String message;
	
	private LocalDateTime date;
}
