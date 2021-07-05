package com.rizalhimself.latihan12.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetKontak {
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @SerializedName("status") String status;

    public List<Kontak> getListDataKontak() {
        return listDataKontak;
    }

    public void setListDataKontak(List<Kontak> listDataKontak) {
        this.listDataKontak = listDataKontak;
    }

    @SerializedName("result") List<Kontak> listDataKontak;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("message") String message;


}
