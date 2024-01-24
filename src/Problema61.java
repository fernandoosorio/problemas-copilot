

//Autor(a):
public class Problema61 {
/* 
    colchetes é uma string de "(" e ")".
    retorna True se cada colchete de abertura tiver um colchete de fechamento correspondente.
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
