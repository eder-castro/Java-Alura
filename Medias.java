public class Medias {
    public static void main(String[] args) {
        // 1-Crie um programa que realize a média de duas notas decimais e exiba o
        // resultado
        double n1 = 5.7;
        double n2 = 7.8;
        double media = (int) (n1 + n2) / 2;
        String mensagem = String.format("A média entre %.2f e %.2f é: %.2f\n", n1, n2, media);
        System.out.println(mensagem);

        // 3-Declare uma variável do tipo char (letra) e uma variável do tipo String
        // (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'A';
        String frase = "Esta é a letra ";
        System.out.println(frase + letra);

        // 4-Declare uma variável do tipo double precoProduto e uma variável do tipo int
        // (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e
        // apresente o resultado em uma mensagem.
        double precoProduto = 127.50;
        int quant = 13;
        double valorTotal = precoProduto * quant;
        System.out.println("\nO valor do produto  : " + precoProduto);
        System.out.println("\nO valor total para " + quant + " produtos é de : " + valorTotal);

        // 5-Declare uma variável do tipo double valorEmDolares. Atribua um valor em
        // dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado
        // formatado.
        double dolar = 4.94;
        double valorEmDolar = valorTotal * dolar;
        System.out.println("O Valor total para " + quant + " produtos, em dólar, é: " + valorEmDolar);

        // 6-Declare uma variável do tipo double precoOriginal.
        // Atribua um valor em reais a essa variável, representando o preço original de
        // um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto e atribua
        // um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o
        // novo preço com desconto.
        double percentualDesconto = 10;
        double valorDesconto = precoProduto * (percentualDesconto / 100);
        double precoComDesconto = precoProduto - valorDesconto;
        System.out.println("O novo preço do produto com desconto é: " + precoComDesconto);
        System.out.println(
                "O novo Valor total para " + quant + " produtos, em dólar, é: " + precoComDesconto * dolar * quant);
    }
}
