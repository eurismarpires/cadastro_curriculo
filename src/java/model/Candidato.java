package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Eurismar
 */
public class Candidato {
  private int codigo;
  private String nome;
  private String cpf;
  private Date dataNascimento;
  private char sexo;
  private List<Conhecimento> conhecimentos;
  private List<Cargo> cargosPretendidos;
  
  
}
