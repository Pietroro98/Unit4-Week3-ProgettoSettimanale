package entities;

import jakarta.persistence.*;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String cognome;
    private String dataDiNascita;

    @Column(unique = true)
    private String numeroDiTessera;

    public Utente(){}
    public Utente(String nome, String cognome, String dataDiNascita, String numeroDiTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.numeroDiTessera = numeroDiTessera;
    }

    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getDataDiNascita() {
        return dataDiNascita;
    }
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    public String getNumeroDiTessera() {
        return numeroDiTessera;
    }
    public void setNumeroDiTessera(String numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }
    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'' +
                ", numeroDiTessera='" + numeroDiTessera + '\'' +
                '}';
    }
}
