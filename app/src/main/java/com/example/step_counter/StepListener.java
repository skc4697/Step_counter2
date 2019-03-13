package com.example.step_counter;

// Will listen to step alerts
public interface StepListener {

    public void step(long timeNs);
    public void velanddis(float vel_t, float dis_t);

}
