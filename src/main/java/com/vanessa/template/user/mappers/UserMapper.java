package com.vanessa.template.user.mappers;

import com.vanessa.template.auth.dtos.RegisterRequestDTO;
import com.vanessa.template.user.User;
import com.vanessa.template.user.dtos.UserResponseDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface UserMapper {

    @Mapping(target = "role", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    User toEntity(RegisterRequestDTO userDto);
    UserResponseDTO toResponseDTO(User user);
}
//simplifying data transformation in the user registration and response process.