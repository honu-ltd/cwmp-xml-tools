/*
 * File: IHMEditPanel.java
 * Project: TRminator
 * Author: Jeff Houle
 */
package trminator;

import javax.swing.JButton;
import threepio.tabler.container.IndexedHashMap;

/**
 * IHMEditPanel is a GUI editor for an IndexedHashMap,
 * for use with the ThreepioGUI.
 * @author jhoule
 * @see IndexedHashMap
 * @see TRminatorGUI
 */
public class IHMEditPanel extends javax.swing.JPanel
{

    private static int MODE_STD = -1, MODE_ADD = 0, MODE_SET = 1;
    private int mode = MODE_STD;
    IndexedHashMap<String, String> myMap;

    /** Creates new form IHMEditPanel
     * Adds the map's keys to the list
     * And sets label texts.
     * @param map - the IHM to edit
     * @param keyLabel - the string to set the key to on the form
     * @param valLabel - the string to set teh val to on the form.
     */
    public IHMEditPanel(IndexedHashMap<String, String> map, String keyLabel, String valLabel)
    {
        initComponents();
        myMap = map;
        lstKeys.setListData(myMap.toKeyArray());
        setFormByMode(mode = MODE_STD);

        lblKey.setText(keyLabel);
        lblVal.setText(valLabel);
    }

    /**
     * Changes the form based on what the user is doing at the moment.
     * @param m - the mode to change based on.
     */
    private void setFormByMode(int m)
    {
        boolean btnPwr = false;

        JButton[] btns =
        {
            btnOK, btnPlus, btnMinus, btnCancel, btnChange, btnDn, btnUp
        };
        switch (m)
        {
            case -1:
                pnlAdd.setEnabled(false);
                lstKeys.setEnabled(true);
                btnPwr = true;


                break;
            default:
                pnlAdd.setEnabled(true);
                btnPwr = false;
                break;
        }

        for (int i = 0; i < pnlAdd.getComponents().length; i++)
        {
            pnlAdd.getComponents()[i].setEnabled(pnlAdd.isEnabled());
        }

        for (int j = 0; j < btns.length; j++)
        {
            btns[j].setEnabled(btnPwr);
        }

        btnCancel.setEnabled((mode >= 0));
        btnOK.setEnabled((mode >= 0));

        // turn the parts off that we don't want.
        switch (mode)
        {

            case -1:
                btnChange.setEnabled(!lstKeys.isSelectionEmpty());

                break;
            case 0:

                lstKeys.setEnabled(false);
                txtCol.setText("");
                txtXML.setText("");
                break;

            case 1:
                lstKeys.setEnabled(false);

                txtCol.setEnabled(false);
                break;
        }
    }

    /**
     * updates the list based on the map's keys.
     */
    private void updateList()
    {
        lstKeys.setListData(myMap.toKeyArray());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstKeys = new javax.swing.JList();
        btnChange = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        pnlAdd = new javax.swing.JPanel();
        lblKey = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();
        txtCol = new javax.swing.JTextField();
        txtXML = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnDn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(394, 242));

        lstKeys.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstKeys.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstKeys.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstKeysValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstKeys);

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnPlus.setText("Add");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setText("Remove");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        pnlAdd.setEnabled(false);

        lblKey.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblKey.setText("Column Name:");

        lblVal.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblVal.setText("Name in XML:");

        txtCol.setEnabled(false);

        txtXML.setEnabled(false);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKey, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(lblVal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(txtXML, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblKey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtXML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        btnUp.setText("Move Up");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnDn.setText("Move Dn");
        btnDn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDn, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinus)))
                    .addComponent(pnlAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnDn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btnMinus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * changes the fields when the user picks a key in the list.
     * @param evt - the event of the user choosing a key.
     */
    private void lstKeysValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_lstKeysValueChanged
    {//GEN-HEADEREND:event_lstKeysValueChanged
        String temp = (String) lstKeys.getSelectedValue();
        txtCol.setText(temp);
        txtXML.setText(myMap.get(temp));
        btnChange.setEnabled(true);
    }//GEN-LAST:event_lstKeysValueChanged

    /**
     * A value for a key is being changed, so the mode is set accordingly.
     * @param evt - the event of the user clicking the change button.
     */
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnChangeActionPerformed
    {//GEN-HEADEREND:event_btnChangeActionPerformed
        setFormByMode(mode = MODE_SET);
    }//GEN-LAST:event_btnChangeActionPerformed

    /**
     * A value is being added to the map, so the mode is set accordingly.
     * @param evt - the even for the user clicking the + button.
     */
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPlusActionPerformed
    {//GEN-HEADEREND:event_btnPlusActionPerformed

        setFormByMode(mode = MODE_ADD);

    }//GEN-LAST:event_btnPlusActionPerformed

    /**
     * Something's been confirmed, so the new value is put on the list,
     * if it's valid.
     * @param evt - the event for the user clicking the OK button.
     */
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOKActionPerformed
    {//GEN-HEADEREND:event_btnOKActionPerformed
        if (!(txtCol.getText() == null || txtXML.getText() == null))
        {
            myMap.put(txtCol.getText(), txtXML.getText());

            updateList();
            setFormByMode(mode = MODE_STD);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * Something is beging cancelled, so the mode is changed back,
     * and form values changed.
     * @param evt - the event of the Cancel button being clicked.
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        txtXML.setText(myMap.get((String) lstKeys.getSelectedValue()));
        txtCol.setText((String) lstKeys.getSelectedValue());
        setFormByMode(mode = MODE_STD);
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * Something is being removed, so the removal takes place after some
     * validation.
     * @param evt - the event of the - button being clicked.
     */
    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMinusActionPerformed
    {//GEN-HEADEREND:event_btnMinusActionPerformed
        if (!lstKeys.isSelectionEmpty())
        {
            myMap.removeByKey((String) lstKeys.getSelectedValue());

            updateList();
        }

    }//GEN-LAST:event_btnMinusActionPerformed

    /**
     * The user is moving a key up in the list. After validation, this is carried out.
     * @param evt - the event of the up button being clicked.
     */
    private void btnUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpActionPerformed
    {//GEN-HEADEREND:event_btnUpActionPerformed
        int index = lstKeys.getSelectedIndex();
        if (myMap.swap(index, index - 1))
        {
            updateList();
            lstKeys.setSelectedIndex(index - 1);
        }
    }//GEN-LAST:event_btnUpActionPerformed

    /**
     * The user is moving a key down in the list. After validation, this is carried out.
     * @param evt - the event of the down button being clicked.
     */
    private void btnDnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDnActionPerformed
    {//GEN-HEADEREND:event_btnDnActionPerformed
        int index = lstKeys.getSelectedIndex();
        if (myMap.swap(index, index + 1))
        {
            updateList();
            lstKeys.setSelectedIndex(index + 1);
        }
    }//GEN-LAST:event_btnDnActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDn;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnUp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKey;
    private javax.swing.JLabel lblVal;
    private javax.swing.JList lstKeys;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JTextField txtCol;
    private javax.swing.JTextField txtXML;
    // End of variables declaration//GEN-END:variables
}
