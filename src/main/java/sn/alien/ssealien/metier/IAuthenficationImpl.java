package sn.alien.ssealien.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Service;
import sn.alien.ssealien.classes.Role;
import sn.alien.ssealien.classes.User;
import sn.alien.ssealien.dao.RoleRepository;
import sn.alien.ssealien.dao.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IAuthenficationImpl implements IAuthenfication {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User addRoleToUser(String username, String role) {
        User u = userRepository.getOne(username);

        Role r = roleRepository.getOne(role);

        u.getRoles().add(r);

        userRepository.save(u);

        return u;
    }

    @Override
    public String getUsername(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();

        SecurityContext securityContext = (SecurityContext) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");

        String username = securityContext.getAuthentication().getName();

        return username;
    }

    @Override
    public Map<String, Object> getLoged(HttpServletRequest httpServletRequest) {

        HttpSession httpSession = httpServletRequest.getSession();

        SecurityContext securityContext = (SecurityContext) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");

        String username = securityContext.getAuthentication().getName();

        List<String> roles = new ArrayList<>();

        for (GrantedAuthority ga : securityContext.getAuthentication().getAuthorities())

        {
            roles.add(ga.getAuthority());


        }

        Map<String, Object> params = new HashMap<>();

        params.put("username", username);

        params.put("roles", roles);

        return params;

    }
}
