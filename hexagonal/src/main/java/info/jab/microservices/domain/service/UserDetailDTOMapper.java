package info.jab.microservices.domain.service;

import info.jab.microservices.domain.model.UserDetailDTO;
import info.jab.microservices.infrastructure.UserDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDetailDTOMapper {
    UserDetailDTO sourceToDestination(UserDetail source);
}