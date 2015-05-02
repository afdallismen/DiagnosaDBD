/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosaDBD;

import DiagnosaDBD.Controller.CInfo;
import DiagnosaDBD.Controller.CPertanyaan;

/**
 *
 * @author afdallismen
 */
public class DiagnosaDBD {
    public CInfo cInfo;
    public CPertanyaan cPertanyaan;

    public DiagnosaDBD() {
        this.cInfo = new CInfo();
        this.cPertanyaan = new CPertanyaan();
    }
}
