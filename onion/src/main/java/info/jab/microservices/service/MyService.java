package info.jab.microservices.service;

import info.jab.microservices.model.UserDetailDTO;

import java.util.List;

public interface MyService {

    UserDetailDTO getSingleDTO();
    List<UserDetailDTO> getDTOList();
}
