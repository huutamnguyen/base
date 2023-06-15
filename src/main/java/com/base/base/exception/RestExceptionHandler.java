package com.base.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.base.base.dto.common.APIResponse;
import com.base.base.enums.ApiStatusEnum;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

	/**
	 * Handle BadRequestException
	 *
	 * @param ex BadRequestException
	 * @return ApiResponse
	 */
	@ExceptionHandler({ BadRequestException.class })
	public ResponseEntity<APIResponse> handleBadRequest(BadRequestException ex) {
		logger.error(ex.getMessage());
		return new ResponseEntity<>(new APIResponse(com.base.base.enums.ApiStatusEnum.ERROR, ex.getMessage(), null),
				HttpStatus.BAD_REQUEST);
	}

	/**
	 * Handle InternalServerErrorException
	 *
	 * @param ex Exception
	 * @return ApiResponse
	 */
	@ExceptionHandler({ InternalServerErrorException.class })
	public ResponseEntity<APIResponse> handleInternalServerError(Exception ex) {
		logger.error(ex.getMessage());
		return new ResponseEntity<>(new APIResponse(ApiStatusEnum.ERROR, ex.getMessage(), null),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * Handle NotFoundException
	 *
	 * @param ex Exception
	 * @return ApiResponse
	 */
	@ExceptionHandler({ NotFoundException.class })
	public ResponseEntity<APIResponse> handleNotFoundException(Exception ex) {
		logger.error(ex.getMessage());
		return new ResponseEntity<>(new APIResponse(ApiStatusEnum.ERROR, ex.getMessage(), null),
				HttpStatus.NOT_FOUND);
	}

	/**
	 * Handle UnAuthorizationException
	 *
	 * @param ex UnAuthorizationException
	 * @return ApiResponse
	 */
	@ExceptionHandler({ UnAuthorizationException.class })
	public ResponseEntity<APIResponse> handleUnAuthorization(UnAuthorizationException ex) {
		logger.error(ex.getMessage());
		return new ResponseEntity<>(new APIResponse(ApiStatusEnum.ERROR, ex.getMessage(), null),
				HttpStatus.UNAUTHORIZED);
	}
}
