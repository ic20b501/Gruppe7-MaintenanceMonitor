package fhtw.gruppe7maintenancemonitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Gruppe7MaintenanceMonitorTest { // Junit Tests

    @Test
    void defaultString() {

        Gruppe7MaintenanceMonitorController controller = new Gruppe7MaintenanceMonitorController();
        String msg = "Everything works as expected";

        var result = controller.message();

        // A - Assert
        assertEquals("<html>  <body style=\"background-color:green;\"><header><title>Gruppe7</title></header> " +
                "          <body><p style=\"text-align:center\">" + msg +  "</p></body>  </html>", result);
    }
    @Test
    void emptyString() {

        Gruppe7MaintenanceMonitorController controller = new Gruppe7MaintenanceMonitorController();
        String msgError = "Error while setting Maintenance";

        var result = controller.maintenance("");

        // A - Assert
        assertEquals("<html>  <body style=\"background-color:red;\"><header><title>Gruppe7</title></header> " +
                "          <body><p style=\"text-align:center\">" + msgError +  "</p></body>  </html>", result);
    }

    @Test
    void notemptyString() {

        Gruppe7MaintenanceMonitorController controller = new Gruppe7MaintenanceMonitorController();
        String message = "Maintenance until 6:00";

        var result = controller.maintenance(message);

        // A - Assert
        assertEquals("<html>  <body style=\"background-color:green;\"><header><title>Gruppe7</title></header> " +
                "          <body><p style=\"text-align:center\">" + message + " </p></body>  </html>", result);
    }

}