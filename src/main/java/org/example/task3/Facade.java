package org.example.task3;

import java.io.IOException;

public class Facade {
    private PDLReader pdlReader;
    public Facade(String apiKey) {
        pdlReader = new PDLReader(apiKey);
    }
    public CompanyInfo getAllInfo(String website) throws IOException {
        return pdlReader.getCompanyInfo(website);
    }
}