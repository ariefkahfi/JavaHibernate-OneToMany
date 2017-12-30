package com.arief.testhibernate3.onetomany.entity.with.jointables;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author arief
 */
@Entity
@Table(name="pabrik")
public class Pabrik implements Serializable {
    
    @Id
    @Column(name="pabrik_id")
    private String pabrikId;
    
    @Column(name="pabrik_nama")
    private String pabrikNama;
    
    @Column(name="pabrik_lokasi")
    private String pabrikLokasi;
    
    @OneToMany(orphanRemoval = true,mappedBy = "pabrik")
    private List<Karyawan> karyawanList;

    public String getPabrikId() {
        return pabrikId;
    }

    public void setPabrikId(String pabrikId) {
        this.pabrikId = pabrikId;
    }

    public String getPabrikNama() {
        return pabrikNama;
    }

    public void setPabrikNama(String pabrikNama) {
        this.pabrikNama = pabrikNama;
    }

    public String getPabrikLokasi() {
        return pabrikLokasi;
    }

    public void setPabrikLokasi(String pabrikLokasi) {
        this.pabrikLokasi = pabrikLokasi;
    }

    public List<Karyawan> getKaryawanList() {
        return karyawanList;
    }

    public void setKaryawanList(List<Karyawan> karyawanList) {
        this.karyawanList = karyawanList;
    }

    @Override
    public String toString() {
        return "Pabrik{" + "pabrikId=" + pabrikId + ", pabrikNama=" + pabrikNama + ", pabrikLokasi=" + pabrikLokasi + '}';
    }
    
    
    
}
