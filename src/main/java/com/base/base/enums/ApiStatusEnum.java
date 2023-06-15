package com.base.base.enums;

public enum ApiStatusEnum {
	SUCCESS("SUCCESS"), ERROR("FAIL");

	private String status;

	ApiStatusEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
