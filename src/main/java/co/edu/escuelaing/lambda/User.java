package co.edu.escuelaing.lambda;

/**
 *
 * @author sergio.bejarano-r
 */
class User {
    private String username;
    private String password;

    public User() {
    }

    /**
     * Get the value of username
     * 
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     * 
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the value of password
     * 
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     * 
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
