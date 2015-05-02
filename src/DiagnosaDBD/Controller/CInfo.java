/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosaDBD.Controller;

import DiagnosaDBD.Model.MInfo;
import DiagnosaDBD.Plugins.Xml;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author afdallismen
 */
public class CInfo {
    private List<MInfo> listInfo;

    public CInfo() {
        listInfo = new ArrayList<>();
    }

    
    public List<MInfo> getListInfo() {
        return listInfo;
    }

    public void setListInfo() {
        Xml x = new Xml();
        String[][] xmlListInfo = x.getInfo();
        MInfo[] info = new MInfo[xmlListInfo.length];
        for (int i=0; i<xmlListInfo.length; i++ ){
            info[i] = new MInfo(Integer.parseInt(xmlListInfo[i][0]), xmlListInfo[i][1], xmlListInfo[i][2]);
            this.listInfo.add(info[i]);
        }
    }
    
    public MInfo getInfoByTitle(String title){
        MInfo info = new MInfo();
        /*Iterator<MInfo> Iterator = listInfo.iterator();
        while (Iterator.hasNext()) {
        if (Iterator.next().getTitle().equals(title)){
        info = (MInfo)Iterator.next();
        }
        }*/
        for (MInfo listInfo1 : listInfo) {
            if(listInfo1.getTitle().equals(title)){
                info = listInfo1;
            }
        }
        return info;
    }
       
}
