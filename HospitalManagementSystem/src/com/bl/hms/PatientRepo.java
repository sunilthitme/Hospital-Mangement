package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class PatientRepo {

    List patientList = new ArrayList();

    void addPatient(Patient p)
    {
        patientList.add(p);
    }

    List getPatientList()
    {
        return  patientList;
    }
}
