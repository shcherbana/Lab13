package org.example.task3;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class CompanyInfo {
    private String name;
    private String description;
    private String logo;

    @Override
    public String toString(){
        return "Company name: " + name+", the description-> "+ description+" it's logo-> "+logo;
    }
}
