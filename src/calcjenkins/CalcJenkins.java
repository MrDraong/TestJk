/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcjenkins;

/**
 *
 * @author charles.capiaux
 */
public class CalcJenkins {

    int ajouter(int a, int b) {
        if (b >= 0) {
            for (int i = 0; i < b; i++) {
                if (b > 0) {
                    a++;
                } else {
                    a--;
                }
            }
        } else {
            for(int i = 0; i < Math.abs(b); i++){
                a--;
            }
            
        }

        return a;
    }
//Soustraire

    int soustraire(int a, int b) {
        for (int i = 0; i < b; i++) {
            if (b > 0) {
                a--;
            } else {
                a++;
            }
        }
        return a;
    }
//Multiplier

    int multiplier(int a, int b) {
        boolean negatif = false;
        if((a < 0 && b > 0) || (a > 0 && b < 0)){
           negatif = true;
        }
        
        a = Math.abs(a);
        b = Math.abs(b);
        int res = a;
        for (int i = 1; i < b; i++) {
            for (int j = 0; j < a; j++) {
                res++;
            }
        }
        if(negatif){
            return -res;
        }
        return res;
    }
//Diviser

    public int diviser(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        
        boolean negatif = false;
        if((a < 0 && b > 0) || (a > 0 && b < 0)){
           negatif = true;
        }
        
        a = Math.abs(a);
        b = Math.abs(b);
        int res = 0;
        while (a >= b) {
            for (int i = 0; i < b; i++) {
                a--;
            }
            res = res + 1;
        }
        if(negatif){
            return -res;
        }
        return res;
    }
    
}
