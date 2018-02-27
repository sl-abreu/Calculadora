/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

/**
 *
 * <pre>
 * Interfaz gráfica con funcionalidad de una calculadora científica,
 * es capaz de evaluar expresiones respetando la jerarquía de operaciones
 * o el orden de los paréntesis en caso de que existan.
 * 
 * Realiza tres recorridos a la expresión, en la primera se revisa la sintaxis
 * de la expresión dada por el usuario, en caso de que sea correcta se realiza
 * el segundo recorrido, en el que se convierte la expresión de notación infija
 * a notación postfija, con el fin de hacer la posterior evaluación posible. Por
 * último, se evalúa la expresión y se muestra el valor correspondiente.
 * 
 * En caso de que la sintaxis fuera incorrecta, se muestra un mensaje apropiado
 * al usuario y no se pasa al segundo y tercer recorrido.
 * </pre>
 * @author SLGA
 */
public class CalculadoraConBotones extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraVista
     */
    public CalculadoraConBotones() {
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

        expTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        evaluaBut = new javax.swing.JButton();
        limpBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resTxt = new javax.swing.JTextField();
        sieteBut = new javax.swing.JButton();
        cuatroBut = new javax.swing.JButton();
        unoBut = new javax.swing.JButton();
        ochoBut = new javax.swing.JButton();
        cincoBut = new javax.swing.JButton();
        dosBut = new javax.swing.JButton();
        nueveBut = new javax.swing.JButton();
        seisBut = new javax.swing.JButton();
        tresBut = new javax.swing.JButton();
        ceroBut = new javax.swing.JButton();
        puntoBut = new javax.swing.JButton();
        sumBut = new javax.swing.JButton();
        restBut = new javax.swing.JButton();
        multBut = new javax.swing.JButton();
        divBut = new javax.swing.JButton();
        abreParBut = new javax.swing.JButton();
        cierraParBut = new javax.swing.JButton();
        bckspBut = new javax.swing.JButton();
        potBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        expTxt.setEditable(false);
        expTxt.setText("   ");

        jLabel1.setText("Expresión a evaluar:");

        evaluaBut.setText("=");
        evaluaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluaButActionPerformed(evt);
            }
        });

        limpBut.setText("Limpiar todo");
        limpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpButActionPerformed(evt);
            }
        });

        jLabel2.setText("Resultado:");

        resTxt.setEditable(false);
        jScrollPane1.setViewportView(resTxt);

        sieteBut.setText("7");
        sieteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteButActionPerformed(evt);
            }
        });

        cuatroBut.setText("4");
        cuatroBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroButActionPerformed(evt);
            }
        });

        unoBut.setText("1");
        unoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoButActionPerformed(evt);
            }
        });

        ochoBut.setText("8");
        ochoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoButActionPerformed(evt);
            }
        });

        cincoBut.setText("5");
        cincoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoButActionPerformed(evt);
            }
        });

        dosBut.setText("2");
        dosBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosButActionPerformed(evt);
            }
        });

        nueveBut.setText("9");
        nueveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveButActionPerformed(evt);
            }
        });

        seisBut.setText("6");
        seisBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisButActionPerformed(evt);
            }
        });

        tresBut.setText("3");
        tresBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresButActionPerformed(evt);
            }
        });

        ceroBut.setText("0");
        ceroBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroButActionPerformed(evt);
            }
        });

        puntoBut.setText(".");
        puntoBut.setMaximumSize(new java.awt.Dimension(37, 32));
        puntoBut.setMinimumSize(new java.awt.Dimension(37, 32));
        puntoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoButActionPerformed(evt);
            }
        });

        sumBut.setText("+");
        sumBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumButActionPerformed(evt);
            }
        });

        restBut.setText("-");
        restBut.setMaximumSize(new java.awt.Dimension(37, 32));
        restBut.setMinimumSize(new java.awt.Dimension(37, 32));
        restBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restButActionPerformed(evt);
            }
        });

        multBut.setText("*");
        multBut.setMaximumSize(new java.awt.Dimension(37, 32));
        multBut.setMinimumSize(new java.awt.Dimension(37, 32));
        multBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButActionPerformed(evt);
            }
        });

        divBut.setText("/");
        divBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButActionPerformed(evt);
            }
        });

        abreParBut.setText("(");
        abreParBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreParButActionPerformed(evt);
            }
        });

        cierraParBut.setText(")");
        cierraParBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierraParButActionPerformed(evt);
            }
        });

        bckspBut.setText("<¬");
        bckspBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckspButActionPerformed(evt);
            }
        });

        potBut.setText("^");
        potBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sieteBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cuatroBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unoBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(puntoBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ochoBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cincoBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dosBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ceroBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nueveBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seisBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tresBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(evaluaBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(potBut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bckspBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpBut)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sumBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(abreParBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(divBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cierraParBut, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(restBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sieteBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuatroBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unoBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntoBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ochoBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cincoBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dosBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ceroBut)
                            .addComponent(evaluaBut)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nueveBut)
                            .addComponent(bckspBut)
                            .addComponent(potBut)
                            .addComponent(limpBut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sumBut)
                                        .addComponent(restBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seisBut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tresBut)
                                            .addComponent(multBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(divBut))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cierraParBut)
                                    .addComponent(abreParBut)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evaluaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluaButActionPerformed
        String resS, exp=expTxt.getText();
                if(!exp.isEmpty() && ProcesadorExpresiones.revisaExpresion(exp)){
                    Double resD=ProcesadorExpresiones.evaluaPostFija(ProcesadorExpresiones.conviertePostFija(exp));
                    if(!resD.isNaN())
                        resS=""+resD;
                    else
                        resS="¡Valor indefinido!";
                }
                else
                    resS="Error de sintaxis, favor de revisar la expresión.";
                resTxt.setText(resS);
    }//GEN-LAST:event_evaluaButActionPerformed

    private void limpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpButActionPerformed
        resTxt.setText("");
        expTxt.setText("");
    }//GEN-LAST:event_limpButActionPerformed

    private void sumButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumButActionPerformed
        expTxt.setText(expTxt.getText().concat("+"));
    }//GEN-LAST:event_sumButActionPerformed

    private void restButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restButActionPerformed
        expTxt.setText(expTxt.getText().concat("-"));
    }//GEN-LAST:event_restButActionPerformed

    private void multButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multButActionPerformed
        expTxt.setText(expTxt.getText().concat("*"));
    }//GEN-LAST:event_multButActionPerformed

    private void divButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButActionPerformed
        expTxt.setText(expTxt.getText().concat("/"));
    }//GEN-LAST:event_divButActionPerformed

    private void abreParButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreParButActionPerformed
        expTxt.setText(expTxt.getText().concat("("));
    }//GEN-LAST:event_abreParButActionPerformed

    private void cierraParButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierraParButActionPerformed
        expTxt.setText(expTxt.getText().concat(")"));
    }//GEN-LAST:event_cierraParButActionPerformed

    private void puntoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoButActionPerformed
        expTxt.setText(expTxt.getText().concat("."));
    }//GEN-LAST:event_puntoButActionPerformed

    private void bckspButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckspButActionPerformed
        String exp=expTxt.getText();
        if(!exp.isEmpty()){
            exp=exp.substring(0, exp.length()-1);
            expTxt.setText(exp);
        }
    }//GEN-LAST:event_bckspButActionPerformed

    private void potButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potButActionPerformed
        expTxt.setText(expTxt.getText().concat("^"));
    }//GEN-LAST:event_potButActionPerformed

    private void sieteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteButActionPerformed
        expTxt.setText(expTxt.getText().concat("7"));
    }//GEN-LAST:event_sieteButActionPerformed

    private void cuatroButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroButActionPerformed
        expTxt.setText(expTxt.getText().concat("4"));
    }//GEN-LAST:event_cuatroButActionPerformed

    private void unoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoButActionPerformed
        expTxt.setText(expTxt.getText().concat("1"));
    }//GEN-LAST:event_unoButActionPerformed

    private void ochoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoButActionPerformed
        expTxt.setText(expTxt.getText().concat("8"));
    }//GEN-LAST:event_ochoButActionPerformed

    private void cincoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoButActionPerformed
        expTxt.setText(expTxt.getText().concat("5"));
    }//GEN-LAST:event_cincoButActionPerformed

    private void dosButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosButActionPerformed
        expTxt.setText(expTxt.getText().concat("2"));
    }//GEN-LAST:event_dosButActionPerformed

    private void ceroButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroButActionPerformed
        expTxt.setText(expTxt.getText().concat("0"));
    }//GEN-LAST:event_ceroButActionPerformed

    private void nueveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveButActionPerformed
        expTxt.setText(expTxt.getText().concat("9"));
    }//GEN-LAST:event_nueveButActionPerformed

    private void seisButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisButActionPerformed
        expTxt.setText(expTxt.getText().concat("6"));
    }//GEN-LAST:event_seisButActionPerformed

    private void tresButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresButActionPerformed
        expTxt.setText(expTxt.getText().concat("3"));
    }//GEN-LAST:event_tresButActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraConBotones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abreParBut;
    private javax.swing.JButton bckspBut;
    private javax.swing.JButton ceroBut;
    private javax.swing.JButton cierraParBut;
    private javax.swing.JButton cincoBut;
    private javax.swing.JButton cuatroBut;
    private javax.swing.JButton divBut;
    private javax.swing.JButton dosBut;
    private javax.swing.JButton evaluaBut;
    private javax.swing.JTextField expTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpBut;
    private javax.swing.JButton multBut;
    private javax.swing.JButton nueveBut;
    private javax.swing.JButton ochoBut;
    private javax.swing.JButton potBut;
    private javax.swing.JButton puntoBut;
    private javax.swing.JTextField resTxt;
    private javax.swing.JButton restBut;
    private javax.swing.JButton seisBut;
    private javax.swing.JButton sieteBut;
    private javax.swing.JButton sumBut;
    private javax.swing.JButton tresBut;
    private javax.swing.JButton unoBut;
    // End of variables declaration//GEN-END:variables
}