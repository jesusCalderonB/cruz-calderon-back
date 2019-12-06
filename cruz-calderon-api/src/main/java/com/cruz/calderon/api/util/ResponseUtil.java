package com.cruz.calderon.api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.cruz.calderon.entities.dto.base.ResponseBean;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jesusc
 * 27 nov. 2019
 *
 */
@Slf4j
@Component
public class ResponseUtil {
	
	  /**
	   * Creates a success response
	   * @param payload
	   * @param messages
	   * @return
	   */
	  public ResponseBean successResponse(Object payload, String... messages) {
	    return new ResponseBean(Boolean.TRUE,Constants.CODE_SUCCESS, payload, createMessages(messages));
	  }
	  
	 /**
	   * 
	   * @param messages
	   * @return
	   */
	  public  ResponseBean createFailResponse(String...messages) {
	    return new ResponseBean(Boolean.FALSE,Constants.CODE_ERROR, null, createMessages(messages));
	  }

	  /**
	   * Create an error response with custom code
	   * @param code
	   * @param ex
	   * @param messages
	   * @return
	   */
	  public ResponseBean errorResponse(Integer code, Throwable ex, String...messages) {
	    log.error("Error al realizar la petici\u00f3n", ex);
	    return new ResponseBean(Boolean.FALSE, code, null, createMessages(messages));
	  }
	  
	  /**
	   * Creates a business error response with respectively code
	   * @param messages
	   * @return
	   */
	  public ResponseBean businessErrorResponse(String... messages) {
	    return new ResponseBean(Boolean.FALSE,Constants.CODE_BUSINESS_ERROR, null, createMessages(messages));
	  }
	  
	  /**
	   * Create list of messagess
	   * @param messages
	   * @return
	   */
	  private List<String> createMessages(String... messages) {
	    return messages != null ? Arrays.asList(messages) : new ArrayList<>();
	  }
	  
}
