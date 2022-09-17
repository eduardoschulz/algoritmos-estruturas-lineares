package cinema;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Menu {
    Scanner input = new Scanner(System.in);
    Sala sala;
    Mapa mapa;
    Opcoes opcoes;


    public Menu(Sala sala){
       this.sala = sala;
       mapa = new Mapa(sala);
       opcoes = new Opcoes(sala);
    }


    public String inputS(String s){
        System.out.printf("%s", s);
        String recv;
        try{
            recv = input.nextLine();
        }catch (InputMismatchException e){
            input.reset();
            input.next();
            return " ";
        }
        return recv;
    }
    public String inputS(){
        String recv;
        try{
            recv = input.nextLine();
        }catch (InputMismatchException e){
            input.reset();
            input.next();
            return " ";
        }
        return recv;
    }
    public int inputInt(String s){
        System.out.printf("%s", s);
        int recv;
        try{
           recv = input.nextInt();
        }catch (InputMismatchException e){
           input.reset();
           System.out.printf("\nOpção Inválida! Digite outro número: ");
           input.next();
           return -1;
        }
        return recv;
    }
    public int inputInt(){
        int recv;
        try{
            recv = input.nextInt();
        }catch (InputMismatchException e){
            input.reset();
            System.out.printf("\nOpção Inválida! Digite outro número: ");
            input.next();
            return -1;
        }
        return recv;
    }


    public void escolha(){
    int recv = inputInt("\n>");
        switch (recv){
            case 1:
                mapa.listarCadeiras();
                break;
            case 2:
                mapa.cadeirasVagas();
                break;
            case 3:
                opcoes.locarCadeira(((char) inputInt("\nFileira:")) - 'a',inputInt("\nColuna: "), inputS("\nNome do Cliente: "));
                break;
            case 4:
                opcoes.cancelarCadeira(((char) inputInt("\nFileira:")),inputInt("\nColuna: "));
                break;
            default:
                System.out.printf("Opção Inválida!");
        }
    }
    public void fazMenu(){
        System.out.printf("\n\n\tLaboratório 2 - Cinema");
        System.out.printf("\nOpções");
        System.out.printf("\n(1)- Mapa da Sala\n(2)- Cadeiras Vagas\n(3)- Cadeira Ocupadas");
        System.out.printf("\n(4)- Locar Cadeira\n(5)- Cancelar Reserva");
        System.out.printf("\n(6)- Sair");
    }


}
