package com.prdiction.first.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Device  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      int  id;
      int ram;
      int battery_power;
        int blue;
         int clock_speed   ;
            int dual_sim;
    int four_g;
    int   int_memory;
    int  m_dep;;
    int        mobile_wt;
    int n_cores;
    int    pc;
    int px_height;
    int      px_width;
    int  sc_h;
    int        sc_w  ;
    int talk_time;
        int    three_g;
    int     touch_screen;
    int wifi;

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getBattery_power() {
        return battery_power;
    }

    public void setBattery_power(int battery_power) {
        this.battery_power = battery_power;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getFour_g() {
        return four_g;
    }

    public void setFour_g(int four_g) {
        this.four_g = four_g;
    }

    public int getClock_speed() {
        return clock_speed;
    }

    public void setClock_speed(int clock_speed) {
        this.clock_speed = clock_speed;
    }

    public int getDual_sim() {
        return dual_sim;
    }

    public void setDual_sim(int dual_sim) {
        this.dual_sim = dual_sim;
    }

    public int getInt_memory() {
        return int_memory;
    }

    public void setInt_memory(int int_memory) {
        this.int_memory = int_memory;
    }

    public int getM_dep() {
        return m_dep;
    }

    public void setM_dep(int m_dep) {
        this.m_dep = m_dep;
    }

    public int getN_cores() {
        return n_cores;
    }

    public void setN_cores(int n_cores) {
        this.n_cores = n_cores;
    }

    public int getMobile_wt() {
        return mobile_wt;
    }

    public void setMobile_wt(int mobile_wt) {
        this.mobile_wt = mobile_wt;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getPx_height() {
        return px_height;
    }

    public void setPx_height(int px_height) {
        this.px_height = px_height;
    }

    public int getPx_width() {
        return px_width;
    }

    public void setPx_width(int px_width) {
        this.px_width = px_width;
    }

    public int getSc_h() {
        return sc_h;
    }

    public void setSc_h(int sc_h) {
        this.sc_h = sc_h;
    }

    public int getSc_w() {
        return sc_w;
    }

    public void setSc_w(int sc_w) {
        this.sc_w = sc_w;
    }

    public int getTalk_time() {
        return talk_time;
    }

    public void setTalk_time(int talk_time) {
        this.talk_time = talk_time;
    }

    public int getThree_g() {
        return three_g;
    }

    public void setThree_g(int three_g) {
        this.three_g = three_g;
    }

    public int getTouch_screen() {
        return touch_screen;
    }

    public void setTouch_screen(int touch_screen) {
        this.touch_screen = touch_screen;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }
}
