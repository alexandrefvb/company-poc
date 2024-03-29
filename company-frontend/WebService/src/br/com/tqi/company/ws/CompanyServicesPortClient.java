package br.com.tqi.company.ws;

import br.com.tqi.company.ws.client.Address;
import br.com.tqi.company.ws.client.City;
import br.com.tqi.company.ws.client.Company;
import br.com.tqi.company.ws.client.State;

import java.util.List;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;
// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 11g Release 2 11.1.2.0.0.6017

public class CompanyServicesPortClient {
    public static void main(String[] args) {
        CompanyServicesService companyServicesService = new CompanyServicesService();
        CompanyServices companyServices = companyServicesService.getCompanyServicesPort();
        
        State mg = null;
        List<State> states = companyServices.listStates();
        for (State state: states) {
            if (state.getAcronym().equals("MG")) {
                mg = state;
                System.out.println("estado: " + mg.getName());
                break;
            }
        }
                
        List<City> cities = companyServices.listCities(mg, "");
        City ituiutaba = cities.get(0);
        
        System.out.println("cidade: " + ituiutaba.getName());
        
        Company company = new Company();
        company.setName("empresa teste1");
        company.setCnpj("22243281000146");
        Address address = new Address();
        address.setCity(ituiutaba);
        address.setStreet("RUA JOAO QUIRINO DE MORAIS");
        address.setNumber("150");
        company.setAddress(address);
        
        companyServices.addCompany(company);
        
        List<Company> companies = companyServices.listCompanies("22243281000146", "empresa teste1");
        company = companies.get(0);
        
        company.setName("tqi consultoria");
        
        companyServices.updateCompany(company);
        
        companies = companyServices.listCompanies("22243281000146", "tqi consultoria");
        company = companies.get(0);

        
        System.out.println("empresa atualizada: " + company.getName());
        
        companyServices.deleteCompany(company.getId());
        
        companies = companyServices.listCompanies("22243281000146", "tqi consultoria");
        
        System.out.println("empresa removida: " + companies.size());



                
        
    }
}
