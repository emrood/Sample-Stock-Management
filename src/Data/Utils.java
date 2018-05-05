/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Utils {

    private ArrayList<String> type;

    public Utils() {
        type = new ArrayList<>();
        type.add("Pas de selection");
        type.add("Aliments et boissons");
        type.add("Fruits en conserve");
        type.add("Desserts");
        type.add("Epicerie");
        type.add("Produit laitier");
        type.add("Vêtements");
        type.add("Meubles");
        type.add("Légumineuses et dérivés");
        type.add("Matériel informatique");
        type.add("Electroménager");
        type.add("Matériel électrique");
        type.add("Fournitures électriques");
        type.add("Produits de toilette");
        type.add("Produits pharmaceutiques");
        type.add("Articles en plastique");
        type.add("Viandes et poissons");
        type.add("Bijoux");
        type.add("Tabacs");
        type.add("Peintures");
        type.add("Chaussures");
        type.add("Pièces et accessoires Auto");
        type.add("Jeux videos - console");
        type.add("Articles de sport");
        type.add("Jouets");
    }

    public ArrayList<String> getType() {
        return this.type;
    }

    public void addType(String t) {
        this.type.add(t);
    }

    public static boolean RunProgram(String path) {
        try {
            //Process p = Runtime.getRuntime().exec(new String[]{"cmd /c start " +path});
            Process p = Runtime.getRuntime().exec(new String[]{path});
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}










