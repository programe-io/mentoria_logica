package pratica02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader bfr = new BufferedReader(new FileReader("arquivo.txt"));
    }
}
