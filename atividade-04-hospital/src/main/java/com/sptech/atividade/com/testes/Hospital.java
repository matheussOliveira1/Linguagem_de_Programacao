package com.sptech.atividade.com.testes;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;

    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeHoraExtra = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }

    public void realizarPagamento(Medico medico, Double valorPago) {
        if (medico != null && valorPago != null) {
            if (medico.getAtivo() && valorPago > 0) {
                Double salarioAnterior = medico.getSalario();
                Double novoSalario = salarioAnterior + valorPago;
                medico.setSalario(novoSalario);
                quantidadeDePagamentos++;
            }
        }
    }

    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {
        if (medico != null && valorPago != null) {
            if (medico.getAtivo() && valorPago > 0) {
                if (horaExtra != null && horaExtra > 0) {
                    Double salarioAnterior = medico.getSalario();
                    Double novoSalario = salarioAnterior + valorPago + horaExtra;
                    medico.setSalario(novoSalario);
                    quantidadeDePagamentos++;
                    quantidadeDeHoraExtra++;
                }
            }
        }
    }

    public void desligarMedico(Medico medico) {
        if (medico != null && medico.getAtivo()) {
            medico.setAtivo(false);
        }
    }
}
