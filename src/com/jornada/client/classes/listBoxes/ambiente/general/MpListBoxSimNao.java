package com.jornada.client.classes.listBoxes.ambiente.general;

import com.jornada.client.classes.listBoxes.MpSelection;
import com.jornada.shared.classes.Turno;


public class MpListBoxSimNao extends MpSelection {
    
    Turno turno;
    
    public MpListBoxSimNao(){
        
        addItem(txtConstants.geralSim(),"Sim");
        addItem(txtConstants.geralNao(),"Não");
        
    }
    
}