package br.com.tqi.company.services;

import java.util.Collections;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.tqi.company.City;
import br.com.tqi.company.Company;
import br.com.tqi.company.State;

@WebService
public class CompanyServices {

	@WebMethod
	public void addCompany(Company company) {

	}

	@WebMethod
	public void updateCompany(Company company) {

	}

	@WebMethod
	public void deleteCompany(Long companyId) {

	}

	@WebMethod
	public List<Company> listCompanies(String cnpj, String name) {
		return Collections.emptyList();
	}

	@WebMethod
	public List<State> listStates() {
		return Collections.emptyList();
	}

	@WebMethod
	public List<City> listCities(State state, String prefix) {
		return Collections.emptyList();
	}

}
