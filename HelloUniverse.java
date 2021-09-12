public class HelloUniverse {
    public static void main(String[] args) {
        Planete mars= new Planete("Mars");
        mars.type = "Planete";
        Vaisseau vaisseau1 = new Vaisseau();
        vaisseau1.nombrePassagers=9;
        vaisseau1.typeVaiseau="Frégate";
        Vaisseau vaisseau2 = new Vaisseau();
        vaisseau2.nombrePassagers=42;
        vaisseau2.typeVaiseau = "Croiseur";

        mars.accuielVaisseau(vaisseau1);
        mars.accuielVaisseau(vaisseau2);
        System.out.printf("la forme de toutes les planètes est %s \n",Planete.forme);
        Planete.expension(10.5);
        Planete.expension(14.5);
        System.out.println(mars.type);
        VaisseauGuerre chasseur = new VaisseauGuerre();
        chasseur.typeVaiseau = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceBouiclier = 2;
        VaisseauCivil monde = new VaisseauCivil();
        monde.typeVaiseau = "Monde";
        monde.blindage = 4785;
        monde.resistanceBouiclier = 30;
        chasseur.activerBouclier();
        monde.activerBouclier();
        chasseur.attaque(monde,"Laser photonique",3);
        monde.desactiverBouclier();
        System.out.println("La resisance du boublier du vaisseau "+monde.typeVaiseau+" est de "+monde.resistanceBouiclier+" minute(s)");
        System.out.println("Le blindage du boublier du vaisseau "+monde.typeVaiseau+" est de "+monde.blindage);

        mars.placeSysteme = 4;

        mars.placeStysteme();


    }
}
