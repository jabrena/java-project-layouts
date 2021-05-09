package info.jab.microservices.domain.service;

import info.jab.microservices.domain.model.UserDetailDTO;
import info.jab.microservices.infrastructure.UserDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public record MyServiceImpl(
        UserDetailRepository userDetailRepository,
        UserDetailDTOMapper mapper) implements MyService {

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
