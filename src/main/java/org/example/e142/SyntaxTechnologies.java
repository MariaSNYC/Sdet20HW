package org.example.e142;

public class SyntaxTechnologies {
    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    public SyntaxTechnologies() {
        schoolName = null;
        batch = 0;
        year = 0;
        lastDayOfClass = null;
    }

    public SyntaxTechnologies(String cSchoolName, int cBatch, int cYear, String cLastDayOfClass){
            schoolName = cSchoolName;
            batch = cBatch;
            year = cYear;
            lastDayOfClass = cLastDayOfClass;

        }
        void display () {
            System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
        }


    }

