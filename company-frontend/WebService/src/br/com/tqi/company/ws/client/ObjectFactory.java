
package br.com.tqi.company.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.tqi.company.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCompanyResponse_QNAME = new QName("http://services.company.tqi.com.br/", "addCompanyResponse");
    private final static QName _UpdateCompanyResponse_QNAME = new QName("http://services.company.tqi.com.br/", "updateCompanyResponse");
    private final static QName _DeleteCompany_QNAME = new QName("http://services.company.tqi.com.br/", "deleteCompany");
    private final static QName _ListCompanies_QNAME = new QName("http://services.company.tqi.com.br/", "listCompanies");
    private final static QName _ListCitiesResponse_QNAME = new QName("http://services.company.tqi.com.br/", "listCitiesResponse");
    private final static QName _ListStatesResponse_QNAME = new QName("http://services.company.tqi.com.br/", "listStatesResponse");
    private final static QName _ListCities_QNAME = new QName("http://services.company.tqi.com.br/", "listCities");
    private final static QName _ListCompaniesResponse_QNAME = new QName("http://services.company.tqi.com.br/", "listCompaniesResponse");
    private final static QName _AddCompany_QNAME = new QName("http://services.company.tqi.com.br/", "addCompany");
    private final static QName _UpdateCompany_QNAME = new QName("http://services.company.tqi.com.br/", "updateCompany");
    private final static QName _ListStates_QNAME = new QName("http://services.company.tqi.com.br/", "listStates");
    private final static QName _DeleteCompanyResponse_QNAME = new QName("http://services.company.tqi.com.br/", "deleteCompanyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.tqi.company.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCompany }
     * 
     */
    public UpdateCompany createUpdateCompany() {
        return new UpdateCompany();
    }

    /**
     * Create an instance of {@link ListStates }
     * 
     */
    public ListStates createListStates() {
        return new ListStates();
    }

    /**
     * Create an instance of {@link DeleteCompanyResponse }
     * 
     */
    public DeleteCompanyResponse createDeleteCompanyResponse() {
        return new DeleteCompanyResponse();
    }

    /**
     * Create an instance of {@link AddCompany }
     * 
     */
    public AddCompany createAddCompany() {
        return new AddCompany();
    }

    /**
     * Create an instance of {@link ListStatesResponse }
     * 
     */
    public ListStatesResponse createListStatesResponse() {
        return new ListStatesResponse();
    }

    /**
     * Create an instance of {@link ListCitiesResponse }
     * 
     */
    public ListCitiesResponse createListCitiesResponse() {
        return new ListCitiesResponse();
    }

    /**
     * Create an instance of {@link ListCompaniesResponse }
     * 
     */
    public ListCompaniesResponse createListCompaniesResponse() {
        return new ListCompaniesResponse();
    }

    /**
     * Create an instance of {@link ListCities }
     * 
     */
    public ListCities createListCities() {
        return new ListCities();
    }

    /**
     * Create an instance of {@link UpdateCompanyResponse }
     * 
     */
    public UpdateCompanyResponse createUpdateCompanyResponse() {
        return new UpdateCompanyResponse();
    }

    /**
     * Create an instance of {@link AddCompanyResponse }
     * 
     */
    public AddCompanyResponse createAddCompanyResponse() {
        return new AddCompanyResponse();
    }

    /**
     * Create an instance of {@link ListCompanies }
     * 
     */
    public ListCompanies createListCompanies() {
        return new ListCompanies();
    }

    /**
     * Create an instance of {@link DeleteCompany }
     * 
     */
    public DeleteCompany createDeleteCompany() {
        return new DeleteCompany();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "addCompanyResponse")
    public JAXBElement<AddCompanyResponse> createAddCompanyResponse(AddCompanyResponse value) {
        return new JAXBElement<AddCompanyResponse>(_AddCompanyResponse_QNAME, AddCompanyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "updateCompanyResponse")
    public JAXBElement<UpdateCompanyResponse> createUpdateCompanyResponse(UpdateCompanyResponse value) {
        return new JAXBElement<UpdateCompanyResponse>(_UpdateCompanyResponse_QNAME, UpdateCompanyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "deleteCompany")
    public JAXBElement<DeleteCompany> createDeleteCompany(DeleteCompany value) {
        return new JAXBElement<DeleteCompany>(_DeleteCompany_QNAME, DeleteCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompanies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "listCompanies")
    public JAXBElement<ListCompanies> createListCompanies(ListCompanies value) {
        return new JAXBElement<ListCompanies>(_ListCompanies_QNAME, ListCompanies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "listCitiesResponse")
    public JAXBElement<ListCitiesResponse> createListCitiesResponse(ListCitiesResponse value) {
        return new JAXBElement<ListCitiesResponse>(_ListCitiesResponse_QNAME, ListCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "listStatesResponse")
    public JAXBElement<ListStatesResponse> createListStatesResponse(ListStatesResponse value) {
        return new JAXBElement<ListStatesResponse>(_ListStatesResponse_QNAME, ListStatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "listCities")
    public JAXBElement<ListCities> createListCities(ListCities value) {
        return new JAXBElement<ListCities>(_ListCities_QNAME, ListCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompaniesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "listCompaniesResponse")
    public JAXBElement<ListCompaniesResponse> createListCompaniesResponse(ListCompaniesResponse value) {
        return new JAXBElement<ListCompaniesResponse>(_ListCompaniesResponse_QNAME, ListCompaniesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "addCompany")
    public JAXBElement<AddCompany> createAddCompany(AddCompany value) {
        return new JAXBElement<AddCompany>(_AddCompany_QNAME, AddCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "updateCompany")
    public JAXBElement<UpdateCompany> createUpdateCompany(UpdateCompany value) {
        return new JAXBElement<UpdateCompany>(_UpdateCompany_QNAME, UpdateCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "listStates")
    public JAXBElement<ListStates> createListStates(ListStates value) {
        return new JAXBElement<ListStates>(_ListStates_QNAME, ListStates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.company.tqi.com.br/", name = "deleteCompanyResponse")
    public JAXBElement<DeleteCompanyResponse> createDeleteCompanyResponse(DeleteCompanyResponse value) {
        return new JAXBElement<DeleteCompanyResponse>(_DeleteCompanyResponse_QNAME, DeleteCompanyResponse.class, null, value);
    }

}
