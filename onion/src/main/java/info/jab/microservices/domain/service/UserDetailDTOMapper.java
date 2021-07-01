package info.jab.microservices.domain.service;

import info.jab.microservices.adapters.persistence.UserDetailEntity;
import info.jab.microservices.domain.model.UserDetailDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDetailDTOMapper {
    UserDetailDTO sourceToDestination(UserDetailEntity source);
}