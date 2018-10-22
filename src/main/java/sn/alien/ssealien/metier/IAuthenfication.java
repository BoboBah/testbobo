package sn.alien.ssealien.metier;

import sn.alien.ssealien.classes.Role;
import sn.alien.ssealien.classes.User;


import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface IAuthenfication {

    public User addUser(User user);

    public Role addRole(Role role);

    public User addRoleToUser(String username, String role);

    public String getUsername(HttpServletRequest httpServletRequest);

    public Map<String, Object> getLoged(HttpServletRequest httpServletRequest);


}
