package info.jab.microservices.application.service;

import info.jab.microservices.service.UserDetailDTO;

import java.util.List;

public interface MyService {

    UserDetailDTO getSingleDTO();
    List<UserDetailDTO> getDTOList();
}
