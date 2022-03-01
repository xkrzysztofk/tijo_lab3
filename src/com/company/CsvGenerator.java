package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



class CsvGenerator implements FileGenerator {

    private void prettyLine(FileWriter CsvW) {
        try{
            CsvW.append("*************");
            CsvW.append("\n");
        }catch (IOException e ) {
            e.printStackTrace();
        }

    }
    @Override
    public void ToCsv(List<String> l) throws IOException
    {
        FileWriter CsvW = new FileWriter("new.csv");
        // pretty line
        prettyLine(CsvW);
        // new line + '\n'
        for(int i = 0; i < l.size(); i++)
            CsvW.append(l.get(i));
        CsvW.append("\n");
        // pretty line
        prettyLine(CsvW);
        CsvW.flush();
        CsvW.close();
    }

    public void ToPdf(List<String> l) {
        // TODO?
    }

    public void ToXml(List<String> l) {
        // TODO?
    }
}