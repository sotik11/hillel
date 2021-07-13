package com.company.lesson8.lesson.models.university;

public class KpiUniversity extends UkrainianUniversity {
    private static final String NAME = "KPI";
    private String[] faculties = new String[] {
            "It"
    };

    @Override
    public String getUniversityName() {
        return NAME;
    }

    @Override
    public String getAddress() {
        return "Vozle zooparka";
    }

    @Override
    public String[] getFaculties() {
        return faculties;
    }
}
