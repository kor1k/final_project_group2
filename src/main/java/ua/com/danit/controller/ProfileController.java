package ua.com.danit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.danit.entity.Location;
import ua.com.danit.entity.Profile;
import ua.com.danit.entity.Talent;
import ua.com.danit.repository.ProfileRepo;

import java.util.Random;

public class ProfileController {
  @Autowired
  private ProfileRepo profileRepo;

  private void createDummyData() {
    for (int i = 0; i < 100; i++) {
    }
  }
}
