package entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("RIVISTA")
public class Rivista extends Catalogo {

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    @ManyToOne
    @JoinColumn(name = "ISBN", nullable = false)
    private Catalogo catalogo;

    public Rivista(){}

    public Rivista(String ISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
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
