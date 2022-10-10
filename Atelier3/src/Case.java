public class Case {

    private int gain;
    private Personnage perso;
    private Obstacle obs;

    Case(Obstacle obs, int gain) {
        this.obs = obs;
        this.gain = gain;
    }

    Case(int gain) {
        this.gain = gain;
    }

    public int getPenalite() {
        if (obs == null) {
            return 0;
        } else {
            return obs.getPenalite();
        }
    }

    public void placerPersonnage(Personnage perso) {
        this.perso = perso;
    }

    public void placerObstacle(Obstacle obs) {
        this.obs = obs;
    }

    public void enleverPersonnage() {
        perso = null;
    }

    public boolean estLibre() {
        return (perso == null && obs == null);
    }

    public boolean sansObstacle() {
        return obs == null;
    }

    public boolean sansPerso() {
        return perso == null;
    }

    public String toString() {
        if (this.estLibre()) {
            return "Libre (gain = " + gain + ")";
        } else if (this.sansPerso()) {
            return "Obstacle (penalite = " + obs.getPenalite() + ")";
        } else {
            return perso.toString() + " (penalite = " + -gain + ")";
        }
    }
}
