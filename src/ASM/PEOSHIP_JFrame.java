/**
	File name: IST261_project
	Short description: PEOSHIP_Management class
	IST 261 Assignment: PEOSHIP MANAGERMENT
	@author Hoang Phan
	Oct 1st, 2020
*/
package ASM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

/**
 *
 * @author Hoang Phan
 */
public class PEOSHIP_JFrame extends javax.swing.JFrame {
    ArrayList<PEOSHIP_Managerment> lisUID=new ArrayList<>();
    int position;
    DefaultTableModel model=new DefaultTableModel();

    /**
     * Creates new form Hoang Phan
     */
    public PEOSHIP_JFrame() {
        initComponents();
        model=(DefaultTableModel) jTable1.getModel();

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfmUID = new javax.swing.JTextField();
        tfProgram = new javax.swing.JTextField();
        tfCODE = new javax.swing.JTextField();
        tfDescription = new javax.swing.JTextField();
        tflAmount_Provided = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnstart = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnfoward = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jbpresent = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnfind = new javax.swing.JButton();
        btnopen = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("HL-Comic1unicode", 0, 24)); // NOI18N
        jLabel1.setText("PEOSHIP Managerment");

        jLabel2.setText("UID");

        jLabel3.setText("Program");

        jLabel4.setText("CODE");

        jLabel5.setText("Description");

        jLabel6.setText("Amount_Provided");

        tfmUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmUIDActionPerformed(evt);
            }
        });

        btnstart.setText("|<");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        btnback.setText("<<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnfoward.setText(">>");
        btnfoward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfowardActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnstart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfoward)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbpresent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstart)
                    .addComponent(btnback)
                    .addComponent(btnfoward)
                    .addComponent(btnlast)
                    .addComponent(jbpresent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM/icon/new-file-icon.png"))); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM/icon/icon_save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM/icon/delete-file-icon.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnfind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM/icon/Search-icon.png"))); // NOI18N
        btnfind.setText("Find");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        btnopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM/icon/open-file-icon.png"))); // NOI18N
        btnopen.setText("Add");
        btnopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopenActionPerformed(evt);
            }
        });

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM/icon/cancel-icon.png"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(btnfind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnopen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfind, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnopen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Program", "CODE", "Description", "Amount_Provided"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tflAmount_Provided, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfmUID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCODE, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfDescription))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfmUID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCODE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tflAmount_Provided, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        try {
            position=0;
            display(position);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "you get error"+e);
        }
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
         try {
            position=lisUID.size()-1;
            display(position);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "you get error"+e);
        }
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        try {
            if(position>0){
            position--;
            display(position);}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "you get error"+e);
        }
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnfowardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfowardActionPerformed
         try {
            if(position<lisUID.size()-1){
            position++;
            display(position);}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "you get error"+e);
        }
    }//GEN-LAST:event_btnfowardActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
       deleteall();
    }//GEN-LAST:event_btnnewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row=jTable1.getSelectedRow();
            if(row>=0){
                position=row;
                display(position);
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
         String UID = tfmUID.getText();
        String Program = tfProgram.getText();
         String Description=tfDescription.getText();
        int CODE=Integer.parseInt(tfCODE.getText());
        double Amount_Provided=Double.parseDouble(tflAmount_Provided.getText());
        
        try {
           
            FileOutputStream out = new FileOutputStream("PEOSHIP_UID.txt");

             out.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "you get error"+e);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       
        try{
            if(lisUID.isEmpty()){
            JOptionPane.showMessageDialog(null, "still want to delete ?");
            return;
        }
        
        int n=JOptionPane.showConfirmDialog(null, "sure want to delete");
        if(n==0){
            lisUID.remove(position);
            addTable();
             JOptionPane.showMessageDialog(null, "done delete");
        }
        if(lisUID.isEmpty()){
            deleteall();
        }else{
            position=0;
            display(position);
        }
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, "you get error"+e);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
       String person=JOptionPane.showInputDialog("new sign in ");
        try {

            boolean kq=false;
            for(PEOSHIP_Managerment x:lisUID){
                if(x.getUID().equalsIgnoreCase(person)){
                    position=lisUID.indexOf(x);
                    display(position);
                    kq=true;
                    
                    break;   
                }
            }
            if(!kq){
                JOptionPane.showMessageDialog(null, "cannot find this UID:  "+person);
            }
            else{
                 JOptionPane.showMessageDialog(null, "UID here:"+person);
            }
            deleteall();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " you get error"+e);
        }
    }//GEN-LAST:event_btnfindActionPerformed

    private void btnopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopenActionPerformed
        
         try {
            
            FileInputStream in = new FileInputStream("PEOSHIP_UID.txt");
            int size=in.available();
            byte[] buffer=new byte[size];
            in.read(buffer);
            
            byte[] bufferr=new byte[size];
            in.read(bufferr);
            
            byte[] bufferrr=new byte[size];
            in.read(bufferrr);
            
            
           try {
           
            String UID=tfmUID.getText();
            String Program=tfProgram.getText();
            String Description=tfDescription.getText();
            int CODE=Integer.parseInt(tfCODE.getText());
            double Amount_Provided=Double.parseDouble(tflAmount_Provided.getText());
            
            lisUID.add(new PEOSHIP_Managerment(UID, Program, Description, CODE, Amount_Provided));
            
      
            model.addRow(new Object[] {UID,Program,Description,CODE, Amount_Provided});
            position=lisUID.size()-1;
            display(position);
        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, "you get error"+e);
        }
            
            
            in.close();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, ex.toString());
        } 

    }//GEN-LAST:event_btnopenActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       try {
          int question=JOptionPane.showConfirmDialog(null, "sure want to delete");
          if(question==0){
            FileOutputStream fos = new FileOutputStream("PEOSHIP_UID.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            
            oos.writeObject(lisUID);
            
            oos.flush();
            fos.flush();
            oos.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "saved");
          }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void tfmUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmUIDActionPerformed
        
    }//GEN-LAST:event_tfmUIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
import java.io.FileReader;
import com.opencsv.CSVReader;
public class ReadFromCSV {
   public static void main(String args[]) throws Exception {
      //Instantiating the CSVReader class
      CSVReader reader = new CSVReader(new FileReader("C:\\Users\\hoang\\Desktop\\New folder (2)\\IST261-project\\PEOSHIPSAMPHIB.csv"));
      //Reading the contents of the csv file
      StringBuffer buffer = new StringBuffer();
      String line[];
      while ((line = reader.readNext()) != null) {
         for(int i = 0; i<line.length; i++) {
            System.out.print(line[i]+" ");
         }
         System.out.println(" ");
      }
   }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PEOSHIP_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PEOSHIP_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PEOSHIP_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PEOSHIP_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create new form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PEOSHIP_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnfoward;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnopen;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnstart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jbpresent;
    private javax.swing.JTextField tfCODE;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfProgram;
    private javax.swing.JTextField tflAmount_Provided;
    private javax.swing.JTextField tfmUID;
    // End of variables declaration//GEN-END:variables

    private void display(int position) {
       tfmUID.setText(lisUID.get(position).getUID());
       tfProgram.setText(lisUID.get(position).getProgram());
       tfDescription.setText(lisUID.get(position).getDescription());
       tfCODE.setText(lisUID.get(position).getCODE()+"");
       tflAmount_Provided.setText(lisUID.get(position).getAmount_Provided()+"");
       
       jbpresent.setText("Record "+(position+1)+" of "+ lisUID.size());
       jTable1.setRowSelectionInterval(position, position);
    }

    private void addTable() {
        model.setRowCount(0);
        for(PEOSHIP_Managerment x:lisUID){
            model.addRow(new Object[] {x.getUID(),x.getProgram(),x.getDescription(),x.getCODE(),x.getAmount_Provided()});
        }
    }

    private void deleteall() {
         tfDescription.setText("");
        tfProgram.setText("");
        tflAmount_Provided.setText("");
        tfmUID.setText("");
        tfCODE.setText("");
        jbpresent.setText("...");
        position=-1;
    }
}
