import java.util.Scanner;

public class TaskManager {

    public static final int MAX_SIZE = 100;
    private Departamento[] depts = new Departamento[MAX_SIZE];
    private int quantidade_departamentos = 0;
    private Funcionario[] funcs = new Funcionario[MAX_SIZE];
    private int quantidade_funcionarios = 0;
    
    public Scanner input = new Scanner(System.in);
    
    public void criarDepartamento() {
        int matricula;
        String nome;
        String[] messages = {"Insirar a matricula do departamento: ", "Insirar o nome do departamento", "Entrada invalida, a matricula não pode ser negativa",
                            "Entrada invalida, o nome nao pode ser null", "Vetor cheio"};
        System.out.println(messages[0]);
        matricula = input.nextInt();
        while (matricula < 0) {
            System.out.println(messages[2] + "\n" + messages[0]);
            matricula = input.nextInt();
        }
        System.out.println(messages[0]);
        nome = input.nextLine();
        while (nome.isEmpty() || nome.isBlank() || nome == null) {
            System.out.println(messages[3] + "\n" + messages[1]);
            nome = input.nextLine();
        }
        if (quantidade_departamentos >= MAX_SIZE)
        {
            System.out.println(messages[4]);
        }
        else {
            depts[quantidade_departamentos] = new Departamento(matricula, nome);
            quantidade_departamentos += 1;
        }
    }
}
