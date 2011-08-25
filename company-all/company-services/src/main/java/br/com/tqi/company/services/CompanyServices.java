package br.com.tqi.company.services;

import java.util.Collections;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.tqi.company.City;
import br.com.tqi.company.Company;
import br.com.tqi.company.State;

@WebService
public class CompanyServices {

	@PersistenceContext
	private EntityManager em;

	@WebMethod
	public Company addCompany(Company company) {
		em.persist(company);
		return company;
	}

	@WebMethod
	public void updateCompany(Company company) {

		em.merge(company);
	}

	@WebMethod
	public void deleteCompany(Long companyId) {
		Company c = em.find(Company.class, companyId);
		em.remove(c);
	}

	@WebMethod
	public List<Company> listCompanies(String cnpj, String name) {
		return Collections.emptyList();
	}

	@WebMethod
	public List<State> listStates() {
		return em.createQuery("select s from State s", State.class)
				.getResultList();
	}

	@WebMethod
	public List<City> listCities(State state, String prefix) {
		return em
				.createQuery(
						"select c from City c join State s where s = :state and c.name like :prefix",
						City.class).setParameter("state", state)
				.setParameter("prefix", prefix + "%").getResultList();
	}

}
