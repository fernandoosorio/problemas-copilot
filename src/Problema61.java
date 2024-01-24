
//HORÁRIO DE INÍCIO (HH:mm): 
//HORÁRIO DE TÉRMINO (HH:mm):
//Link para envio da solução : https://forms.gle/6rXNW9rFfJeoHQaS6
public class Problema61 {
/* 
    O método correctBracketing retorna True se cada colchete de abertura tiver um colchete de fechamento correspondente.
    Colchetes é uma string de "(" e ")".
    Por exemplo:
    >>> correctBracketing("(")
    Falso
    >>> correctBracketing("()")
    Verdadeiro
    >>> correctBracketing("(()())")
    Verdadeiro
    >>> correctBracketing(")(()")
    Falso
*/
    public boolean correctBracketing(String brackets) {
        
        return false;
    }

    public static void main(String[] args) {
        Problema61 problema61 = new Problema61();
        System.out.println(problema61.correctBracketing("("));
        System.out.println(problema61.correctBracketing("()"));
        System.out.println(problema61.correctBracketing("(()())"));
        System.out.println(problema61.correctBracketing(")(()"));
    }

    
}
