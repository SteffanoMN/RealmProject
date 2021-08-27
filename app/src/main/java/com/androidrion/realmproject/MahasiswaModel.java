package com.androidrion.realmproject;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class MahasiswaModel extends RealmObject {

    @PrimaryKey
    private Integer id;
    private Integer nim;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private String nama;
}
