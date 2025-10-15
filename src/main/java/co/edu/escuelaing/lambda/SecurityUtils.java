package co.edu.escuelaing.lambda;

/**
 *
 * @author sergio.bejarano-r
 */
public class SecurityUtils {

    public static User login(User u) {
        System.out.println("User " + u.getUsername());
        System.out.println("Password " + u.getPassword());
        u.setPassword("");
        return u;
    }

}
