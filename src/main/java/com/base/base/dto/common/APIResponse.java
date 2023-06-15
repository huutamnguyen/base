package com.base.base.dto.common;

import com.base.base.enums.ApiStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse {
	private ApiStatusEnum status;
	private String message;
	private Object body;
}
