/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.poo.gestaocomprasacesso;

import br.edu.ifnmg.poo.gestaocomprasacesso.Endereco.TipoLogradouro;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class GestaoComprasAcesso {

    public static void main(String[] args) throws Exception {
        /*
        CREDENCIAIS:
        1. ana.zaira@mail.com, asdf123, true;
        2. beatriz.yana@mail.com, 123asdf, false;
        3. cecilia.xerxes@mail.com, 123123, false;
        */
        Credencial c1 = new Credencial();
        c1.setEmail("ana.zaira@mail.com");
        c1.setSenha("asdf123");
        c1.setAdministrador(true);
        Credencial c2 = new Credencial();
        c2.setEmail("beatriz.yana@mail.com");
        c2.setSenha("123asdf");
        c2.setAdministrador(false);
        Credencial c3 = new Credencial();
        c3.setEmail("cecilia.xerxes@mail.com");
        c3.setSenha("123123");
        c3.setAdministrador(false);
        
        // ---------------------------------------------

        /*
        1. Ana Zaira, 29/01/2000;
        2. Beatriz Yana, 28/01/1999;
        3. Cecília Xerxes, 27/01/1998;
        */
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Zaira");
        LocalDate n1 = LocalDate.parse("29/01/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        p1.setNascimento(n1);
        p1.setCredencial(c1);
        Pessoa p2 = new Pessoa();
        p2.setNome("Beatriz Yana");
        LocalDate n2 = LocalDate.parse("28/01/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        p2.setNascimento(n2);
        p2.setCredencial(c2);
        Pessoa p3 = new Pessoa();
        p3.setNome("Cecília Xerxes");
        LocalDate n3 = LocalDate.parse("27/01/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        p3.setNascimento(n3);
        p3.setCredencial(c3);
        
        // ---------------------------------------------

        /*
        1. Rua A1, 1011, Santa Ana I, 39401111;
        2. Rua A2, 1012, Santa Ana II, 39401112;
        3. Rua B, 2022, Santa Beatriz, 39402222;
        4. Rua C1, 3031, Santa Cecília I, 39403331;
        5. Rua C2, 3032, Santa Cecília II, 39403332;
        6. Rua C3, 3033, Santa Cecília III, 39403333;
        */
        Endereco e1 = new Endereco();
        e1.setLogradouro("Rua A1");
        e1.setTipoLogradouro(TipoLogradouro.RUA);
        e1.setNumero(1011);
        e1.setBairro("Santa Ana I");
        e1.setCep(39401111);
        Endereco e2 = new Endereco();
        e2.setLogradouro("Rua A2");
        e2.setTipoLogradouro(TipoLogradouro.RUA);
        e2.setNumero(1012);
        e2.setBairro("Santa Ana II");
        e2.setCep(39401112);
        Endereco e3 = new Endereco();                       
        e3.setLogradouro("Rua B");
        e3.setTipoLogradouro(TipoLogradouro.RUA);
        e3.setNumero(2022);
        e3.setBairro("Santa Beatriz");
        e3.setCep(39402222);
        Endereco e4 = new Endereco();
        e4.setLogradouro("Rua C1");
        e4.setTipoLogradouro(TipoLogradouro.RUA);
        e4.setNumero(3031);
        e4.setBairro("Santa Cecília I");
        e4.setCep(39403331);
        Endereco e5 = new Endereco();
        e5.setLogradouro("Rua C2");
        e5.setTipoLogradouro(TipoLogradouro.RUA);
        e5.setNumero(3032);
        e5.setBairro("Santa Cecília II");
        e5.setCep(39403332);
        Endereco e6 = new Endereco();
        e6.setLogradouro("Rua C3");
        e6.setTipoLogradouro(TipoLogradouro.RUA);
        e6.setNumero(3033);
        e6.setBairro("Santa Cecília III");
        e6.setCep(39403333);
        
        p1.adicionarEndereco(e1);
        p1.adicionarEndereco(e3);
        p2.adicionarEndereco(e4);
        p3.adicionarEndereco(e5);
        p3.adicionarEndereco(e6);
        
        //-----------------------------------
        
        /*
        1. Pessoa 1:
        ◦ (38) 12341234;
        2. Pessoa 2:
        ◦ (38) 23452345;
        ◦ (38) 923452345;
        3. Pessoa 3:
        ◦ (38) 934563456;
        ◦ (38) 834563456;
        */
        Telefone t1 = new Telefone();
        t1.setDdd((byte)38);
        t1.setNumero(12341234);
        t1.setFixo(true);
        p1.adicionarTelefone(t1);
        Telefone t2 = new Telefone();
        t2.setDdd((byte)38);
        t2.setNumero(23452345);
        t2.setFixo(true);
        Telefone t3 = new Telefone();
        t3.setDdd((byte)38);
        t3.setNumero(923452345);
        t3.setFixo(false);
        p2.adicionarTelefone(t2);
        p2.adicionarTelefone(t3);
        Telefone t4 = new Telefone();
        t4.setDdd((byte)38);
        t4.setNumero(934563456);
        t4.setFixo(false);
        Telefone t5 = new Telefone();
        t5.setDdd((byte)38);
        t5.setNumero(834563456);
        t5.setFixo(true);
        p3.adicionarTelefone(t4);
        p3.adicionarTelefone(t5);
        
        //-----------------------------------------
       
        /*
        1. Abacaxi, R$ 1.99;
        2. Banana, R$ 2.99;
        3. Caqui, R$ 3.99;
        4. Damasco, R$ 4.99;
        5. Espinafre, R$ 5.99.
        */
        
        Produto prdt1 = new Produto();
        prdt1.setNome("Abacaxi");
        prdt1.setPreco(new BigDecimal("1.99"));
        Produto prdt2 = new Produto();
        prdt2.setNome("Banana");
        prdt2.setPreco(new BigDecimal("2.99"));
        Produto prdt3 = new Produto();
        prdt3.setNome("Caqui");
        prdt3.setPreco(new BigDecimal("3.99"));
        Produto prdt4 = new Produto();
        prdt4.setNome("Damasco");
        prdt4.setPreco(new BigDecimal("4.99"));
        Produto prdt5 = new Produto();
        prdt5.setNome("Espinafre");
        prdt5.setPreco(new BigDecimal("5.99"));
        
        //----------------------------------------
        
        /*
        1. Pessoa 1:
        ◦ Compra 1: 000.100.101
        ▪ 11 x produto 1;
        2. Pessoa 2:
        ◦ Compra 1: 000.200.202
        ▪ 11 x produto 2;
        ▪ 12 x produto 3;
        ▪ 13 x produto 4;
        ▪ 14 x produto 5;
        ◦ Compra 2: 000.200.212
        ▪ 21 x produto 1;
        ▪ 22 x produto 3;
        ▪ 23 x produto 5;
        3. Pessoa 3:
        ◦ Compra 1: 000.300.303
        ▪ 31 x produto 1;
        ▪ 32 x produto 3;
        ▪ 33 x produto 5.
        */
        
        Compra cmp1 = new Compra();
        cmp1.setNotaFiscal("000100101");
        cmp1.setPessoa(p1);
        p1.adicionarCompra(cmp1);
        Item i1 = new Item();
        i1.setProduto(prdt1);
        i1.setQuantidade(11);
        cmp1.adicionarItens(i1);
        
        Compra cmp2 = new Compra();
        cmp2.setNotaFiscal("000200202");
        cmp2.setPessoa(p2);
        p2.adicionarCompra(cmp2);
        Item i2 = new Item();
        i2.setProduto(prdt2);
        i2.setQuantidade(11);
        cmp2.adicionarItens(i2);
        Item i3 = new Item();
        i3.setProduto(prdt3);
        i3.setQuantidade(12);
        cmp2.adicionarItens(i3);
        Item i4 = new Item();
        i4.setProduto(prdt4);
        i4.setQuantidade(13);
        cmp2.adicionarItens(i4);
        Item i5 = new Item();
        i5.setProduto(prdt5);
        i5.setQuantidade(14);
        cmp2.adicionarItens(i5);
        Compra cmp3 = new Compra();
        cmp3.setNotaFiscal("000200212");
        cmp3.setPessoa(p2);
        p2.adicionarCompra(cmp3);
        Item i6 = new Item();
        i6.setProduto(prdt1);
        i6.setQuantidade(21);
        cmp3.adicionarItens(i6);
        Item i7 = new Item();
        i7.setProduto(prdt3);
        i7.setQuantidade(22);
        cmp3.adicionarItens(i7);
        Item i8 = new Item();
        i8.setProduto(prdt5);
        i8.setQuantidade(23);
        cmp3.adicionarItens(i8);
        
        Compra cmp4 = new Compra();
        cmp4.setNotaFiscal("000300303");
        cmp4.setPessoa(p3);
        p3.adicionarCompra(cmp4);
        Item i9 = new Item();
        i9.setProduto(prdt1);
        i9.setQuantidade(31);
        cmp4.adicionarItens(i9);
        Item i10 = new Item();
        i10.setProduto(prdt3);
        i10.setQuantidade(32);
        cmp4.adicionarItens(i10);
        Item i11 = new Item();
        i11.setProduto(prdt5);
        i11.setQuantidade(33);
        cmp4.adicionarItens(i11);
        
        //-----------------------------------------------------
        System.out.println("\nCredenciais:\n");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        System.out.println("\nPessoas:\n");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\nEndereços:\n");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
        
        System.out.println("\nTelefones:\n");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        
        System.out.println("\nProdutos:\n");
        System.out.println(prdt1);
        System.out.println(prdt2);
        System.out.println(prdt3);
        System.out.println(prdt4);
        System.out.println(prdt5);
        
        System.out.println("\nCompras:\n");
        System.out.println(cmp1);
        System.out.println(cmp2);
        System.out.println(cmp3);
        System.out.println(cmp4);
        
    }
}
