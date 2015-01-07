package controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Candidato;
import model.Cargo;
import model.Conhecimento;

/**
 *
 * @author Eurismar
 */
@ManagedBean
@RequestScoped
public class CandidatoBean {
    private Candidato candidato;
    private List<Conhecimento> conhecimentos;
    private List<Cargo> cargos;
    public CandidatoBean() {
        candidato = new Candidato();
        cargos = new ArrayList<>();
        conhecimentos = new ArrayList<>();
        cargos.add(new Cargo(1,"Analista de Sistemas"));
        cargos.add(new Cargo(2,"Programador"));
        cargos.add(new Cargo(3,"Arquiteto de Software"));
        
        conhecimentos.add(new Conhecimento(1, "MS-Project"));
        conhecimentos.add(new Conhecimento(2, "Java"));
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public List<Conhecimento> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<Conhecimento> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
    
    
}
