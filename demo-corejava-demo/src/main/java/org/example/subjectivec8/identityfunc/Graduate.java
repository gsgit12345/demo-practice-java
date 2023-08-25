package org.example.subjectivec8.identityfunc;

public class Graduate {
    private StudentGraduate trader;
    private int year;
    private int value;

    public Graduate(StudentGraduate trader, int year, int value)
    {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public StudentGraduate getTrader(){
        return this.trader;
    }

    public int getYear(){
        return this.year;
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }
}


