import java.util.Scanner;

public class Aplicacao {

    public static Funcionario[] funcionarios = {new Programador("Isabelly", 6000), new Gerente("Eduardo", 12000)};

    public static Scanner input = new Scanner(System.in);

    public static void runUserOption(int user_answer) {
        switch(user_answer) {
            case 1:
                System.out.println("\n" + funcionarios[0].toString());
                break;
            case 2:
                System.out.println("\n" + funcionarios[1].toString());
                break;
            case 3:
                funcionarios[0].aumentaSalario();
                break;
            case 4:
                funcionarios[1].aumentaSalario();
                break;
            case 5:
                System.out.println("\nExiting the program. Good bye!");
                break;
            default:
                System.out.println("\nINVALID OPTION!");
        }
    }

    public static void interactWithUser() {
       int user_answer;
        do {
            System.out.println("\nSelect an option:\n(1) Print Data from the Programmer;\n(2) Print Data from the Manager;"+
                               "\n(3) Increase Salary from the Programmer;\n(4) Increase Salary from the Manager" +
                               "\n(5) Exit the program.\n");
            user_answer = input.nextInt();
            input.nextLine();
            runUserOption(user_answer);
        } while (user_answer != 5);
    }
    
    public static void main(String[] args) {
        interactWithUser();
    }
}