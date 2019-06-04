package com.odm.commons.api;

import com.bnpparibas.commons.models.*;

import java.util.List;

public interface ODMInterface {

   public OdmInteractions compute(String clientId, List<Event> listEvent, List<Interaction> listInteraction, List<Field> listClientAttribute, String applicationContext);

}
