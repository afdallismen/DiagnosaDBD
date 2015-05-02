/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosaDBD.Controller;

import DiagnosaDBD.Model.MPertanyaan;

/**
 *
 * @author afdallismen
 */
public class CPertanyaan {
    private MPertanyaan mP;
    private String[][] kT;
    /**
     * @return the MP
     */
    public MPertanyaan getmP() {
        return mP;
    }

    /**
     * @param mP the mP to set
     */
    public void setmP(MPertanyaan mP) {
        this.mP = mP;
    }    

    /**
     * @return the kT
     */
    public String[][] getkT() {
        return kT;
    }

    /**
     * @param kT the kT to set
     */
    public void setkT() {
        this.kT = kT;
    }
}
