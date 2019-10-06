package ar.com.batalla.naval.dto;

import java.io.Serializable;
import java.util.Date;

public class GameDto implements Serializable {
  private Long id;
  private Date creationDate;


  public GameDto(  ) {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }
}
