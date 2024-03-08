import java.util.Scanner;

public class Lavanderia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String password;
        double importo;
        String nomeLogin;
        String passwordLogin;
        int lavatriciOccupate = 0;
        int panni = 0;

        //controlli per verificare se l'utente si è registrato correttamente

        //nome

        do {
            System.out.println("Inserisci il tuo nome");
            nome = sc.nextLine();
            if (nome.length() < 2) {
                System.out.println("Inserisci un nome valido");

            }
        } while (nome.length() < 2);

        //password
        do{
            System.out.println("Inserisci la password");
            password = sc.nextLine();
            if(password.length()< 5){
                System.out.println("Inserisci una password con almeno 5 caratteri");
            }
        }while(password.length()<2);

        //importo
        do{
            System.out.println("Inserisci l'importo");
            importo = sc.nextDouble();
            if(importo < 1.00){
                System.out.println("devi inserire almeno 1 euro");
            }
        }while(importo<1.00);


        //login
        do{
            System.out.println("inserisci nome");
            nomeLogin = sc.next();
            if( !(nomeLogin.equals(nome))){
                System.out.println("nome errato");
            }


            System.out.println("inserisci password");
            passwordLogin = sc.next();
            if( !(nomeLogin.equals(nome))){
                System.out.println("nome errato");
            }

           
           

        }while(!(nomeLogin.equals(nome)) || !(passwordLogin.equals(password)));


        //blocco tariffa
        System.out.println("Inserisci quanti panni vuoi mettere a lavare");
        panni = sc.nextInt();

        for(int i = 0; i < panni; i++){
            if(panni>10){
                lavatriciOccupate++;
                System.out.println("Hai occupato " + lavatriciOccupate +  " lavatrici");
            }
        }
    }

}