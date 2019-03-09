package ua.com.danit.entites;

import lombok.Data;

@Data
public class Location {
  private Long id;
  private Object owner;
  private String country;
  private String city;
}
