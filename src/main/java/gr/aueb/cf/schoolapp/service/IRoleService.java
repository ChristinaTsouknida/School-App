package gr.aueb.cf.schoolapp.service;

import gr.aueb.cf.schoolapp.dto.RoleReadOnlyDTO;
import gr.aueb.cf.schoolapp.model.Role;

import java.util.List;

public interface IRoleService {

    List<RoleReadOnlyDTO> findAllRolesSortedByName();
}
