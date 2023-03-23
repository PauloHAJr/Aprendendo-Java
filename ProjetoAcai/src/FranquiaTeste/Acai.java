package FranquiaTeste;

public class Acai {
    public String tamanho = "M";
    public Double valor= 0.0;
    public Boolean acrescimoSorvete;

    public Double CalculaValor(Boolean acrescimoSorvete, String tamanho){
        if(tamanho.equals("P")|tamanho.equals("p"))
            this.valor += 8.0;
        else if (tamanho.equals("M")|tamanho.equals("m"))
            this.valor += 10.0;
        else if (tamanho.equals("G")|tamanho.equals("g"))
            this.valor += 12.0;

        if(acrescimoSorvete)
            this.valor+=2.0;

        return this.valor;
    }

    public Acai() {
    }

    public Double getValor() {
        return this.valor;
    }
}
