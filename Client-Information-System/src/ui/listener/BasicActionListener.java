/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.listener;

/**
 *
 * @author rodel
 */
public interface BasicActionListener {

    public void onAdd();

    public boolean onSaveAdd();

    public void onCancelAdd();

    public void onEdit();

    public boolean onSaveEdit();

    public void onCancelEdit();
}
