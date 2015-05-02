/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosaDBD.Model;

/**
 *
 * @author afdallismen
 */
public class MPertanyaan {
    private int id;
    private String kuestion;
    private static final String prefix = "?";
    private boolean jawaban;

    public MPertanyaan() {
        this.jawaban = false;
    }
    
    public MPertanyaan(int id, String kuestion, boolean jawaban) {
        this.setId(id);
        this.setKuestion(kuestion);
        this.setJawaban(jawaban);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the kuestion
     */
    public String getKuestion() {
        return kuestion;
    }

    /**
     * @param kuestion the kuestion to set
     */
    public void setKuestion(String kuestion) {
        this.kuestion = kuestion+prefix;
    }
    
    /**
     * @return the jawaban
     */
    public boolean isJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(boolean jawaban) {
        this.jawaban = jawaban;
    }
    
    
}
