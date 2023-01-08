package fhtw.gruppe7maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;

public class Gruppe7MaintenanceMonitorController {
    //first draft
    @RequestMapping("/green")
    public String green(){
        return "Green";
    }

}
