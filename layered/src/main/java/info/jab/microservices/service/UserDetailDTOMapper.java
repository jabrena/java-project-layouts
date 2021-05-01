package info.jab.microservices.service;

import info.jab.microservices.persistence.UserDetail;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDetailDTOMapper {
    UserDetailDTO sourceToDestination(UserDetail source);
}