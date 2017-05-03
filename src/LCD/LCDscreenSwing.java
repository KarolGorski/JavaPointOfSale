
package LCD;

import Service.ESCListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Karol
 */
public class LCDscreenSwing extends javax.swing.JFrame{
Service.ServiceSetup sup;
    /**
     * Creates new form LCDscreen
     */
    public LCDscreenSwing(Service.ServiceSetup sup) {
        initComponents();
        this.sup
                =sup;
        PriceArea
                .setText(Double
                        .toString(0));
        super
                .addKeyListener(
                        new ESCListener(sup));
        setFocusable(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        WindowToPrintSum = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfScannedProducts = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        NameOfProgram = new javax.swing.JLabel();
        SummingText = new javax.swing.JLabel();
        TextAboutList = new javax.swing.JLabel();
        SumAllUpButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrderList = new javax.swing.JTextArea();
        PriceArea = new javax.swing.JTextField();
        ErrorsField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        WindowToPrintSum.setColumns(20);
        WindowToPrintSum.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        WindowToPrintSum.setRows(5);
        jScrollPane2.setViewportView(WindowToPrintSum);

        ListOfScannedProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListOfScannedProducts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ListOfScannedProducts.setSelectionForeground(new java.awt.Color(51, 153, 255));
        ListOfScannedProducts.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(ListOfScannedProducts);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameOfProgram.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        NameOfProgram.setLabelFor(this);
        NameOfProgram.setText("PointOfSale");

        SummingText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SummingText.setText("Total:");

        TextAboutList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TextAboutList.setText("List of Items: ");

        SumAllUpButton.setText("Sum all up(ESC)");
        SumAllUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumAllUpButtonActionPerformed(evt);
            }
        });

        OrderList.setEditable(false);
        OrderList.setColumns(20);
        OrderList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        OrderList.setRows(5);
        jScrollPane3.setViewportView(OrderList);

        PriceArea.setEditable(false);
        PriceArea.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        ErrorsField.setEditable(false);

        jLabel1.setText("Errors");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAboutList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameOfProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SummingText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PriceArea, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ErrorsField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SumAllUpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAboutList)
                    .addComponent(NameOfProgram))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(ErrorsField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(SummingText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SumAllUpButton)
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumAllUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumAllUpButtonActionPerformed
        sup.timeToStop();
    }//GEN-LAST:event_SumAllUpButtonActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ErrorsField;
    private javax.swing.JList<String> ListOfScannedProducts;
    private javax.swing.JLabel NameOfProgram;
    private javax.swing.JTextArea OrderList;
    private javax.swing.JTextField PriceArea;
    private javax.swing.JButton SumAllUpButton;
    private javax.swing.JLabel SummingText;
    private javax.swing.JLabel TextAboutList;
    private javax.swing.JTextArea WindowToPrintSum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public JTextArea getOrderList() {
        return OrderList;
    }
    public JTextField getPriceArea() {
        return PriceArea;
    }
    public JTextField getErrorsField() {
        return ErrorsField;
    }
}
