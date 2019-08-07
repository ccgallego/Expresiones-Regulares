/*Proyecto de Gramaticas y Lenguajes Formales del programa de Ingenieria
  de Sistemas y Computacion de la UTP.
  Basicamente el programa utiliza las librerias pattern y matcher que son para evaluar si
  una cadena es valida dada una expresion regular.

  Presentado por: Cristian C Gallego
  Codigo: 1112630610

*/
package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Cristian C Gallego
 */
public class InterfazExpresiones extends javax.swing.JFrame {

    
    public InterfazExpresiones() {
        initComponents();
        lbSignificado.setText("Aceptas cadenas que empiezan en 'x' seguido de x's y y's y termina en una 'y'. ");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCampoValidacion = new javax.swing.JTextField();
        btnEvaluar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxExpresion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPrueba = new javax.swing.JTextField();
        btnProbar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbSignificado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expresiones Regulares - CCGR");
        setName("ExpresionesRegulares"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Validando Expresiones Regulares", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        txtCampoValidacion.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        txtCampoValidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoValidacionActionPerformed(evt);
            }
        });

        btnEvaluar.setText("Evaluar Cadena");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Expresión Regular");

        cbxExpresion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxExpresion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x(xy|yx)*y", "(a|b)*c", "(0|1)+", "(\\W|^)[\\w.\\-]{0,25}@(yahoo|hotmail|gmail)\\.com(\\W|$)", "^([01]?[0-9]|2[0-3]):[0-5][0-9]$", "0*10*", "(00)*|(1(11)*)", "(0|1)*01", "(aa)*(bb)*b", "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "b*ab*", "(a|b)*ba(a|b)*", "b*ab*ab*", "1(0|1)*00|(0(0|1)*11)", " ", " ", " ", " ", " ", " " }));
        cbxExpresion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxExpresionItemStateChanged(evt);
            }
        });

        jLabel3.setText("Resultado evaluación: ");

        lbEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Escriba otra expresion regular que desee probar"));

        txtPrueba.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnProbar.setText("Evaluar");
        btnProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrueba)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCampoValidacion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCampoValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cbxExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))))))
        );

        jLabel2.setText("CRISTIAN CAMILO GALLEGO R");

        lbSignificado.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSignificado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbSignificado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampoValidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoValidacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoValidacionActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
       String cadena = txtCampoValidacion.getText();
       
       switch(cbxExpresion.getSelectedIndex()){
           
           case 0: 
                Pattern pat = Pattern.compile("x(xy|yx)*y");
                Matcher mat = pat.matcher(cadena);
                if(mat.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");
                }
                break;
                
           case 1:
                Pattern pat1 = Pattern.compile("(a|b)*c");
                Matcher mat1 = pat1.matcher(cadena);
                if(mat1.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
                
           case 2:
               Pattern pat2 = Pattern.compile("(0|1)+");
                Matcher mat2 = pat2.matcher(cadena);
                if(mat2.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
                
           case 3: 
               Pattern pat3 = Pattern.compile("(\\W|^)[\\w.\\-]{0,25}@(yahoo|hotmail|gmail)\\.com(\\W|$)");//^[^@]+@[^@]+\\.[a-zA-Z]{2,}$
                Matcher mat3 = pat3.matcher(cadena);
                if(mat3.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
                
           case 4: 
               Pattern pat4 = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
                Matcher mat4 = pat4.matcher(cadena);
                if(mat4.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
                
           case 5: 
                Pattern pat5 = Pattern.compile("0*10*");
                Matcher mat5 = pat5.matcher(cadena);
                if(mat5.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
                
           case 6:
                Pattern pat6 = Pattern.compile("(00)*|(1(11)*)");
                Matcher mat6 = pat6.matcher(cadena);
                if(mat6.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
                
           case 7:    
                Pattern pat7 = Pattern.compile("(0|1)*01");
                Matcher mat7 = pat7.matcher(cadena);
                if(mat7.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
                
           case 8:
                Pattern pat8 = Pattern.compile("(aa)*(bb)*b");
                Matcher mat8 = pat8.matcher(cadena);
                if(mat8.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;  
                
           case 9:
                Pattern pat9 = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$");
                Matcher mat9 = pat9.matcher(cadena);
                if(mat9.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
           case 10:
                Pattern pat0 = Pattern.compile("b*ab*");
                Matcher mat0 = pat0.matcher(cadena);
                if(mat0.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
           case 11:
                Pattern pat11 = Pattern.compile("(a|b)*ba(a|b)*");
                Matcher mat11 = pat11.matcher(cadena);
                if(mat11.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
           case 12:
                Pattern pat12 = Pattern.compile("b*ab*ab*");
                Matcher mat12 = pat12.matcher(cadena);
                if(mat12.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;
           case 13:
                Pattern pat13 = Pattern.compile("1(0|1)*00|(0(0|1)*11)");
                Matcher mat13 = pat13.matcher(cadena);
                if(mat13.matches()){
                    lbEstado.setText("Cadena Aceptada");
                }else{
                    lbEstado.setText("Cadena NO aceptada por la expresion regular");           
                }
                break;   
                
              
       }
       if(cadena.equals("")){
         lbEstado.setText("Ingrese alguna cadena a evaluar");
     }
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCampoValidacion.setText("");
        txtPrueba.setText("");
        lbEstado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbxExpresionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxExpresionItemStateChanged
        
        if(evt.getItem().equals("x(xy|yx)*y")){
            lbSignificado.setText("Aceptas cadenas de x's y y's y termina en una y.");
        }
        
        if(evt.getItem().equals("(0|1)+")){
            lbSignificado.setText("Representa el conjunto de todas las posibles cadenas que se"
                    + " pueden formar con ‘0’ y ‘1’.");
        }
        
        if(evt.getItem().equals("(a|b)*c")){
            lbSignificado.setText("Acepta cadenas de a's y b's y termina en una sola c .");
        }
        
        if(evt.getItem().equals("(\\W|^)[\\w.\\-]{0,25}@(yahoo|hotmail|gmail)\\.com(\\W|$)")){
            lbSignificado.setText("Comprueba si la cadena es un correo electronico valido. ");
        }
        
        if(evt.getItem().equals("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")){
            lbSignificado.setText("Comprueba si la cadena es de formato de 24 horas HH:mm. ");
        }
        
        if(evt.getItem().equals("0*10*")){
            lbSignificado.setText("Acepta cadenas de 0's seguido por un 1 y termina en 0's = 0^n 1 0^m. ");
        }
        
        if(evt.getItem().equals("(00)*|(1(11)*)")){
            lbSignificado.setText("Acepta todas las cadenas pares de 0’s ó cadenas impares de 1’s. ");
        }
        
        if(evt.getItem().equals("(0|1)*01")){
            lbSignificado.setText("Acepta todas las cadenas de 0's y 1's terminado siempre en 01. ");
        }
        
        if(evt.getItem().equals("(aa)*(bb)*b")){
            lbSignificado.setText("Acepta cadenas pares de a's y b's y termina en una b. ");
        }
        
        if(evt.getItem().equals("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$")){
            lbSignificado.setText("Comprueba si la fecha leida tiene formato dd/mm/aaaa.");
        }
        if(evt.getItem().equals("b*ab*")){
            lbSignificado.setText("Expresion que acepta solo exactamente una 'a' , rodeada de b's");
        }
        if(evt.getItem().equals("(a|b)*ba(a|b)*")){
            lbSignificado.setText("Acepta cadenas que contengan siempre 'ba' .");
        }
        if(evt.getItem().equals("b*ab*ab*")){
            lbSignificado.setText("Acepta cadenas que tengan exactamente 2 a's .");
        }
        if(evt.getItem().equals("1(0|1)*00|(0(0|1)*11)")){
            lbSignificado.setText("Comprueba que si la cadena empieza en 1 termine en 00 y si empieza en 0 que termine en 11");
        }
        
        
        
        
    }//GEN-LAST:event_cbxExpresionItemStateChanged

    private void btnProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarActionPerformed
           String cadena = txtCampoValidacion.getText();
       
           Pattern pat = Pattern.compile(txtPrueba.getText());
           Matcher mat = pat.matcher(cadena);
           
           if(mat.matches()){
               lbEstado.setText("Cadena Aceptada");
           }else{
               lbEstado.setText("Cadena NO aceptada por la expresion regular");
           }
           
           if(txtPrueba.getText().equals("") || cadena.equals("")){
               lbEstado.setText("Ingrese la expresion regular o cadena a evaluar");
           }
       
    }//GEN-LAST:event_btnProbarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new InterfazExpresiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEvaluar;
    public static javax.swing.JButton btnLimpiar;
    public static javax.swing.JButton btnProbar;
    public static javax.swing.JComboBox<String> cbxExpresion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbSignificado;
    public static javax.swing.JTextField txtCampoValidacion;
    public static javax.swing.JTextField txtPrueba;
    // End of variables declaration//GEN-END:variables
}
