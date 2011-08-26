package br.com.tqi.company.view;

import br.com.tqi.company.util.MessageUtil;
import br.com.tqi.company.util.WSFactory;

import br.com.tqi.company.ws.client.Address;
import br.com.tqi.company.ws.client.Company;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class SearchCompanyBean implements Serializable{

    @SuppressWarnings("compatibility:5817591550814751264")
    private static final long serialVersionUID = -7660478612018114838L;
    
    private Company company;
    private List<Company> companies;
    
    
    public SearchCompanyBean() {
    }
    
    
    public void find(ActionEvent event) {
        
        companies = WSFactory.getInstance().getCompanyServices().listCompanies(getCompany().getCnpj(), getCompany().getName());
        
    }
    
    public void remove(ActionEvent event) {
     
        WSFactory.getInstance().getCompanyServices().deleteCompany(getCompany().getId());
        
        MessageUtil.infoMessage("Empresa removida com sucesso");
        
        find(null);
    }


    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        
        if (company == null) {
            company = new Company();
        }
        return company;
    }

    public List<Company> getCompanies() {
        if (companies == null) {
            companies = new ArrayList<Company>();
        }
        return companies;
    }
    
   
}
