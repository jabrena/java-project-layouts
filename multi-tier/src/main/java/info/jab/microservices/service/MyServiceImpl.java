package info.jab.microservices.service;

import info.jab.microservices.persistence.UserDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public record MyServiceImpl(
        UserDetailRepository userDetailRepository,
        UserDetailDTODestinationMapper mapper) implements MyService {

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
