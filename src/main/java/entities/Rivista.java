package entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("RIVISTA")
public class Rivista extends Catalogo {

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;



    public Rivista(){}

    public Rivista( String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }
    public Periodicita getPeriodicita() {
        return periodicita;
    }
    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                '}';
    }
}
