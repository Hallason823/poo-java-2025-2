public class Main {
    public static void main(String[] args) {
        Departamento my_department = new Departamento(0, "RH");
        Funcionario my_worker = new Funcionario(0, "Marcio Bueno", my_department);
        System.out.println(my_department.getCodigo());
        System.out.println(my_department.getNome());
        System.out.println(my_department.toString());
        System.out.println(my_worker.toString());
    }
}
