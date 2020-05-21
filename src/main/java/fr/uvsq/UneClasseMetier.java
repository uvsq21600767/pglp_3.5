package fr.uvsq;

import java.time.LocalDateTime;

public class UneClasseMetier {

    private AffichageMetier a;

    UneClasseMetier() {
        this.a = new AffichageMetier();
    }

    public AffichageMetier getA() {
        return this.a;
    }

    public void setA(AffichageMetier a) {
        this.a = a;
    }

    public void uneMethodeMetier() {
        a.afficheDebut();
        a.afficheFin();
    }
}
