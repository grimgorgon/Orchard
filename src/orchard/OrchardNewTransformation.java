/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orchard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author Chris
 */
public class OrchardNewTransformation extends javax.swing.JFrame {

    /**
     * Creates new form CilantroTransformation
     */
    public OrchardNewTransformation() {
        initComponents();
        addActionListeners();
        createCellTypeButtonGroup();
        createTfnMethodButtonGroup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfnMethodButtonGroup = new javax.swing.ButtonGroup();
        cellTypeButtonGroup = new javax.swing.ButtonGroup();
        cellTypeLabel = new javax.swing.JLabel();
        pJV53Button = new javax.swing.JRadioButton();
        wtButton = new javax.swing.JRadioButton();
        batchNameLabel = new javax.swing.JLabel();
        batchInputField = new javax.swing.JTextField();
        tfnEffLabel = new javax.swing.JLabel();
        tfnField = new javax.swing.JTextField();
        notebookLocationLabel = new javax.swing.JLabel();
        notebookNumLabel = new javax.swing.JLabel();
        startPageLabel = new javax.swing.JLabel();
        endPageLabel = new javax.swing.JLabel();
        notebookInputField = new javax.swing.JTextField();
        startPageInputField = new javax.swing.JTextField();
        endPageInputField = new javax.swing.JTextField();
        importTfnButton = new javax.swing.JButton();
        controlPlasmidLabel = new javax.swing.JLabel();
        controlPlasmidField = new javax.swing.JTextField();
        tfnMethodLabel = new javax.swing.JLabel();
        cuvetteButton = new javax.swing.JRadioButton();
        nineSixPlateButton = new javax.swing.JRadioButton();
        twoFiveWellPlateButton = new javax.swing.JRadioButton();
        newTfnBanner = new javax.swing.JLabel();
        createNewTfnButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfnGeneList = new javax.swing.JList();
        showGeneStatsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cellTypeLabel.setText("Electrocomptent Cell Type");

        pJV53Button.setText("M. smegmatis mc2155:pJV53");

        wtButton.setText("M. smegmatis mc2155 WT");

        batchNameLabel.setText("Batch Name:");

        batchInputField.setText("Batch");

        tfnEffLabel.setText("Tfn Efficiency:");

        tfnField.setText("Efficiency");

        notebookLocationLabel.setText("Notebook Location");

        notebookNumLabel.setText("Notebook #:");

        startPageLabel.setText("Start Page:");

        endPageLabel.setText("End Page:");

        notebookInputField.setText("Notebook #");

        startPageInputField.setText("Start Page");

        endPageInputField.setText("End Page");

        importTfnButton.setText("Import Gene Data CSV");

        controlPlasmidLabel.setText("Control Plasmid:");

        controlPlasmidField.setText("Plasmid");

        tfnMethodLabel.setText("Transformation Method");

        cuvetteButton.setText("Single Cuvette");

        nineSixPlateButton.setSelected(true);
        nineSixPlateButton.setText("96 Well Plate");

        twoFiveWellPlateButton.setText("25 Well Plate");

        newTfnBanner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        newTfnBanner.setText("New Transformation");

        createNewTfnButton.setText("Create New Transformation");

        tfnGeneList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(tfnGeneList);

        showGeneStatsButton.setText("Show Gene Stats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfnEffLabel)
                                    .addComponent(controlPlasmidLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfnField)
                                    .addComponent(controlPlasmidField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cuvetteButton)
                                    .addComponent(tfnMethodLabel)
                                    .addComponent(nineSixPlateButton)
                                    .addComponent(twoFiveWellPlateButton)))
                            .addComponent(createNewTfnButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(cellTypeLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wtButton)
                                    .addComponent(pJV53Button)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(batchNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(batchInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(notebookLocationLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(startPageLabel)
                                            .addComponent(notebookNumLabel)
                                            .addComponent(endPageLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(notebookInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(startPageInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(endPageInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newTfnBanner)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(importTfnButton)
                                .addGap(11, 11, 11)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(showGeneStatsButton)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newTfnBanner)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importTfnButton)
                    .addComponent(cellTypeLabel)
                    .addComponent(createNewTfnButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pJV53Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wtButton)
                            .addComponent(controlPlasmidLabel)
                            .addComponent(controlPlasmidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(batchNameLabel)
                                    .addComponent(batchInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfnEffLabel)
                                    .addComponent(tfnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notebookLocationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(notebookNumLabel)
                                    .addComponent(notebookInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(startPageLabel)
                                    .addComponent(startPageInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(endPageLabel)
                                    .addComponent(endPageInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfnMethodLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cuvetteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoFiveWellPlateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineSixPlateButton)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showGeneStatsButton)
                        .addGap(0, 11, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrchardNewTransformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrchardNewTransformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrchardNewTransformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrchardNewTransformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrchardNewTransformation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchInputField;
    private javax.swing.JLabel batchNameLabel;
    private javax.swing.ButtonGroup cellTypeButtonGroup;
    private javax.swing.JLabel cellTypeLabel;
    private javax.swing.JTextField controlPlasmidField;
    private javax.swing.JLabel controlPlasmidLabel;
    private javax.swing.JButton createNewTfnButton;
    private javax.swing.JRadioButton cuvetteButton;
    private javax.swing.JTextField endPageInputField;
    private javax.swing.JLabel endPageLabel;
    private javax.swing.JButton importTfnButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel newTfnBanner;
    private javax.swing.JRadioButton nineSixPlateButton;
    private javax.swing.JTextField notebookInputField;
    private javax.swing.JLabel notebookLocationLabel;
    private javax.swing.JLabel notebookNumLabel;
    private javax.swing.JRadioButton pJV53Button;
    private javax.swing.JButton showGeneStatsButton;
    private javax.swing.JTextField startPageInputField;
    private javax.swing.JLabel startPageLabel;
    private javax.swing.JLabel tfnEffLabel;
    private javax.swing.JTextField tfnField;
    private javax.swing.JList tfnGeneList;
    private javax.swing.ButtonGroup tfnMethodButtonGroup;
    private javax.swing.JLabel tfnMethodLabel;
    private javax.swing.JRadioButton twoFiveWellPlateButton;
    private javax.swing.JRadioButton wtButton;
    // End of variables declaration//GEN-END:variables

    /*batchInputField
     cellTypeButtonGroup
     controlPlasmidField
     endPageInputField
     startPageInputField
     tfnField
     tfnGeneList
     tfnMethodButtonGroup
     */
    public String getBatchInputField() {
        return batchInputField.getText();
    }

    public String getCellType() {
        return cellTypeButtonGroup.getSelection().getActionCommand();
    }

    public String getControlPlasmid() {
        return controlPlasmidField.getText();
    }

    public String getEndPage() {
        return endPageInputField.getText();
    }

    public String getStartPage() {
        return startPageInputField.getText();
    }

    public String getTfnField() {
        return tfnField.getText();
    }

    public String getTfnMethod() {
        return tfnMethodButtonGroup.getSelection().getActionCommand();
    }

    public JList getGeneList() {
        return tfnGeneList;
    }

    public void setGeneList(JList list) {
        tfnGeneList = list;
    }

    public String[] getGeneListGenes() {
        ListModel model = tfnGeneList.getModel();
        int modelSize = model.getSize();
        String[] genes = new String[modelSize];
        for (int i = 0; i < modelSize; i++) {
            genes[i] = model.getElementAt(i).toString();
        }
        return genes;
    }

    private void addActionListeners() {
        NewTransformationActionListener listener = new NewTransformationActionListener();

        createNewTfnButton.addActionListener(listener);
        showGeneStatsButton.addActionListener(listener);
        importTfnButton.addActionListener(listener);
    }

    private void createCellTypeButtonGroup() {
        cellTypeButtonGroup.add(pJV53Button);
        cellTypeButtonGroup.add(wtButton);
    }

    private void createTfnMethodButtonGroup() {

        tfnMethodButtonGroup.add(cuvetteButton);
        tfnMethodButtonGroup.add(twoFiveWellPlateButton);
        tfnMethodButtonGroup.add(nineSixPlateButton);
    }

    class NewTransformationActionListener implements ActionListener {

        private DatabaseConnector connection = null;
        private Connection dbConnection = null;

        private void connectToDatabase() {

            try {
                connection = new DatabaseConnector();
                dbConnection = connection.connectDB();
            } catch (Exception e) {
                System.out.println("Unable to connect to database");
            }
        }

        private void disconnectFromDatabase() {
            connection.closeDBConnection(dbConnection);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == showGeneStatsButton) {
                OrchardGeneStats geneStats = new OrchardGeneStats();
                connectToDatabase();
                //Query
                disconnectFromDatabase();

                geneStats.setColonyCount(null);
                geneStats.setKOProduced(null);
                geneStats.setShared(null);
                geneStats.setSharedWith(null);
                geneStats.setTfnNum(null);

                geneStats.setVisible(true);

            }

            if (source == importTfnButton) {
                try {
                    OrchardCSVFileOpener fileOpener = new OrchardCSVFileOpener();
                    fileOpener.setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(OrchardNewTransformation.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultListModel geneListModel = new DefaultListModel();

                //get info from csv
                //for each gene name
                geneListModel.addElement("");

                setGeneList(new JList(geneListModel));

            }

            if (source == createNewTfnButton) {
                connectToDatabase();

                new DatabaseConnector().deposit();
                disconnectFromDatabase();

            } else {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        }

    }

}