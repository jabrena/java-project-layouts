package info.jab.microservices.model.service;

import info.jab.microservices.adapters.persistence.UserDetailEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDetailDTOMapper {
    UserDetailDTO sourceToDestination(UserDetailEntity source);
}