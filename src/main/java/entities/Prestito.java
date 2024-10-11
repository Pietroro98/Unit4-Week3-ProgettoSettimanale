package entities;

import jakarta.persistence.*;

@Entity
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "catalogo_isbn", nullable = false)
    private Catalogo catalogo;

    private String dataInizioPrestito;
    private String dataRestituzionePrevista;
    private String dataRestituzioneEffettiva;

    public Prestito(){}

    public Prestito(Utente utente, Catalogo catalogo, String dataInizioPrestito, String dataRestituzionePrevista, String dataRestituzioneEffettiva) {
        this.utente = utente;
        this.catalogo = catalogo;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }
    public long getId() {
        return id;
    }
    public Utente getUtente() {
        return utente;
    }
    public void setUtente(Utente utente) {
        this.utente = utente;
    }
    public Catalogo getCatalogo() {
        return catalogo;
    }
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    public String getDataInizioPrestito() {
        return dataInizioPrestito;
    }
    public void setDataInizioPrestito(String dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }
    public String getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }
    public void setDataRestituzionePrevista(String dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public String getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }
    public void setDataRestituzioneEffettiva(String dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", utente=" + utente +
                ", catalogo=" + catalogo +
                ", dataInizioPrestito='" + dataInizioPrestito + '\'' +
                ", dataRestituzionePrevista='" + dataRestituzionePrevista + '\'' +
                ", dataRestituzioneEffettiva='" + dataRestituzioneEffettiva + '\'' +
                '}';
    }


}
