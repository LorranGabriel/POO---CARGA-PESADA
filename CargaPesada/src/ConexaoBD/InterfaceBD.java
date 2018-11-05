/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.util.ArrayList;

/**
 *
 * @author 20181bsi0172
 */
public interface InterfaceBD {
    public ArrayList select();
    public void insert(Object updateObj);
    public void delet(int id);
    public void update(Object updateObj);
}
