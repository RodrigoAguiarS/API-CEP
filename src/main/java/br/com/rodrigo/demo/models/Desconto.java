package br.com.rodrigo.demo.models;


public enum Desconto {
    ESTADO_IGUAIS_DDD_IGUAIS(0.5, 1),
    ESTADO_IGUAIS_DDD_DIFERENTE(0.75, 3),
    ESTADO_DIFERENTES(0, 10);

    private double porcentagemDesconto;
    private int diasEntrega;

    Desconto(double porcentagemDesconto, int diasEntrega) {
        this.porcentagemDesconto = porcentagemDesconto;
        this.diasEntrega = diasEntrega;

    }

    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public int getDiasEntrega() {
        return diasEntrega;
    }
}
