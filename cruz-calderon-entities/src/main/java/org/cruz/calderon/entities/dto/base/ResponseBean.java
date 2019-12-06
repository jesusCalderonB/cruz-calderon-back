package org.cruz.calderon.entities.dto.base;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * This Bean is and interface used to interact with anothers sub systems.
 * @author jesusc
 * 27 nov. 2019
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseBean implements Serializable {
  /** Serial Version UID */
  private static final long serialVersionUID = 1L;
  /** Response success flag */
  private boolean success;
  /** Response code */
  private Integer code;
  /** Response Payload */
  private transient Object payload;
  /** Response messages */
  private List<String> messages;
 
}
