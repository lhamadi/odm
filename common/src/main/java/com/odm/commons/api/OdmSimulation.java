package com.odm.commons.api;

import com.bnpparibas.commons.models.*;

import java.util.Arrays;
import java.util.List;

public class OdmSimulation implements ODMInterface {
    @Override
    public OdmInteractions compute(String clientId, List<Event> listEvent, List<Interaction> listInteraction, List<Field> listClientAttribute, String applicationContext) {

        OdmInteractions odm = new OdmInteractions();
        switch (clientId) {
            case "1":
                switch (applicationContext) {
                    case "rebond":
                        odm.setClientId("1");
                        odm.setInteractionId(Arrays.asList("prise de rdv", "PEL", "ES LIBRE"));
                        odm.setContext("contextualise");
                        break;
                    case "monRdvClient":
                        odm.setClientId("1");
                        odm.setInteractionId(Arrays.asList("ES LIBRE", "PEL"));
                        odm.setContext("defaut");
                        break;
                    default:
                        odm = new OdmInteractions("1", Arrays.asList(), "defaut");
                        break;
                }
                break;
            case "2":
                switch (applicationContext) {
                    case "rebond":
                        odm.setClientId("2");
                        odm.setInteractionId(Arrays.asList("KYC", "MOBILEO"));
                        odm.setContext("defaut");
                        break;
                    case "monRdvClient":
                        odm.setClientId("2");
                        odm.setInteractionId(Arrays.asList("prise de rdv", "KYC", "MOBILEO"));
                        odm.setContext("contextualise");
                        break;
                    default:
                        odm = new OdmInteractions("2", Arrays.asList(), "defaut");
                        break;

                }
                break;
            default:
                odm = new OdmInteractions("000", Arrays.asList(), "defaut");
                break;
        }
        return odm;
    }
}
