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

    @GetMapping("/paymentfullportion")
    public String paymentfullportion() {
        return "paymentFullPortion";
    }

    @GetMapping("/chooseservice")
    public String chooseService() {
        return "chooseService";
    }

    @GetMapping("/orderselection")
    public String orderSelection() {
        return "orderSelection";
    }//x

    @GetMapping("/shippingfullportion")
    public String shippingFullPortion() {
        return "shippingFullPortion";
    }//x

    @GetMapping("/pickupfullportion")
    public String pickupFullPortion() {
        return "pickupFullPortion";
    }

    @GetMapping("/pickuphalfportion")
    public String pickupHalfPortion() {
        return "pickupHalfPortion";
    }//x

    @GetMapping("/orderconfirmed")
    public String orderConfirmed() {
        return "orderConfirmed";
    }

    @GetMapping("/ordercancelled")
    public String orderCancelled() {
        return "orderCancelled";
    }//x

    @GetMapping("/reasoncancel")
    public String reasonCancel() {
        return "reasonCancel";
    }

    @GetMapping("/emptyplate")
    public String emptyPlate() {
        return "emptyPlate";
    }
}
