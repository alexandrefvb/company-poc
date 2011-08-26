package br.com.tqi.company.util;

import br.com.tqi.company.ws.client.State;

import java.util.ArrayList;

import java.util.List;

import javax.faces.model.SelectItem;

public class StateListSelectItemAdapter extends ArrayList<SelectItem> {

   private static final long serialVersionUID = 1399991114314258467L;

   public StateListSelectItemAdapter(List<State> states) {
       for (State s : states) {
           this.add(new SelectItem(s.getAcronym(), s.getName()));
       }
   }
}
