package com.cruz.calderon.api.enums;

import lombok.Getter;

/**
 * @author jesusc
 * 5 dic. 2019
 *
 */
@Getter
public enum ResponseCodes {
  /** CODE FOR SUCCESS REQUEST */
  CODE_SUCCESS(0),
  /** CODE FOR BUSINESS ERROR */
  CODE_BUSINESS_ERROR(101),
  /** CODE FOR INTERNAL SERVER ERROR */
  CODE_ERROR(500);

  private final Integer code;

  /**
   * @param code
   */
  private ResponseCodes(Integer code) {
    this.code = code;
  }
}
