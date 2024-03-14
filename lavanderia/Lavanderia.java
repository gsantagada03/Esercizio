import java.util.Scanner;

public class Lavanderia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String password;
        double credito;
        String nomeLogin;
        String passwordLogin;
        int lavatriciOccupate = 1;
        int panni = 0;
        double soldiSpesi = 0;
        int contatoreLavatrici = 0;

        // controlli per verificare se l'utente si è registrato correttamente

        // nome
        do {
            System.out.println("Inserisci il tuo nome");
            nome = sc.nextLine();
            if (nome.length() < 2) {
                System.out.println("Inserisci un nome valido");

            }
        } while (nome.length() < 2);

        // password
        do {
            System.out.println("Inserisci la password");
            password = sc.nextLine();
            if (password.length() < 5) {
                System.out.println("Inserisci una password con almeno 5 caratteri");
            }
        } while (password.length() < 2);

        // importo
        do {
            System.out.println("Inserisci l'importo");
            credito = sc.nextDouble();
            if (credito < 1.00) {
                System.out.println("devi inserire almeno 1 euro");
            }
        } while (credito < 1.00);

        // login
        do {
            System.out.println("inserisci nome");
            nomeLogin = sc.next();
            if (!(nomeLogin.equals(nome))) {
                System.out.println("nome errato");
            }
        } while (!(nomeLogin.equals(nome)));

        do {
            System.out.println("inserisci password");
            passwordLogin = sc.next();
            if (!(passwordLogin.equals(nome))) {
                System.out.println("password errata");
            }
        } while (!(passwordLogin.equals(password)));

        System.out.println("quanti panni vuoi caricare?");
        panni = sc.nextInt();

        // lavatrici
        for (int i = 1; i < panni; i++) {

            if (credito > 20) {
                soldiSpesi += 0.50;
                credito -= 0.50;
            } else {
                soldiSpesi += 0.50;
                credito -= 1;
            }

            if (contatoreLavatrici == 10) {
                contatoreLavatrici = 0;
                lavatriciOccupate++;
            }
            contatoreLavatrici++;

            if (credito < 1) {
                System.out.println("vuoi ricaricare 10 euro al prezzo di 8?");
                String risposta = sc.next();
                if (risposta.equals("si")) {
                    credito += 10;
                } else {
                    break;
                }
            }
        }

        System.out.println(lavatriciOccupate + " " + credito + " " + soldiSpesi);
    }
}
