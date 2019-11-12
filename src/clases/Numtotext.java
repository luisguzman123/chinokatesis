package clases;

import java.io.*;

public class Numtotext{
    public  String dameNumeroLetras(String n){
	n2t numero;
	int num;
	String res;
        
                    num = Integer.parseInt(n);
		numero = new n2t(num);
		res = numero.convertirLetras(num);
		
                return res;
	}	
}

