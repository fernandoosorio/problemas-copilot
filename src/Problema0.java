import java.util.List;

//HORÁRIO DE INÍCIO (HH:mm): 
//HORÁRIO DE TÉRMINO (HH:mm):
//Link para envio da solução : https://forms.gle/6rXNW9rFfJeoHQaS6
public class Problema0 {

    /*
    O método hasCloseElements Verifica se, na lista de números fornecida, 
    existem dois números mais próximos um do outro do que limiar dado.
    Por exemplo:
    >>> hasCloseElements([1.0, 2.0, 3.0], 0.5)
    false
    >>> hasCloseElements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    true

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
