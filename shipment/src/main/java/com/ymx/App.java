package com.ymx;

import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.FBAInboundServiceMWS;
import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.FBAInboundServiceMWSClient;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        FBAInboundServiceMWSClient client = new FBAInboundServiceMWSClient("", "", "", "");
        client.getInboundGuidanceForSKU(null);
    }
}
