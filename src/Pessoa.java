
public class Pessoa {
    private String nome;
    private byte idade;
    private double altura;
    private double peso;
    private boolean atividadeFisica;

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        
        if (!"".equals(nome)) {
            this.nome = nome;
            
        }else{
        System.out.println("Nome não pode ser vazio");

        }
    }

    public byte getIdade(){
        return idade;
    }

    public void setIdade(byte idade){
        
        if (idade > 0) {
            this.idade = idade;
        }else
        System.out.println("Idade não pode ser menor ou igual a Zero");
        // JOptionPane.showMessageDialog(null, "Idade não pode ser < = 0");
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        
        if( altura > 0){
            this.altura = altura;
        }else
        System.out.println("Altura não pode ser menor ou igual a Zero");
        //JOptionPane.showMessageDialog(null, "Altura não pode ser < = 0");

    }
    
    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        
        if( peso >0 ){
            this.peso = peso;
        }else
        System.out.println("Peso não pode ser menor ou igual a Zero");
        //JOptionPane.showMessageDialog(null, "Peso não pode ser < = 0");

    }
}