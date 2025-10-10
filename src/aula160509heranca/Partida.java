package aula160509heranca;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Partida {
    private UUID id;
    private LocalDateTime data;
    private List<Arbitro> arbitros;
    private Time timeMandante;
    private Time timeVisitante;
    private Placar placar;
    private Estadio estadio;
    
    public Partida(UUID id, LocalDateTime data, List<Arbitro> arbitros, Time timeMandante, Time timeVisitante,
            Placar placar, Estadio estadio) {
        this.id = id;
        this.data = data;
        this.arbitros = arbitros;
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.placar = placar;
        this.estadio = estadio;
    }
    public Partida() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public List<Arbitro> getArbitros() {
        return arbitros;
    }
    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }
    public Time getTimeMandante() {
        return timeMandante;
    }
    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }
    public Time getTimeVisitante() {
        return timeVisitante;
    }
    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
    public Placar getPlacar() {
        return placar;
    }
    public void setPlacar(Placar placar) {
        this.placar = placar;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    

   
}
