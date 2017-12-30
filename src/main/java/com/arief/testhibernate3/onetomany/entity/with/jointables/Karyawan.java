package com.arief.testhibernate3.onetomany.entity.with.jointables;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author arief
 */
@Entity
@Table(name="karyawan")
public class Karyawan implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    
    
    @Column(name="karyawan_nama")
    private String namaKaryawan;
    
    
    @Column(name="karyawan_alamat")
    private String alamatKaryawan;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pabrik_karyawan",
            joinColumns = {@JoinColumn(name = "karyawan_id")} , 
            inverseJoinColumns = {@JoinColumn(name = "pabrik_id")})
    private Pabrik pabrik;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public Pabrik getPabrik() {
        return pabrik;
    }

    public void setPabrik(Pabrik pabrik) {
        this.pabrik = pabrik;
    }

    @Override
    public String toString() {
        return "Karyawan{" + "id=" + id + ", namaKaryawan=" + namaKaryawan + ", alamatKaryawan=" + alamatKaryawan + '}';
    }
    
    
}
