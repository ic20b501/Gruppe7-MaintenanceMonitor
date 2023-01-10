package fhtw.gruppe7maintenancemonitor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
public class Gruppe7MaintenanceMonitorController {
    String msg = "Everything works as expected";
    @GetMapping(value="/api/message", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String message(){
        return "<html>  <body style=\"background-color:green;\"><header><title>Gruppe7</title></header> " +
                "          <body><p style=\"text-align:center\">" + msg +  "</p></body>  </html>";
    }

    @GetMapping(value="/api/message/set" , produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String maintenance(@RequestParam String param){
        if((param != "") && (param != null)){
               return "<html>  <body style=\"background-color:green;\"><header><title>Gruppe7</title></header> " +
                    "          <body><p style=\"text-align:center\">" + param + " </p></body>  </html>";
        }else{
            String msgError = "Error while setting Maintenance";
            return "<html>  <body style=\"background-color:red;\"><header><title>Gruppe7</title></header> " +
                    "          <body><p style=\"text-align:center\">" + msgError +  "</p></body>  </html>";
        }
    }

    @GetMapping(value = "/api/message/reset", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String reset(){
        return "<html>  <body style=\"background-color:green;\"><header><title>Gruppe7</title></header> " +
                "          <body><p style=\"text-align:center\">" + msg +  "</p></body>  </html>";
    }
}