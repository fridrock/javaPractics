package practic15_new.second;

import java.util.Random;

public enum ProfessionSalary {
    FRONTEND(400),
    BACKEND(500),
    DEVOPS(300),
    SEO(200);
    public final int salaryPerHour;
    ProfessionSalary(int salaryPerHour){
        this.salaryPerHour = salaryPerHour;
    }
    public static ProfessionSalary randomProfession(){
        ProfessionSalary[] salaries = values();
        return salaries[new Random().nextInt(salaries.length)];
    }
}
