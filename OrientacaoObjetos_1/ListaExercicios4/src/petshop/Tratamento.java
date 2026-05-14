package petshop;

public class Tratamento {
    //===============Atributos===============
    private String dataInicio;
    private String dataFim;
    private String descricao;

    //===============Construtor===============
    public Tratamento(String dataInicio, String descricao) {
        this.dataInicio = dataInicio;
        this.descricao =descricao;
    }

    //===============Setters===============
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    //===============Getters===============
    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getDescricao() {
        return descricao;
    }
}
