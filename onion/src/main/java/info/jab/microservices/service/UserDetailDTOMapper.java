package info.jab.microservices.service;

import info.jab.microservices.model.UserDetailEntity;

import info.jab.microservices.model.UserDetailDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDetailDTOMapper {
    UserDetailDTO sourceToDestination(UserDetailEntity source);
}