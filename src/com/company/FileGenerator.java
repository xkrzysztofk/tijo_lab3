package com.company;

import java.io.IOException;
import java.util.List;

interface FileGenerator {
    void ToCsv(List<String> l) throws IOException;

}
