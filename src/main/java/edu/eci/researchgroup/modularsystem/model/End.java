/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.researchgroup.modularsystem.model;

/**
 *
 * @author Julian David Devia Serna
 */
public class End {

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the selection
     */
    public String getSelection() {
        return selection;
    }

    /**
     * @param selection the selection to set
     */
    public void setSelection(String selection) {
        this.selection = selection;
    }

    /**
     * @return the startAndDevelopmentRemarks
     */
    public String getStartAndDevelopmentRemarks() {
        return startAndDevelopmentRemarks;
    }

    /**
     * @param startAndDevelopmentRemarks the startAndDevelopmentRemarks to set
     */
    public void setStartAndDevelopmentRemarks(String startAndDevelopmentRemarks) {
        this.startAndDevelopmentRemarks = startAndDevelopmentRemarks;
    }
    private String text;
    private String selection;
    private String startAndDevelopmentRemarks;
}