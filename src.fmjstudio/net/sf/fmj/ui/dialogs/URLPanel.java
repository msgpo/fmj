/*
 * URLPanel.java
 *
 * Created on June 20, 2007, 9:19 AM
 */

package net.sf.fmj.ui.dialogs;

import java.awt.*;

import net.sf.fmj.ui.objeditor.*;
import net.sf.fmj.ui.utils.*;

/**
 *
 * @author Ken Larson
 */
public class URLPanel extends javax.swing.JPanel implements ObjEditor
{
    public static String run(Frame parent)
    {
        final URLPanel p = new URLPanel();
        return (String) ObjEditorOKCancelDialog.run(parent, p, "", "Open URL");

    }

    private String url;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelURL;

    private javax.swing.JTextField textURL;

    // End of variables declaration//GEN-END:variables

    /** Creates new form URLPanel */
    public URLPanel()
    {
        initComponents();
    }

    public Component getComponent()
    {
        return this;
    }

    public Object getObject()
    {
        return url;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed"
    // desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        labelURL = new javax.swing.JLabel();
        textURL = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        labelURL.setText("URL:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(labelURL, gridBagConstraints);

        textURL.setPreferredSize(new java.awt.Dimension(250, 19));
        add(textURL, new java.awt.GridBagConstraints());

    }// </editor-fold>//GEN-END:initComponents

    public void setObjectAndUpdateControl(Object o)
    {
        this.url = (String) o;
    }

    public boolean validateAndUpdateObj()
    {
        url = null;

        ComponentValidator v = new ComponentValidator();
        try
        {
            v.validateNotEmpty(textURL, labelURL);

        } catch (ComponentValidationException e)
        {
            ErrorDialog.showError(this, e.getMessage());
            return false;
        }

        this.url = textURL.getText();

        return true;

    }

}
