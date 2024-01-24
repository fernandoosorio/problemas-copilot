import java.util.List;

//Autor(a):
//Horário de início (HH:mm): 
//Horário de término (HH:mm):
//Link para envio da solução : https://forms.gle/6rXNW9rFfJeoHQaS6
public class Problema58 {
/*
    O método comum recebe duas listas de inteiros.
    Retorna elementos comuns exclusivos presentes nessas duas listas.
    Por exemplo:
    >>> comum([1, 4, 3, 34, 653, 2, 5], [5, 7, 1, 5, 9, 653, 121])
    [1, 5, 653]
    >>> comum([5, 3, 2, 8], [3, 2])
    [2, 3]
 */
    
    public List<Integer> comum(List<Integer> lista1, List<Integer> lista2) {
        return List.of();
    }


    public static void main(String[] args) {
        Problema58 problema58 = new Problema58();
        System.out.println(problema58.comum(List.of(1, 4, 3, 34, 653, 2, 5), List.of(5, 7, 1, 5, 9, 653, 121)));
        System.out.println(problema58.comum(List.of(5, 3, 2, 8), List.of(3, 2)));
    }
}
