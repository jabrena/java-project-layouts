package info.jab.microservices.domain.service;

import info.jab.microservices.domain.model.UserDetailDTO;

import java.util.List;

public interface MyService {

    UserDetailDTO getSingleDTO();
    List<UserDetailDTO> getDTOList();
}
