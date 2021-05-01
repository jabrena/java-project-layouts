package info.jab.microservices.service;

import java.util.List;

public interface MyService {

    UserDetailDTO getSingleDTO();
    List<UserDetailDTO> getDTOList();
}
