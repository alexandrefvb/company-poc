package br.com.tqi.company.util;

import br.com.tqi.company.ws.client.City;

import java.util.ArrayList;

import java.util.List;

import javax.faces.model.SelectItem;

public class CityListSelectItemAdapter extends ArrayList<SelectItem> {

   private static final long serialVersionUID = 2071923358991794084L;

   public CityListSelectItemAdapter(List<City> cities) {
       for (City c : cities) {
           add(new SelectItem(c.getId(), c.getName()));
       }
   }

}
