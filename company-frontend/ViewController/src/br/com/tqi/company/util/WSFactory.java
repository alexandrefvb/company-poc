package br.com.tqi.company.util;

import br.com.tqi.company.ws.CompanyServices;
import br.com.tqi.company.ws.CompanyServicesService;

public class WSFactory {
    
    private static WSFactory instance;
    
    private static CompanyServicesService companyServicesService;
    
    public static WSFactory getInstance(){
        if (instance == null ){
            instance = new WSFactory();
            companyServicesService =  new CompanyServicesService();
        }
        return instance;
    }
    
    
    
    public CompanyServices getCompanyServices() {
        CompanyServices companyServices = companyServicesService.getCompanyServicesPort();
        return companyServices;
    }
    
    
}
