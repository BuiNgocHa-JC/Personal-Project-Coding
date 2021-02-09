package persional.coding.dao.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserContextUtils {
    public static String username() {
        Authentication userDetails = SecurityContextHolder.getContext().getAuthentication();
        return userDetails == null ? null : userDetails.getName();
    }
}
