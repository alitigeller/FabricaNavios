/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import br.ifes.edu.poo.fabricanavios.cdp.Cruzeiro;
import br.ifes.edu.poo.fabricanavios.cdp.Navio;

/**
 *
 * @author Alessandro Eller
 */
public class FactoryCruzeiro extends NavioPassageirosFactory{

    @Override
    public Navio Create() {
        Navio cruzeiro = new Cruzeiro();
        return cruzeiro;
    }
    
}
