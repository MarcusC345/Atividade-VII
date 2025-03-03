import java.util.Stack;

public class OrdenarPilhaNumeros {
    public static Stack<Integer> ordenarPilha(Stack<Integer> pilha) {
        // Criar uma pilha auxiliar para armazenar os valores ordenados
        Stack<Integer> pilhaOrdenada = new Stack<>();

        // Enquanto houver elementos na pilha original
        while (!pilha.isEmpty()) {
            // Remover o topo da pilha original
            int valor = pilha.pop();

            // Transferir os valores maiores da pilha ordenada de volta para a pilha original
            while (!pilhaOrdenada.isEmpty() && pilhaOrdenada.peek() > valor) {
                pilha.push(pilhaOrdenada.pop());
            }

            // Adicionar o valor na posição correta na pilha ordenada
            pilhaOrdenada.push(valor);
        }

        // Retornar a pilha ordenada
        return pilhaOrdenada;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Stack<Integer> pilha = new Stack<>();
        pilha.push(3);
        pilha.push(1);
        pilha.push(4);
        pilha.push(2);
        pilha.push(5);

        // Ordenar a pilha
        Stack<Integer> pilhaOrdenada = ordenarPilha(pilha);

        // Exibir os valores ordenados
        System.out.println("Valores ordenados:");
        while (!pilhaOrdenada.isEmpty()) {
            System.out.println(pilhaOrdenada.pop());
        }
    }
}
