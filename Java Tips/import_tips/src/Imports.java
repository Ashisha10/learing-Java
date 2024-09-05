//default import
//import java.lang.*;


import java.util.ArrayList;

import static java.lang.System.out;
import java.math.BigDecimal; //<- good practise to import specific class
import static java.util.Collections.*;
//import java.util.List;

//static imports allow us to irradicate the repetition of the class name in the code, eg:


public class Imports {
    public static void main(String[] args) {
        //this is useful when the method is called multiple times
        out.println();
        sort(new ArrayList<String>());
        BigDecimal bd = null;

    }

}