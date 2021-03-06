package info.jab.microservices.service.impl;

import info.jab.microservices.model.UserDetailDTO;
import info.jab.microservices.persistence.UserDetailRepository;
import info.jab.microservices.service.MyService;
import info.jab.microservices.service.UserDetailDTOMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class MyServiceImpl implements MyService {

    private UserDetailRepository userDetailRepository;
    private UserDetailDTOMapper mapper;

    public MyServiceImpl (UserDetailRepository userDetailRepository, UserDetailDTOMapper mapper) {
        this.userDetailRepository = userDetailRepository;
        this.mapper = mapper;
    }

    @Override
    public UserDetailDTO getSingleDTO() {

        return StreamSupport.stream(userDetailRepository.findAll().spliterator(), false)
                .map(row -> mapper.sourceToDestination(row))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<UserDetailDTO> getDTOList() {

        return StreamSupport.stream(userDetailRepository.findAll().spliterator(), false)
                .map(row -> mapper.sourceToDestination(row))
                .toList();
    }
}
