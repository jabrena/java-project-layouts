package info.jab.microservices.model.service;

import java.util.List;

public interface MyService {

    UserDetailDTO getSingleDTO();
    List<UserDetailDTO> getDTOList();
}
