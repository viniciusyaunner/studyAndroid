package com.example.manager.vestibulinho;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cursos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        ImageButton btnFechar = (ImageButton) findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cursos.this.finish();
            }
        });


        Button vest = (Button) findViewById(R.id.vest);
        vest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vestibulinhoetec.com.br/home/"));
                startActivity(intent);
            }
        });


        Button adm = (Button) findViewById(R.id.adm);
        adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgAdm = new AlertDialog.Builder(cursos.this);
                msgAdm.setTitle("Tecnico de Administração\n");
                msgAdm.setMessage("O Técnico em Administração é o profissional que adota postura ética na execução da rotina administrativa, na elaboração do planejamento da produção e materiais, recursos humanos, financeiros e mercadológicos. Realiza atividades de controles e auxilia nos processos de direção utilizando ferramentas da informática básica. Fomenta ideias e práticas empreendedoras. Desempenha suas atividades observando as normas de segurança, saúde e higiene do trabalho, bem como as de preservação ambiental.");
                msgAdm.setNeutralButton("OK",null);
                msgAdm.show();
            }
        });
        Button autind = (Button) findViewById(R.id.autind);
        autind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgautind = new AlertDialog.Builder(cursos.this);
                msgautind.setTitle("Automação Industrial\n");
                msgautind.setMessage("O Técnico em Automação Industrial é o profissional que participa do desenvolvimento de projetos. Executa a instalação e a manutenção de equipamentos e sistemas eletrônicos. Realiza medições e testes com equipamentos eletrônicos. Executa procedimentos de controle de qualidade e gestão da produção de equipamentos eletrônicos.\n" +
                        "\n");
                msgautind.setNeutralButton("OK",null);
                msgautind.show();
            }
        });
        Button mec = (Button) findViewById(R.id.mec);
        mec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgmec = new AlertDialog.Builder(cursos.this);
                msgmec.setTitle("Mecânica\n");
                msgmec.setMessage("O Técnico em Mecânica é o profissional que elabora projetos mecânicos e sistemas automatizados. Planeja, aplica e controla procedimentos de instalação e de manutenção mecânica de máquinas e equipamentos. Desenvolve e controla processos de fabricação e montagem de conjuntos mecânicos. Aplica técnicas de medição e ensaios. Especifica materiais para construção mecânica. Elabora documentação, realiza compras e vendas técnicas e cumpre normas e procedimentos de segurança no trabalho e de preservação ambiental.\n" +
                        "\n");
                msgmec.setNeutralButton("OK",null);
                msgmec.show();
            }
        });

        Button eds = (Button) findViewById(R.id.eds);
        eds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgeds = new AlertDialog.Builder(cursos.this);
                msgeds.setTitle("Técnico em Informática – Integrado ao Ensino Médio\n");
                msgeds.setMessage("O Técnico em Informática é o profissional que desenvolve programas de computador seguindo as especificações e paradigmas da lógica e das linguagens de programação utilizando códigos de linguagem científica e matemática pertinentes a diferentes contextos e situações e identifica fontes e documentos específicos para a obtenção das informações desejadas.\n" +
                        "\n" +
                        "Utiliza ambientes de desenvolvimento de sistemas, sistemas operacionais e banco de dados selecionando ferramentas, identificando metodologias, procedimentos e equipamentos e estabelece critérios para sua seleção e utilização. Realiza testes de programas de computador, mantendo registros que possibilitem análises e refinamento de resultados, reconhecendo e respeitando os limites éticos e morais que devem ser considerados na condução do desenvolvimento científico e tecnológico ao interpretar e criticar resultados numa situação concreta.\n" +
                        "\n" +
                        "Executa manutenção de programas de computadores implantados, elabora, desenvolve, acompanha e avalia rotinas de trabalho. Atua segundo princípios que cooperam e solidarizam-se, assumindo sua parcela de responsabilidade na construção de sociedades justas.");

                msgeds.setNeutralButton("OK",null);
                msgeds.show();
            }
        });
        Button em = (Button) findViewById(R.id.em);
        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgmeca = new AlertDialog.Builder(cursos.this);
                msgmeca.setTitle("Ensino Médio\n");
                msgmeca.setMessage("A Etec “Monsenhor Antônio Magliano” oferece três modalidades  de curso referentes ao Ensino Médio: Regular, Informática integrada ao Ensino Médio e Mecatrônica integrada ao Ensino Médio. Informações mais detalhadas quanto a esses cursos são apresentadas a seguir.\n" +
                        "\n" +
                        " ");
                msgmeca.setNeutralButton("OK",null);
                msgmeca.show();
            }
        });
        Button enf = (Button) findViewById(R.id.enf);
        enf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgenf = new AlertDialog.Builder(cursos.this);
                msgenf.setTitle("Enfermagem\n");
                msgenf.setMessage("O Técnico em Enfermagem é o profissional que atua na promoção, prevenção, recuperação e reabilitação dos processos saúde-doença. Colabora com o atendimento das necessidades de saúde do paciente/ cliente, família e comunidade, em todas as faixas etárias. Desenvolve ações de educação para o auto cuidado, bem como de segurança no trabalho e de biossegurança nas ações de enfermagem. Promove ações de orientação e preparo do paciente para exames. Realiza cuidados de enfermagem, tais como: curativos, administração de medicamentos e vacinas, nebulizações, procedimentos invasivos, mensuração antropométrica e verificação de sinais vitais, dentre outros. Presta assistência de enfermagem a pacientes clínicos e cirúrgicos em qualquer fase do ciclo vital. Participa de uma equipe multiprofissional com visão crítica e reflexiva, atuando de acordo com princípios éticos. Exerce ações de cidadania e de preservação ambiental.");
                msgenf.setNeutralButton("OK",null);
                msgenf.show();
            }
        });
        Button ds = (Button) findViewById(R.id.ds);
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgds = new AlertDialog.Builder(cursos.this);
                msgds.setTitle("Desenvolvimento de Sistema\n");
                msgds.setMessage("O Desenvolvimento de Sistema é o profissional que desenvolve programas de computador, seguindo as especificações e paradigmas da lógica de programação e das linguagens de programação. Utiliza ambientes de desenvolvimento de sistemas, sistemas operacionais e banco de dados. Realiza testes de programas de computador, mantendo registros que possibilitem análises e refinamento dos resultados. Executa manutenção de programas de computadores implantados.\n" +
                        "\n") ;
                msgds.setNeutralButton("OK",null);
                msgds.show();
            }
        });
        Button emeca = (Button) findViewById(R.id.emeca);
        emeca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgemeca = new AlertDialog.Builder(cursos.this);
                msgemeca.setTitle("Técnico em Mecatrônica – Integrado ao Ensino Médio\n\n");
                msgemeca.setMessage("O Técnico em Mecatrônica é o profissional que atua no projeto, na execução e na instalação de máquinas e equipamentos automatizados e sistemas robotizados. Realiza manutenção, medições e testes dessas máquinas, equipamentos e sistemas, conforme especificações técnicas. Opera equipamentos, utiliza softwares específicos e linguagens de programação adequadas. Organiza local de trabalho. Coordena equipes e oferece treinamento operacional. Realiza manutenções preditiva, preventiva e corretiva, em conformidade com as normas técnicas e higiene, segurança, qualidade e proteção ao meio ambiente. Programa e opera estas máquinas observando as normas de segurança.\n" +
                        "\n");
                msgemeca.setNeutralButton("OK",null);
                msgemeca.show();
            }
        });


    }
}

