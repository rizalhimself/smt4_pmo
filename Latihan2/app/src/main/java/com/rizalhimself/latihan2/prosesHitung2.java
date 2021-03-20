package com.rizalhimself.latihan2;

public class prosesHitung2 extends prosesHitung{
    private double bil1, bil2;

    /*Konstruktor dari Abstract class prosesHitung*/
    public prosesHitung2() {
    }

    public prosesHitung2(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    /*Setter dan Getter*/
    public double getBil1() {
        return bil1;
    }

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

    /*Implementasi kongkrit method bilangan pada kelas abstract prosesHitung*/
    @Override
    double getTambah() {
        return bil1+bil2;
    }

    @Override
    double getKurang() {
        return bil1-bil2;
    }

    @Override
    double getBagi() {
        return bil1/bil2;
    }

    @Override
    double getKali() {
        return bil1*bil2;
    }
}
