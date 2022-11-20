package de.ostfalia.bips.ws22.camunda.database.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "abschlussarbeit")
public class Abschlussarbeit {
//    @EmbeddedId
//    private Abschlussarbeit.Id id;

//    public Abschlussarbeit(){};

//

//    public Abschlussarbeit.Id getId() {
//        return id;
//    }
//    public void setId(Abschlussarbeit.Id id) {
//        this.id = id;
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_abschlussarbeit", nullable = false)
    private Integer idAbscluss;

    @Column(name = "ende_datum", nullable = false)
    private Date ende_datum;

    @Column(name = "beginn_datum", nullable = false)
    private Date beginn_datum;

    @ManyToOne(targetEntity = Antrag.class, optional = false)
    @JoinColumn(name = "id_antrag", referencedColumnName = "id_antrag", nullable = false)
    private Antrag antrag;

    public Integer getIdAbscluss() {
        return idAbscluss;
    }

    public void setIdAbscluss(Integer idAbscluss) {
        this.idAbscluss = idAbscluss;
    }

    public Date getEnde_datum() {
        return ende_datum;
    }

    public void setEnde_datum(Date ende_datum) {
        this.ende_datum = ende_datum;
    }

    public Date getBeginn_datum() {
        return beginn_datum;
    }

    public void setBeginn_datum(Date beginn_datum) {
        this.beginn_datum = beginn_datum;
    }

    public Antrag getAntrag() {
        return antrag;
    }

    public void setAntrag(Antrag antrag) {
        this.antrag = antrag;
    }

    //    public Integer getIdAbscluss() {
//        return idAbscluss;
//    }
//    public void setId(Integer idAbscluss) {
//        this.idAbscluss = idAbscluss;
//    }



//    public String getEnde_datum() {
//        return ende_datum;
//    }
//    public void setEnde_datum(String text) {
//
//        this.ende_datum = text;
//    }
//
//    public String getBeginn_datum() {
//        return beginn_datum;
//    }
//    public void setBeginn(String text) {
//        this.beginn_datum = text;
//    }

//    @Embeddable
//    public static class Id implements Serializable{
//       @ManyToOne(targetEntity = Antrag.class, optional = false)
//       @JoinColumn(name = "id_antrag", referencedColumnName = "id_antrag", nullable = false)
//        private Antrag antrag;
//
//        public Id(Antrag antrag) {
//            this.antrag = antrag;
//        }
//
//        public Id() {
//        }
//
//        public Antrag getAntrag() {
//            return antrag;
//        }
//
//        public void setAntrag(Antrag antrag) {
//            this.antrag = antrag;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(getAntrag());
//        }
//
//        @Override
//        public String toString() {
//            return   " (" + (antrag == null ? "<null>" : antrag) + ')';
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abschlussarbeit abschlussarbeit = (Abschlussarbeit) o;
        return Objects.equals(getIdAbscluss(), abschlussarbeit.getIdAbscluss());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdAbscluss());
    }

    @Override
    public String toString() {
        return "Abschlussarbeit{" +
                "idAbscluss=" + idAbscluss +
                ", ende_datum=" + ende_datum +
                ", beginn_datum=" + beginn_datum +
                ", antrag=" + antrag +
                '}';
    }

}
