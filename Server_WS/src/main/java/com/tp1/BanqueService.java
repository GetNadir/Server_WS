package com.tp1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName="BanqueWS")
public class BanqueService {

        @WebMethod(operationName="ConversionEuroToDh")
        public double conversion(@WebParam(name="montant")double mt){

            return mt*11;

        }

        @WebMethod
        public String test(){ return "Test"; }
        @WebMethod
        public Compte getCompte(){ return new Compte (1,6000); }
        @WebMethod
        public List<Compte> getComptes(){
            List<Compte> cptes=new ArrayList<Compte>();
            cptes.add (new Compte (1,6000));
            cptes.add (new Compte (2,76000));
            cptes.add (new Compte (3,9000));
            return cptes;

}
}
