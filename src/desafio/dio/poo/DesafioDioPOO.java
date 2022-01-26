/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.dio.poo;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author stefa
 */
public class DesafioDioPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição curso JAVA");
        cursoJava.setCargaHoraria(56);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JavaScript");
        cursoJS.setDescricao("Descrição curso JavaScript");
        cursoJS.setCargaHoraria(22);

        Mentoria mentoriaNetBeans = new Mentoria();
        mentoriaNetBeans.setTitulo("Mentoria NetBeans");
        mentoriaNetBeans.setDescricao("Descrição NetBeans");
        mentoriaNetBeans.setData(LocalDate.now());

        Mentoria mentoriaDuvidas = new Mentoria();
        mentoriaDuvidas.setTitulo("Mentoria Dúvidas");
        mentoriaDuvidas.setDescricao("Descrição Mentoria para sanar dúvidas");
        mentoriaDuvidas.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp");
        bootcamp.setDescricao("Descrição BootCamp");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoriaNetBeans);
        bootcamp.getConteudos().add(mentoriaDuvidas);

        System.out.println("---------------------------------------------------------------------");

        Dev devStefany = new Dev();
        devStefany.setNome("Stefany");
        devStefany.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Stefany: " + devStefany.getConteudoInscritos());
        devStefany.progredir();
        devStefany.progredir();
        devStefany.progredir();
        devStefany.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Stefany: " + devStefany.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Stefany: " + devStefany.getConteudoConcluidos());
        System.out.println("XP: " + devStefany.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");
    }

}
