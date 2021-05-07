package info.jab.microservices.application.service;

import info.jab.microservices.adapter.persistence.UserDetail;
import info.jab.microservices.service.UserDetailDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDetailDTOMapper {
    UserDetailDTO sourceToDestination(UserDetail source);
}