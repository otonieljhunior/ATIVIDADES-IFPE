import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        EmendaIndividual emenda1 = new EmendaIndividual(
            2300001, 
            "DANILO CABRAL", 
            "Reforma de unidades de saúde em Recife", 
            "Saúde"
        );
        emenda1.addDocumento(new Documento("15/03/2023", "Proposta", 850000.00f));
        emenda1.addDocumento(new Documento("20/05/2023", "Aprovada", 800000.00f));
        
        EmendaIndividual emenda2 = new EmendaIndividual(
            2300002, 
            "TADEU ALENCAR", 
            "Equipamentos para hospital regional em Caruaru", 
            "Saúde"
        );
        emenda2.addDocumento(new Documento("10/04/2023", "Proposta", 1200000.00f));
        emenda2.addDocumento(new Documento("25/06/2023", "Aprovada", 1150000.00f));
        
        EmendaIndividual emenda3 = new EmendaIndividual(
            2300003, 
            "MENDONÇA FILHO", 
            "Pavimentação de estradas rurais em Petrolina", 
            "Infraestrutura"
        );
        emenda3.addDocumento(new Documento("05/05/2023", "Proposta", 950000.00f));

        String[] parlamentaresBancada = {
            "DANILO CABRAL", "TADEU ALENCAR", "MENDONÇA FILHO", 
            "FERNANDO RODRIGUES", "CARLOS VERAS", "MARCONDES GADELHA"
        };
        
        EmendaBancada bancada1 = new EmendaBancada(
            2300101,
            "Bancada de Pernambuco",
            "Revitalização de bacias hidrográficas no estado",
            parlamentaresBancada,
            "Ata de Reunião nº 123/2023",
            "DANILO CABRAL"
        );
        bancada1.addDocumento(new Documento("20/03/2023", "Proposta", 2500000.00f));
        bancada1.addDocumento(new Documento("15/04/2023", "Aprovada", 2400000.00f));
        
        EmendaBancada bancada2 = new EmendaBancada(
            2300102,
            "Bancada de Pernambuco",
            "Modernização de laboratórios em universidades",
            parlamentaresBancada,
            "Ata de Reunião nº 124/2023",
            "TADEU ALENCAR"
        );
        bancada2.addDocumento(new Documento("12/04/2023", "Proposta", 1800000.00f));
        
        EmendaBancada bancada3 = new EmendaBancada(
            2300103,
            "Bancada de Pernambuco",
            "Programa de segurança pública metropolitana",
            parlamentaresBancada,
            "Ata de Reunião nº 125/2023",
            "MENDONÇA FILHO"
        );
        bancada3.addDocumento(new Documento("08/05/2023", "Proposta", 2200000.00f));

        String[] membrosComissaoSaude = {
            "MARCONDES GADELHA", "SEVERINO NINHO", "LUCAS RAMOS", "PASTOR EURICO"
        };
        
        EmendaComissao comissao1 = new EmendaComissao(
            2300201,
            "Comissão de Saúde",
            "Ampliação do programa de atenção básica em saúde",
            "Comissão de Saúde Pública",
            membrosComissaoSaude,
            "Relatório Técnico 2023/SAÚDE/001",
            "MARCONDES GADELHA"
        );
        comissao1.addDocumento(new Documento("12/04/2023", "Proposta", 1500000.00f));
        comissao1.addDocumento(new Documento("18/05/2023", "Aprovada", 1450000.00f));
        
        EmendaComissao comissao2 = new EmendaComissao(
            2300202,
            "Comissão de Educação",
            "Implantação de bibliotecas digitais em escolas",
            "Comissão de Educação e Cultura",
            new String[]{"JOÃO CAMPOS", "MARILIA ARRAES", "ANDERSON FERREIRA", "SILVIO COSTA"},
            "Relatório Técnico 2023/EDUC/002",
            "JOÃO CAMPOS"
        );
        comissao2.addDocumento(new Documento("22/04/2023", "Proposta", 1200000.00f));
        
        EmendaComissao comissao3 = new EmendaComissao(
            2300203,
            "Comissão de Infraestrutura",
            "Melhoria do transporte público interestadual",
            "Comissão de Viação e Transportes",
            new String[]{"ANDERSON FERREIRA", "DANIEL COELHO", "FERNANDO RODRIGUES", "SILVIO COSTA"},
            "Relatório Técnico 2023/INFRA/003",
            "ANDERSON FERREIRA"
        );
        comissao3.addDocumento(new Documento("30/04/2023", "Proposta", 2000000.00f));

        EmendaRelator relator1 = new EmendaRelator(
            2300301,
            "CARLOS VERAS",
            "Incentivo à agricultura familiar no sertão",
            "CARLOS VERAS",
            "Governo do Estado de Pernambuco",
            "Agricultores familiares do sertão central"
        );
        relator1.addDocumento(new Documento("08/05/2023", "Proposta", 1500000.00f));
        relator1.addDocumento(new Documento("12/06/2023", "Aprovada", 1480000.00f));
        
        EmendaRelator relator2 = new EmendaRelator(
            2300302,
            "SEVERINO NINHO",
            "Capacitação profissional para jovens",
            "SEVERINO NINHO",
            "Secretaria de Trabalho e Empreendedorismo",
            "Jovens em situação de vulnerabilidade social"
        );
        relator2.addDocumento(new Documento("15/05/2023", "Proposta", 900000.00f));
        
        EmendaRelator relator3 = new EmendaRelator(
            2300303,
            "FERNANDO RODRIGUES",
            "Recuperação de áreas degradadas por mineração",
            "FERNANDO RODRIGUES",
            "Ministério do Meio Ambiente",
            "Comunidades afetadas pela mineração"
        );
        relator3.addDocumento(new Documento("20/05/2023", "Proposta", 1700000.00f));

        System.out.println(emenda1);
        System.out.println(emenda2);
        System.out.println(emenda3);
        
        System.out.println(bancada1);
        System.out.println(bancada2);
        System.out.println(bancada3);
        
        System.out.println(comissao1);
        System.out.println(comissao2);
        System.out.println(comissao3);
        
        System.out.println(relator1);
        System.out.println(relator2);
        System.out.println(relator3);
    }
}