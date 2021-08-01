package com.mafei.example.bean;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userToUserDto(UserDTO userDTO);

    UserDTO userDTOToUser(User user);
}
