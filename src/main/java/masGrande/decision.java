
package masGrande;

public class decision {
    public static String CalculoMasGrandeQue (double A, double B){
        String R;
           if(A>B){
            R = ("A es mayor que B: " + A + " > "+B);
        } else if(A==B) {
            R = ("A es igual a B: " + A + " = "+B);
        } else {
            R = ("A es menor que B: " + A + " < "+B);
        }
        return R;
         
    }
}
