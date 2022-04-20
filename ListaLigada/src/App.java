public class App {
    public static void main(String[] args) throws Exception {
       IStack<String> nomes = new Stack<>();
       nomes.push("Lilo");
       nomes.push("João");
       nomes.push("José");
       System.out.println(nomes.toString());
       var nome = nomes.pop();
       System.out.println("Você acabou de retirar o nome: " + nome);
       System.out.println(nomes.toString());

       System.out.println();
       
       IStack<Curso> cursos = new Stack<>();
       cursos.push(new Curso(1, "Sistemas"));
       cursos.push(new Curso(2, "Pedagogia"));
       cursos.push(new Curso(3, "Direito"));
       System.out.println(cursos);
       var curso = cursos.pop();
       System.out.println("Você acabou de retirar o curso: " + curso.getNome());
       System.out.println(cursos);

       System.out.println();

       IQueue<String> clientes = new Queue<>();
       clientes.enqueue("Baudu");
       clientes.enqueue("Lilo");
       clientes.enqueue("Jorge");
       clientes.enqueue("João");
       clientes.enqueue("Harry Potter");

       System.out.println(clientes);
       
       var cliente = clientes.peek();
       clientes.dequeue();

       System.out.println("Vocë acabou de retirar da fila " + cliente);

       System.out.println(clientes);       
    }
}
