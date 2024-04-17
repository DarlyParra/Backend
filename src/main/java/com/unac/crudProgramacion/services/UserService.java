package com.unac.crudProgramacion.services;

import com.unac.crudProgramacion.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO ); //lo que va a devolver el metodo el lo que esta antes del nombre de la funcion (saveUser)
    List<UserDTO> getUsers();
}
