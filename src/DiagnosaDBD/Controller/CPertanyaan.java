/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosaDBD.Controller;

import DiagnosaDBD.Model.MPertanyaan;
import DiagnosaDBD.Plugins.Xml;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afdallismen
 */
public class CPertanyaan {
    private List<MPertanyaan> listPertanyaan;

    public CPertanyaan() {
        this.listPertanyaan = new ArrayList<>();
    }
    
    

    public List<MPertanyaan> getListPertanyaan() {
        return listPertanyaan;
    }

    public void setListPertanyaan() {
        Xml x = new Xml();
        String[][] xmlListPertanyaan = x.getPertanyaan();
        MPertanyaan[] pertanyaan = new MPertanyaan[xmlListPertanyaan.length];
        for (int i=0; i<xmlListPertanyaan.length; i++ ){
            pertanyaan[i] = new MPertanyaan(Integer.parseInt(
                    xmlListPertanyaan[i][0]), xmlListPertanyaan[i][1], false);
            this.listPertanyaan.add(pertanyaan[i]);
        }
    }     

    public boolean getResult() {
        if (listPertanyaan.get(0).isJawaban()){
            int countTrue = 0;
            for (MPertanyaan listPertanyaan1 : listPertanyaan) {
                if (listPertanyaan1.isJawaban()) {
                    countTrue++;
                }               
            }
            return countTrue >= 3;
        } else {
            return false;
        }      
    }
}
