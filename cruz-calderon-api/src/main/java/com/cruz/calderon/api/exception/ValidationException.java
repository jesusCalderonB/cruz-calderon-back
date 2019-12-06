package com.cruz.calderon.api.exception;

import com.cruz.calderon.api.enums.ResponseCodes;

/**
 * @author jesusc
 * 5 dic. 2019
 *
 */
public class ValidationException extends Exception{

/**
   * 
   */
  private static final long serialVersionUID = 1L;

  @SuppressWarnings("unused")
  private final Integer code;

  public ValidationException(final ResponseCodes code) {
    super();
    this.code = code != null ? code.getCode() : null;
  }

  public ValidationException(final ResponseCodes code, final String msg) {
    super(msg);
    this.code = code != null ? code.getCode() : null;
  }

  public ValidationException(final ResponseCodes code, final String msg, final Throwable throwable) {
    super(msg, throwable);
    this.code = code != null ? code.getCode() : null;
  }
	  
}
