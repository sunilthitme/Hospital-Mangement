package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepo {

    private List doctorList = new ArrayList();

    void addMethod(Doctor dt)
    {
        doctorList.add(dt);
    }
    

    List getDoctorList()
    {
        return doctorList;
    }
}
