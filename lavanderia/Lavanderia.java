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

            // se il credito è maggiore di 20, c'è lo sconto dei panni, in cui il costo è di 50 centesimi a panno
            if (credito > 20) {
                soldiSpesi += 0.50;
                credito -= 0.50;
            //se invece il credito è uguale a 20 o minore, il costo diventa 1 euro a panno
            } else {
                soldiSpesi += 1;
                credito -= 1;
            }
            
            // in questa condizione si contano le lavatrici occupate, se il contatore è uguale a 10, le lavatrici occupate aumentano
            if (contatoreLavatrici == 10) {
                contatoreLavatrici = 0;
                lavatriciOccupate++;
            }
            contatoreLavatrici++;

            //se il credito è minore di 1, si manda un messaggio in cui si chiede se si vuole ricaricare 10 euro al prezzo di 8
            if (credito < 1) {
                System.out.println("vuoi ricaricare 10 euro al prezzo di 8?");
                String risposta = sc.next();
                //se la risposta è positiva , il credito aumenta di 10
                if (risposta.equals("si")) {
                    credito += 10;
                // se la risposta è negativa, si esce dal ciclo
                } else {
                    break;
                }
            }
        }

        //resoconto finale delle lavatrici totali occupate, il credio rimanente ed i soldi spesi
        System.out.println(lavatriciOccupate + " " + credito + " " + soldiSpesi);
    }
}
