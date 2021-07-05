package com.rizalhimself.latihan12.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelKontak {
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Kontak getmKontak() {
        return mKontak;
    }

    public void setmKontak(Kontak mKontak) {
        this.mKontak = mKontak;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("status") String status;
    @SerializedName("result") Kontak mKontak;
    @SerializedName("message") String message;
}
