package br.com.tqi.company.view;


import br.com.tqi.company.util.CityListSelectItemAdapter;
import br.com.tqi.company.util.MessageUtil;
import br.com.tqi.company.util.StateListSelectItemAdapter;
import br.com.tqi.company.util.WSFactory;
import br.com.tqi.company.ws.client.Address;
import br.com.tqi.company.ws.client.City;
import br.com.tqi.company.ws.client.Company;
import br.com.tqi.company.ws.client.State;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;


@ManagedBean
@ViewScoped
public class CreateCompanyBean implements Serializable{
    @SuppressWarnings("compatibility:-5261577762138178271")
    private static final long serialVersionUID = -5066327959804248002L;
    

    public CreateCompanyBean() {
    }
    
    private Company company;
    
    private State state;
    
    private StateListSelectItemAdapter states;
    
    private CityListSelectItemAdapter cities;
    
    private String cityName;



    public void save(ActionEvent event) {
        
        try {
            WSFactory.getInstance().getCompanyServices().addCompany(getCompany());
            company = new Company();
            MessageUtil.infoMessage("Empresa cadastrada com sucesso.");
        } catch(Exception e) {
            MessageUtil.infoMessage("Ocorreu um problema ao cadastrar a empresa.");      
        }
        
       
    }
    
    public void update(ActionEvent event) {
        
        try {
            WSFactory.getInstance().getCompanyServices().updateCompany(getCompany());
            MessageUtil.infoMessage("Empresa atualizada com sucesso.");
        } catch(Exception e) {
            MessageUtil.infoMessage("Ocorreu um problema ao atualizar a empresa.");      
        }
        
       
    }
        

    public Company getCompany() {
        
        if (company == null) {
            company = new Company();
        }
        return company;
    }

    public StateListSelectItemAdapter getStates() {
        
        if (states == null) {
            List<br.com.tqi.company.ws.client.State> list = WSFactory.getInstance().getCompanyServices().listStates();
            states = new StateListSelectItemAdapter(list);
            
        }
        return states;
    }


    public CityListSelectItemAdapter suggestItems(javax.faces.context.FacesContext context, oracle.adf.view.rich.model.AutoSuggestUIHints hints){
                
        List<br.com.tqi.company.ws.client.City> list = WSFactory.getInstance().getCompanyServices().listCities(getState(), hints.getSubmittedValue());           
        cities = new CityListSelectItemAdapter(list);
        return cities;
        
    }

    public CityListSelectItemAdapter getCities() {
        
        List<br.com.tqi.company.ws.client.City> list = WSFactory.getInstance().getCompanyServices().listCities(getState(), getCity().getName());           
        cities = new CityListSelectItemAdapter(list);
        return cities;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        if (state == null) {
            state = new State();
        }
        return state;
    }

    public Address getAddress() {
        
        if ( getCompany().getAddress() == null ) {
            getCompany().setAddress(new Address());
        }
        
        return getCompany().getAddress();
    }
    
    public City getCity() {
        
        if (getAddress().getCity() == null) {
            getAddress().setCity(new City());
        }      
        return getAddress().getCity();
    }
}
