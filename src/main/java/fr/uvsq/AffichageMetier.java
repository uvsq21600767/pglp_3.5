package fr.uvsq;

import java.time.LocalDateTime;

public class AffichageMetier implements Affichage{

    @Override
    public void afficheDebut() {
        System.out.println(LocalDateTime.now() + ": Début de uneMethodeMetier");
    }

    @Override
    public void afficheFin() {
        System.out.println(LocalDateTime.now() + ": Fin de uneMethodeMetier");
    }
}
