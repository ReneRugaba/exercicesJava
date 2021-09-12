public class Vaisseau {
    String typeVaiseau;
    int nombrePassagers;
    int resistanceBouiclier;
    int blindage;

    void activerBouclier(){
        System.out.println("Actuivation bouclier du vaisseau de type "+this.typeVaiseau);
    };

    void desactiverBouclier(){
        System.out.println("Desactivation bouclier du vaisseau de type "+this.typeVaiseau);
        this.resistanceBouiclier = 0;
        this.blindage= this.blindage/2;
    };
}
