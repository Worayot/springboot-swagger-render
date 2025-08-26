package springboot_app.demo.model;

public class UserMapping {

    private String gatewayUser;
    private String systemUser;
    private String gatewayUserEmail;
    private String systemUserEmail;

    // Constructor
    public UserMapping(String gatewayUser, String systemUser, String gatewayUserEmail, String systemUserEmail) {
        this.gatewayUser = gatewayUser;
        this.systemUser = systemUser;
        this.gatewayUserEmail = gatewayUserEmail;
        this.systemUserEmail = systemUserEmail;
    }

    // Getters and setters
    public String getGatewayUser() { return gatewayUser; }
    public void setGatewayUser(String gatewayUser) { this.gatewayUser = gatewayUser; }

    public String getSystemUser() { return systemUser; }
    public void setSystemUser(String systemUser) { this.systemUser = systemUser; }

    public String getGatewayUserEmail() { return gatewayUserEmail; }
    public void setGatewayUserEmail(String gatewayUserEmail) { this.gatewayUserEmail = gatewayUserEmail; }

    public String getSystemUserEmail() { return systemUserEmail; }
    public void setSystemUserEmail(String systemUserEmail) { this.systemUserEmail = systemUserEmail; }
}
