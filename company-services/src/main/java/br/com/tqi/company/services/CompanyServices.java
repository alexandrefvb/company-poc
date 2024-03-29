package br.com.tqi.company.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.tqi.company.City;
import br.com.tqi.company.Company;
import br.com.tqi.company.State;

@Stateless
@WebService
public class CompanyServices {

	@PersistenceContext
	private EntityManager em;

	private void loadCity(Company company) {
		company.getAddress()
				.setCity(
						em.createQuery(
								"select c from City c where c.name = :name and c.state = :state",
								City.class)
								.setParameter(
										"name",
										company.getAddress().getCity()
												.getName())
								.setParameter(
										"state",
										company.getAddress().getCity()
												.getState()).getSingleResult());
	}

	@WebMethod
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Company addCompany(Company company) {
		loadCity(company);
		em.persist(company);
		return company;
	}

	@WebMethod
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateCompany(Company company) {

		em.merge(company);
	}

	@WebMethod
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteCompany(Long companyId) {
		Company c = em.find(Company.class, companyId);
		em.remove(c);
	}

	@WebMethod
	public List<Company> listCompanies(String cnpj, String name) {
		if (name == null) {
			name = "";
		}
		if (cnpj == null) {
			return em
					.createQuery(
							"select c from Company c where c.name like :name",
							Company.class).setParameter("name", name + "%")
					.getResultList();
		} else {
			return em
					.createQuery(
							"select c from Company c where c.name like :name and c.cnpj = :cnpj",
							Company.class).setParameter("name", name + "%")
					.setParameter("cnpj", cnpj).getResultList();

		}
	}

	@WebMethod
	public List<State> listStates() {
		return em.createQuery("select s from State s", State.class)
				.getResultList();
	}

	@WebMethod
	public List<City> listCities(State state, String prefix) {
		if (prefix == null) {
			prefix = "";
		}
		return em
				.createQuery(
						"select c "
								+ "from City c, State s "
								+ "where s = :state and c.name like :prefix and c.state = s",
						City.class).setParameter("state", state)
				.setParameter("prefix", prefix + "%").getResultList();
	}

}
