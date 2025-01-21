public class Main {
    public static void main(String[] args) {
      
        InputHelper input = new InputHelper();
       
        Pessoa pessoa1 = new Pessoa();

        
        pessoa1.setNome(input.getString("Digite o nome: "));
        pessoa1.setIdade(input.getInt("Digite a idade: "));
        pessoa1.setAltura(input.getDouble("Digite a altura (em metros, ex.: 1,75): "));
        pessoa1.setPeso(input.getDouble("Digite o peso (em kg, ex.: 70,5): "));

        
        System.out.println("\nDados da Pessoa:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());

        input.close();
    }
}
