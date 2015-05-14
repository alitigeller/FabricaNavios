/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import br.ifes.edu.poo.fabricanavios.cdp.Cruzeiro;
import br.ifes.edu.poo.fabricanavios.cdp.EnumNavio;
import br.ifes.edu.poo.fabricanavios.cdp.Escuna;
import br.ifes.edu.poo.fabricanavios.cdp.Navio;
import br.ifes.edu.poo.fabricanavios.cdp.NavioCargaGeral;
import br.ifes.edu.poo.fabricanavios.cdp.NavioGraneleiro;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alessandro Eller
 */
public class FactoryTest {
    
    Factory factory;
    
    @Before
    
    public void Before()
    {
        factory = new Factory();
    
    }
   
    
    
    @Test 
   public void criarCruzeiro()
   {
        Navio resultado = factory.create(EnumNavio.Cruzeiro);
       Assert.assertEquals(Cruzeiro.class ,resultado.getClass());
   }
   
   @Test 
   public void criarEscuna()
   {
        Navio resultado = factory.create(EnumNavio.Escuna);
       Assert.assertEquals(Escuna.class ,resultado.getClass());
   }
   
   @Test 
   public void criarCargaGeral()
   {
        Navio resultado = factory.create(EnumNavio.CargaGeral);
       Assert.assertEquals(NavioCargaGeral.class ,resultado.getClass());
   }
   
   @Test 
   public void criarGraneleiro()
   {
        Navio resultado = factory.create(EnumNavio.Graneleiro);
       Assert.assertEquals(NavioGraneleiro.class ,resultado.getClass());
   }
}