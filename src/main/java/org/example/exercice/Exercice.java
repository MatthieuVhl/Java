package org.example.exercice;

//


//    public static void getNombre(){
//        int nombre;
//        System.out.println("choisi un nombre" );
//        Scanner n = new Scanner(System.in);
//        nombre = n.nextInt();
//
//        System.out.println(nombre*nombre);
//
//
//    }
//    public static void getPrenom(){
//        String name;
//
//        System.out.println("quelle est ton prénom ?");
//        Scanner sc = new Scanner(System.in);
//        name = sc.next();
//        System.out.println("Bonjour" + name);
//
//    }
//
//    public static void getUtilisateur(){
//        int number;
//        System.out.println("choisi un nombre");
//        Scanner nombre = new Scanner(System.in);
//        number = nombre.nextInt();
//        if (number > 0){
//            System.out.println("le chiffre est positif");
//        } else {
//            System.out.println("le chiffre est négatif");
//        }
//    }
//
//
//
//    public static void getComparer(){
//        int number1;
//        int number2;
//        System.out.println("choisi un nombre");
//        Scanner nombre1 = new Scanner(System.in);
//        number1 = nombre1.nextInt();
//        System.out.println("choisi un  deuxieme nombre");
//        Scanner nombre2 = new Scanner(System.in);
//        number2 = nombre2.nextInt();
//        if(number1 > 0 & number2 > 0){
//            System.out.println(" le nombre "+ number1 +"et le nombrex"+number2 +" sont positifs");
//        } else{
//            System.out.println(" le nombre "+ number1 +" et le nombre "+number2 +" sont négatifs");
//        }
//    }
//
//    public static void getOrder(){
//        int nbr;
//        String tmp;
//        Scanner number = new Scanner(System.in);
//        System.out.print("Entrez le nombre de noms que vous voulez saisir : ");
//        nbr = number.nextInt();
//
//        String noms[] = new String[nbr];
//        Scanner name = new Scanner(System.in);
//        System.out.println("Entrez la liste des noms:");
//
//        for(int i=0; i < nbr; i++)
//        {
//            noms[i] = name.nextLine();
//        }
//        for (int i=0; i < nbr; i++)
//        {
//            for (int j=i+1; j < nbr; j++)
//            {
//                if (noms[i].compareTo(noms[j]) > 0)
//                {
//                    tmp = noms[i];
//                    noms[i] = noms[j];
//                    noms[j] = tmp;
//                }
//            }
//        }
//        System.out.print("Voici la liste de noms dans l'ordre alphabétique : ");
//        for (int i=0; i < nbr-1; i++)
//        {
//            System.out.print(noms[i] + ",");
//        }
//        System.out.print(noms[nbr - 1]);
//    }
//
//    public static void getComparer2(){
//        int number1;
//
//        System.out.println("choisi un nombre");
//        Scanner nombre1 = new Scanner(System.in);
//        number1 = nombre1.nextInt();
//
//        if(number1 == 0 ){
//            System.out.println("le chiffre "+ number1 +" est null");
//        } else if(number1 > 0) {
//            System.out.println(" le chiffre "+ number1  +" est positif");
//        } else{
//            System.out.println(" le chiffre "+ number1 + " est négatif");
//        }
//    }
//
//
//    public static void getChoix(){
//        int number;
//
//        System.out.println("choisi un nombre entre 1 et 3");
//        Scanner nombre = new Scanner(System.in);
//        number = nombre.nextInt();
//
//
//
//        while (1 < number && number > 3){
//            System.out.println("ton nombre n'est pas compris entre 1 et 3 recommence");
//            number = nombre.nextInt();
//        }
//    }
//
//    public static void getPhrase(){
//        Scanner sc = new Scanner(System.in);
//
//        String phrase ;
//        int i, nombre ;
//        int mot ;
//
//        System.out.print("Saisissez une phrase : ");
//        phrase = sc.nextLine();
//        System.out.println(phrase.split(" ").length);
//
//    }
//    public static void getOccurence(){
//
//        String phrase ;
//        String lettre;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Saisissez une phrase : ");
//        phrase = sc.nextLine();
//
//        Scanner let = new Scanner(System.in);
//        System.out.println("je veux la lettre ");
//
//        lettre = let.next();
//
//
//        System.out.println(phrase.split(lettre ).length -1);
//
//    }
////  public  static void getAnagramme(){
////      String mot1 = "test";
////      String mot2 = "test";
////      for (int i = 0; i <mot1.length();i++) {
////
////      }
////          System.out.println(mot1 + " est l'anagramme de "+ mot2);
////  }else{
////          System.out.println(mot1 + " est l'anagramme de "+ mot2);
////}
//
//    public static void Somme() {
//        int nb;
//        int res = 0;
//        String concat = "";
//
//        System.out.println("Entrez un nombre");
//        Scanner sc = new Scanner(System.in);
//        nb = sc.nextInt();
//
//        for (int i = 1; i <= nb; i++) {
//            res = res + i;
//            if(i !=nb){
//                concat = concat+i + " + ";
//            } else {
//                concat = concat + i + " = " + res;
//            }
//        }
//        System.out.println(concat);
//    }
//    public static void TableDeMultiplication() {
//        int nb;
//
//        System.out.println("Entrez un nombre");
//        Scanner sc = new Scanner(System.in);
//        nb = sc.nextInt();
//
//        for (int i = 1; i < 11; i++) {
//            System.out.println(nb + " x "+ i + " = "+ i*nb );
//        }
//
//    }
//    //    public static void AchatMonnaie(){
////
////        int prix;
////        int somme;
////        int nb500 = 0;
////        int nb200 = 0;
////        int nb100 = 0;
////        int nb50 = 0;
////        int nb20= 0;
////        int nb10= 0;
////        int nb5= 0;
////        int nb1= 0;
////
////        System.out.println("entrer le prix a payer ");
////        Scanner sc = new Scanner(System.in);
////        prix = sc.nextInt();
////
////        System.out.println("entrer la somme payer ");
////        Scanner st = new Scanner(System.in);
////        somme = st.nextInt();
////
////    }
//    public static void Note(){
//        int nbrNote;
//
//        Scanner number = new Scanner(System.in);
//        System.out.print("Entrez le nombre de note  : ");
//        nbrNote = number.nextInt();
//
//        int notes[] = new int[nbrNote];
//        Scanner sc = new Scanner(System.in);
//        for(int a =0; a < notes.length ; a++){
//            int value =0;
//            System.out.println("donne moi une note");
//            value = sc.nextInt();
//            notes[a] = value;
//        };
//
//
//        int total = 0;
//        for(int i = 0; i < notes.length ; i++){
//            total += notes[i];
//        }
//        float moyenne =  total / notes.length;
//
//        System.out.print("\nMoyenne = "+moyenne);
//
//
//    }
//    //    public static void Decalage(){
////        String[] tableau = {"t","e","s","t"};
////        String[] tableau2 =  tableau;
////
////    }
//    public static int[] getTableau(){
//        int taille;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("entre la taille du tableau : ");
//        taille = sc.nextInt();
//        int tab[] = new int[taille];
//        int tab2[] = new int[taille*2];
//        int j = 0;
//
//        Random random = new Random();
//
//
//        for (int i = 0; i < tab.length; i++) {
//            tab[i] = random.nextInt(10);
//        }
//
//        for (int i = 0; i < tab.length; i++) {
//            tab2[i] = tab[i];
//        }
//        for (int i = taille; i < tab2.length; i++) {
//            tab2[i] = tab[j]*2;
//            j++;
//        }
//
//        return tab;
//
//    }
//
//    public static void  nbOcurrence(){
//        int compteur =0;
//        int[] tab = {1,3,1,4,8,9,45,1,1,1,5};
//        Scanner sc= new Scanner(System.in);
//        System.out.println("choisi un chiffre : ");
//        int valeur = sc.nextInt();
//
//        for (int i = 0; i < tab.length -1; i++) {
//            if( valeur == tab[i] ){
//                compteur ++;
//            }
//        }
//        System.out.println("il y a " + compteur +  " dans le tableau");
//
//    }
//
//
//    public static void PaireImpair(){
//        int number;
//        System.out.println("choisi un nombre");
//        Scanner nombre = new Scanner(System.in);
//        number = nombre.nextInt();
//        if (number % 2 == 0){
//            System.out.println("le chiffre est paire");
//        } else {
//            System.out.println("le chiffre est impair");
//        }
//    }
//    public static void chaineCaractere(){
//        String text ;
//        int compteur = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("entre des caractere : ");
//        text = sc.next();
//
//        for(int i = 0; i < text.length() -1; i++) {
//            if(text.charAt(i) != ' ')
//                compteur++;
//        }
//        System.out.println("Nombre total de caractères est: " + compteur);
//
//    }
//    public static void calcDegre(){
//        double aConvertir;
//        double   convertit=0;
//        char  mode = ' ';
//
//        Scanner sc = new Scanner(System.in);
//
//        do{
//            System.out.println("Choisissez le mode de conversion : ");
//            System.out.println("1 - Convertisseur Celsius - Fahrenheit");
//            System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
//            mode = sc.nextLine().charAt(0);
//
//            if(mode != '1' && mode != '2')
//                System.out.println("Mode inconnu, veuillez réitérer votre choix.");
//
//        }while (mode != '1' && mode != '2');
//
//
//        System.out.println("Température à convertir :");
//        aConvertir = sc.nextDouble();
//        sc.nextLine();
//
//        if(mode == '1'){
//            convertit = ((9.0/5.0) * aConvertir) + 32.0;
//            System.out.print(aConvertir + " °C correspond à : ");
//            System.out.println(arrondi(convertit, 2) + " °F.");
//        }
//        else{
//            convertit = ((aConvertir - 32) * 5) / 9;
//            System.out.print(aConvertir + " °F correspond à : ");
//            System.out.println(arrondi(convertit, 2) + " °C.");
//        }
//
//
//    }
//    public static double arrondi(double A, int B) {
//        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
//    }
//
//    public class Exo3 {
//        public static void User() {
//            Scanner sc = new Scanner(System.in);
//
//            boolean validPassword = false;
//            boolean hasMaj = false;
//            boolean hasNumber = false;
//
//            while (!validPassword) {
//                System.out.print("Veuillez entrer votre mot de passe (8 lettres, une majuscule et un chiffre) : ");
//                String password = sc.nextLine();
//
//                if (password.length() >= 8) {
//                    for (int i = 0; i < password.length(); i++) {
//                        char c = password.charAt(i);
//                        if (Character.isUpperCase(c)) {
//                            hasMaj = true;
//                        } else if (Character.isDigit(c)) {
//                            hasNumber = true;
//                        }
//                    }
//                    if (hasMaj && hasNumber) {
//                        System.out.println("Mot de passe valide");
//                        validPassword = true;
//                    } else {
//                        System.out.println("Mot de passe invalide, veuillez réessayer.");
//                    }
//                } else {
//                    System.out.println("Mot de passe invalide, veuillez réessayer.");
//                }
//            }
//        }
//    }



