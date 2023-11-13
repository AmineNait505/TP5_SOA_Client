package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;

public class ClientJWS {
    public static void main(String[] args) {
        BanqueService banqueservice = new BanqueServiceService().getBanqueServicePort();
        System.out.println(banqueservice.conversion(3.3));
    }
}
