
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;


/**
 *
 * @author Hanood
 */
public class AnotherGUI extends javax.swing.JFrame {

    static String args[];
    ArithmeticExpressionsParser parser;

    /**
     * Creates new form AnotherGUI
     */
    public AnotherGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Input = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        OutputPanel = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ParseTree = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Errors = new javax.swing.JTextArea();
        Check = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CS407 Compiler");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 5, true));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 51, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Input Program");

        Input.setColumns(20);
        Input.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Input.setRows(5);
        Input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jScrollPane3.setViewportView(Input);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Run1.jpg"))); // NOI18N
        jButton4.setText(" Compile");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, new java.awt.Color(0, 204, 102), java.awt.Color.green, java.awt.Color.green));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("From File...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        OutputPanel.setBackground(new java.awt.Color(255, 255, 255));
        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 51, 0))); // NOI18N

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Show");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Parse Tree");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Output");

        ParseTree.setForeground(new java.awt.Color(255, 0, 0));
        ParseTree.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 1, true));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Errors.setColumns(20);
        Errors.setEditable(false);
        Errors.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        Errors.setRows(5);
        Errors.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 1, true));
        jScrollPane1.setViewportView(Errors);

        Check.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout OutputPanelLayout = new javax.swing.GroupLayout(OutputPanel);
        OutputPanel.setLayout(OutputPanelLayout);
        OutputPanelLayout.setHorizontalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParseTree, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(OutputPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addGap(18, 18, 18)
                .addGroup(OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutputPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                .addContainerGap())
        );
        OutputPanelLayout.setVerticalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6))
                    .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParseTree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        try {

            ANTLRStringStream input = new ANTLRStringStream(Input.getText());
// Create a lexer attached to that input stream
            ArithmeticExpressionsLexer lexer = new ArithmeticExpressionsLexer(input);
// Create a stream of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
// Create a parser attached to the token stream
            parser = new ArithmeticExpressionsParser(tokens);
// Invoke the program rule in get return value

            //Start rule
            ArithmeticExpressionsParser.startgeneralArithExpr_return r = parser.startgeneralArithExpr();
            //Start rule

            CommonTree t = (CommonTree) r.getTree();

            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(t);
            System.out.println(st);

            // Formatting DOT file (optional: use stt instead of st) (Slows Compilation)
            String stt = st.toString();

            //stt = stt.replaceFirst("bgcolor=\"lightgrey\"", "bgcolor=\"0 .4 .7\"");
//                String s2 = s1.replace("fontsize=12","fontsize=12");
//                String s3 = s2.replace("fontname=\"Helvetica-bold\"","fontname=\"Helvetica-bold\"");
            //stt = stt.replaceFirst("fontcolor=\"blue\"", "fontcolor=\"black\"");
//                String s5 = s4.replace("color=\"black\"","color=\"black\"");                
            //stt = stt.replaceFirst("style=\"filled, solid, bold\"", "style=\"filled, solid, regular\"");
//                String s7 = s6.replace("color=\"black\"","color=\"black\"");
//                String s8 = s7.replace("fillcolor=\"white\"","fillcolor=\"white\"");
//                String s9 = s8.replace("width=.25, height=.25","width=.25, height=.25");
            //stt = stt.replaceFirst("style=\"bold\"", "style=\"regular\"");

            PrintWriter output = new PrintWriter(new File("Dot.dot"));
            output.print(stt);
            output.close();
            System.out.println("abc");

            // Process process = new ProcessBuilder("C:\\PathToExe\\MyExe.exe","param1","param2").start();
            Process process = new ProcessBuilder("DOT.BAT").start();

            // Error Field
            String msg = parser.s;
            System.out.println("lol");
            if (msg.contains("line")) {
                System.out.println("falied");
                Errors.setForeground(Color.red);
                Errors.setText("Error: \n" + msg);
                Check.setIcon(new ImageIcon("False.JPG"));
            } else {
                System.out.println("Success");
                Errors.setForeground(new Color(0, 102, 10));
                Errors.setText("Compiled Successfully \n" + msg);
                Check.setIcon(new ImageIcon("Correct.JPG"));
            }
            ParseTree.setIcon(null);
            ParseTree.setText(null);

        } catch (Exception e) {
        }

        //  indx++;}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jFileChooser1 = new JFileChooser();
            int choice = jFileChooser1.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                java.io.File file = jFileChooser1.getSelectedFile();
                java.util.Scanner scan = new java.util.Scanner(file);
                String t = "";

                while (scan.hasNext()) {

                    t += scan.nextLine();
                    t += "\n";

                }

                Input.setText(t);

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
            int WIDTH = ParseTree.getWidth();
            int HEIGHT = ParseTree.getHeight();
            // Image I = null;
            Image I = ImageIO.read(new File("Parse.png")).getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);

            ImageIcon img = new ImageIcon(I);
            String msg = parser.s;
            if (msg.contains("line")) {
                ParseTree.setText("No Parse Tree Available");
            } else {
                ParseTree.setIcon(img);
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        AnotherGUI.args = args;
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnotherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnotherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnotherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnotherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AnotherGUI MyForm = new AnotherGUI();
                MyForm.setLocationRelativeTo(null);
                MyForm.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Check;
    private javax.swing.JTextArea Errors;
    private javax.swing.JTextArea Input;
    private javax.swing.JPanel OutputPanel;
    private javax.swing.JLabel ParseTree;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
