package com.naren.intract.model;

import lombok.Data;

@Data
public class Customer {
	private Long customerId;
	private String customerName;
	private Demographic demographic;

}
