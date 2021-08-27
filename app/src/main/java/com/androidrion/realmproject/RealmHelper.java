package com.androidrion.realmproject;

import android.util.Log;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {

    Realm realm;

    public  RealmHelper(Realm realm){
        this.realm = realm;
    }

    public void save(final MahasiswaModel mahasiswaModel) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                if (realm != null){
                    Log.e("Created", "Database was created");
                    Number currentIdNum = realm.where(MahasiswaModel.class).max("id");
                    int nextId;
                    if (currentIdNum == null) {
                        nextId = 1;
                    } else {
                        nextId = currentIdNum.intValue() + 1;
                    }
                    mahasiswaModel.setId(nextId);
                    MahasiswaModel model = realm.copyToRealm(mahasiswaModel);
                } else {
                    Log.e("ppppp", "execute : Database not Exist");
                }
            }
        });
    }

    public List<MahasiswaModel> getAllMahasiswa(){
        RealmResults<MahasiswaModel> results = realm.where(MahasiswaModel.class).findAll();
        return results;
    }

    public void update(final Integer id, final Integer nim, final String nama) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

            }
        });
    }
}
