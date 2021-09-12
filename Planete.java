public class Planete extends Astre implements SunSystem {
    String nomPlanete;
    long diametrePlanete;
    String typePlanete;
    int totalVisiteurs;
    Atmosphere atmosphere;
    int  stocker;
    Vaisseau typeVaisseau;
    static String forme = "Spherique";
    static long nbPlanetes;
    int placeSysteme;

    Planete(String nomPlanete){
        this.nomPlanete=nomPlanete;
        nbPlanetes++;
        System.out.printf("Le nombre de planète est de %d \n",nbPlanetes);
    }

    //methode à appeler
    void accuielVaisseau(Vaisseau vaisseau){
        this.stocker=this.stocker+vaisseau.nombrePassagers;
       if(typeVaisseau==null){
           typeVaisseau=vaisseau;
           System.out.println("Aucun vaisseau ne s'en va!");
       }else{
           System.out.println("Un vaisseau de type "+typeVaisseau.typeVaiseau+" doit s'en aller!");
       }
       System.out.println("Le nombre d'humain ayant déjà sejourné sur "+this.nomPlanete+" est de "+this.stocker);
    }

    static void expension(double dinsatnce) {
        if(dinsatnce<14){
            System.out.println("Oh la mais c'est super rapid");
        } else if(dinsatnce>14) {
            System.out.println("Mais c'est plus rapide que la lumière");
        }
    }

    @Override
    public void placeStysteme() {
        System.out.println(this.placeSysteme+" est la "+this.placeSysteme+" ème planète du système solaire!");
    }
}
