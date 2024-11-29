package com.mycompany.umeat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "homepage";
    }

    @GetMapping("/he-she")
    public String heShe() {
        return "he-she";
    }

    @GetMapping("/driverRegistration")
    public String driverRegistration() {
        return "driverRegistration";
    }

    @GetMapping("/kk12")
    public String kk12() {
        return "kk12";
    }

    @GetMapping("/t-c")
    public String TAndC() {
        return "TAndC";
    }

    @GetMapping("/paymenthalfportion")
    public String paymenthalfportion() {
        return "paymentHalfPortion";
    }

    @GetMapping("/paymentfullportion")
    public String paymentfullportion() {
        return "paymentFullPortion";
    }

    @GetMapping("/ordercomfirm")
    public String ordercomfirm() {
        return "orderComfirm";
    }
}
