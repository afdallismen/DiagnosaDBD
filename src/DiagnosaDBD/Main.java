/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosaDBD;

import DiagnosaDBD.View.GuiDiagnosaDBD;

/**
 *
 * @author afdallismen
 */
public class Main {
    
    public static void main(String args[]){
        DiagnosaDBD app = new DiagnosaDBD();
        app.cInfo.setListInfo();
        app.cPertanyaan.setListPertanyaan();
        GuiDiagnosaDBD mainFrame = new GuiDiagnosaDBD(app);
        /*
        for ( int i=0; i<app.cPertanyaan.getListPertanyaan().size(); i++){
            System.out.println("---------------");
            System.out.println("id : "+app.cPertanyaan.getListPertanyaan().get(i).getId());
            System.out.println("pertanyaan : "+app.cPertanyaan.getListPertanyaan().get(i).getKuestion());
            System.out.println("Jawaban : "+app.cPertanyaan.getListPertanyaan().get(i).isJawaban());
        }
        for ( int i=0; i<app.cInfo.getListInfo().size(); i++){
            System.out.println("---------------");
            System.out.println("id : "+app.cInfo.getListInfo().get(i).getId());
            System.out.println("title : "+app.cInfo.getListInfo().get(i).getTitle());
            System.out.println("desc : "+app.cInfo.getListInfo().get(i).getDesc());
        }*/
        //mainFrame.setLookAndFeel();
        mainFrame.setVisible(true);
    }
}
