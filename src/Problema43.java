import java.util.List;


//Autor(a):
public class Problema43 {
/* 
    O método pairsSumToZero recebe uma lista de inteiros como entrada.
    retorna True se houver dois elementos na lista que a soma seja zero e False caso contrário.
    >>> pairsSumToZero([1, 3, 5, 0])
    Falso
    >>> pairsSumToZero([1, 3, -2, 1])
    Falso
    >>> pairsSumToZero([1, 2, 3, 7])
    Falso
    >>> pairsSumToZero([2, 4, -5, 3, 5, 7])
    Verdadeiro
    >>> pairsSumToZero([1])
    Falso
*/
    public boolean pairsSumToZero(List<Integer> numbers) {
        return false;
    }
    public static void main(String[] args) {
        Problema43 problema43 = new Problema43();
        System.out.println(problema43.pairsSumToZero(List.of(1, 3, 5, 0)));
        System.out.println(problema43.pairsSumToZero(List.of(1, 3, -2, 1)));
        System.out.println(problema43.pairsSumToZero(List.of(1, 2, 3, 7)));
        System.out.println(problema43.pairsSumToZero(List.of(2, 4, -5, 3, 5, 7)));
        System.out.println(problema43.pairsSumToZero(List.of(1)));
    }
    
}
