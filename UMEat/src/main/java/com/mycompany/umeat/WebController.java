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

    @GetMapping("/paymentmethods")
    public String paymentMethods() {
        return "paymentMethods";
    }

    @GetMapping("/addcard")
    public String addCard() {
        return "addCard";
    }

    @GetMapping("/userdetails")
    public String userDetails() {
        return "userDetails";
    }

    @GetMapping("/loyaltypoint")
    public String loyaltyPoint() {
        return "loyaltyPoint";
    }

    @GetMapping("/qbistro")
    public String qbistro() {
        return "qbistro";
    }

    @GetMapping("/fkum")
    public String fkum() {
        return "fkum";
    }

    @GetMapping("/deliverytime")
    public String deliveryTime() {
        return "deliveryTime";
    }

    @GetMapping("/driversuccess")
    public String driverSuccess() {
        return "driverSuccess";
    }

    @GetMapping("/addcart")
    public String addCart() {
        return "addCart";
    }

    @GetMapping("/shippinghalfportion")
    public String shippingHalfPortion() {
        return "shippingHalfPortion";
    }

    @GetMapping("/diningtime")
    public String diningTime() {
        return "diningTime";
    }

    @GetMapping("/pickuptime")
    public String pickupTime() {
        return "pickupTime";
    }

}
