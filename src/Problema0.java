import java.util.List;

//Autor(a):
public class Problema0 {
/*
    Verifique se, na lista de números fornecida, existem dois números mais próximos um do outro do que
    limiar dado.
    >>> hasCloseElements([1.0, 2.0, 3.0], 0.5)
    Falso
    >>> hasCloseElements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    Verdadeiro
    >>> hasCloseElements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.1) 

*/
    public boolean hasCloseElements(List<Double> numbers, double threshold) {
        return false;
    }

    public static void main(String[] args) {
        Problema0 problema0 = new Problema0();
        System.out.println(problema0.hasCloseElements(List.of(1.0, 2.0, 3.0), 0.5));
        System.out.println(problema0.hasCloseElements(List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3));
    }
    
}
