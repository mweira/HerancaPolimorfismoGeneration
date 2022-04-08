package br.com.generation.aula06;

public class TestaAnimal {

	public static void main(String[] args) {
		

	Cachorro a1 = new Cachorro();
	a1.setNome("Joaquim");
	a1.setIdade(4);
	a1.setLocal("Deve correr");
	a1.setSom("Faz som");

	Cavalo a2 = new Cavalo(); 
	a2.setNome("Gerson");
	a2.setIdade(9);
	a2.setLocal("Deve correr");	
	a2.setSom("Faz som");
	
	Preguiça a3 = new Preguiça();
	a3.setNome("Maria");
	a3.setIdade(5);
	a3.setLocal("Deve subir em árvores");
	a3.setSom("Faz som");
	
	System.out.println("O nome do animal é " + a1.getNome());
	System.out.println("A idade do animal é " + a1.getIdade());
	System.out.println("O animal deve " + a1.getLocal());
	System.out.println("O animal emite som : " + a1.getSom());
	
	System.out.println("O nome do animal é " + a2.getNome());
	System.out.println("A idade do animal é " + a2.getIdade());
	System.out.println("O animal deve " + a2.getLocal());
	System.out.println("O animal emite som : " + a2.getSom());
	
	System.out.println("O nome do animal é " + a3.getNome());
	System.out.println("A idade do animal é " + a3.getIdade());
	System.out.println("O animal deve " + a3.getLocal());
	System.out.println("O animal emite som : " + a3.getSom());
	
	}
}
